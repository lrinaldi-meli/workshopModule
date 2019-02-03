package workshop.factory;


import workshop.constants.LogisticType;
import workshop.constants.ShippingMode;
import workshop.constants.Status;
import workshop.constants.Substatus;
import workshop.dto.Agency;
import workshop.dto.Dimension;
import workshop.dto.Shipment;
import workshop.dto.ShippingAddress;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Optional;


public enum ShipmentFactory {

    NULL_NULL_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(null)
                    .withSubstatus(null)
                    .withStatusHistory(null)
                    .withShippingOption(null)
                    .withCreatedBy("receiver")
                    .withLogisticType(LogisticType.DROP_OFF.getId())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },
    NULL_SHIPMENT {
        @Override
        public Shipment create() {
            return null;
        }
    },
    READY_TO_SHIP_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .withSenderId(12345l)
                    .withShippingAddress(ShippingAddress.builder().withAgency(new Agency()).build())
                    .withDimensions(Dimension.builder().withHeight(BigDecimal.valueOf(1)).withLength(BigDecimal.valueOf(1)).withWidth(BigDecimal.valueOf(1)).build())
                    .withServiceId("22")
                    .withLogisticType(LogisticType.DROP_OFF.getId())
                    .withTrackingMethod("12321")
                    .withTrackingNumber("111111111111")
                    .build();
        }
    },
    READY_TO_SHIP_CROSS_DOCKING_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .withLogisticType(LogisticType.CROSS_DOCKING.getId())
                    .withSenderId(12345l)
                    .build();
        }
    },
    READY_TO_SHIP_AUTHORIZED_BY_CARRIER_CROSS_DOCKING_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.AUTHORIZED_BY_CARRIER.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .withLogisticType(LogisticType.CROSS_DOCKING.getId())
                    .withSenderId(12345l)
                    .build();
        }
    },
    READY_TO_SHIP_AUTHORIZED_BY_CARRIER_DROP_OFF_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.AUTHORIZED_BY_CARRIER.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .withLogisticType(LogisticType.DROP_OFF.getId())
                    .withSenderId(12345l)
                    .build();
        }
    },
    READY_TO_SHIP_AUTHORIZED_BY_CARRIER_XD_DROP_OFF_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.AUTHORIZED_BY_CARRIER.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .withLogisticType(LogisticType.XD_DROP_OFF.getId())
                    .withSenderId(12345l)
                    .build();
        }
    },
    READY_TO_SHIP__RETURNING_TO_SENDER_CROSS_DOCKING_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.RETURNING_TO_SENDER.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .withLogisticType(LogisticType.CROSS_DOCKING.getId())
                    .build();
        }
    },
    READY_TO_SHIP_FULFILLMENT_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .withLogisticType(LogisticType.FULFILLMENT.getId())
                    .build();
        }
    },

    READY_TO_SHIP_READY_FOR_PICKUP_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.READY_FOR_PICKUP.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withLogisticType(LogisticType.CROSS_DOCKING.getId())
                    .build();
        }
    },

    INVOICE_PENDING_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.INVOICE_PENDING.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    HANDLING_INVOICE_PENDING_SHIPMENT_FOR_FULFILLMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.HANDLING.getId())
                    .withSubstatus(Substatus.INVOICE_PENDING.getId())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    RTS_INVOICE_PENDING_SHIPMENT_FOR_FULFILLMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.HANDLING.getId())
                    .withSubstatus(Substatus.INVOICE_PENDING.getId())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    READY_TO_SHIP_PICKED_UP_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.PICKED_UP.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    IN_HUB_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.IN_HUB.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    READY_TO_SHIP_READY_TO_PRINT_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.READY_TO_PRINT.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withDateFirstPrinted(Optional.empty())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .build();
        }
    },
    SHIPMENT_WITHOUT_DATE_FIRST_PRINTED {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withDateFirstPrinted(Optional.empty())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },
    PRINTED_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Substatus.PRINTED.getParent().getId())
                    .withSubstatus(Substatus.PRINTED.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    PENDING_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.PENDING.getId())
                    .withSubstatus(null)
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    HANDLING_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.HANDLING.getId())
                    .withSubstatus(null)
                    .withStatusHistory(StatusHistoryFactory.DATE_HANDLING.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    HANDLING_MANUFACTURING_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.HANDLING.getId())
                    .withSubstatus(Substatus.MANUFACTURING.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_HANDLING.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    SHIPPED_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.SHIPPED.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_SHIPPED.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    SHIPPED_SHIPMENT_ME1 {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.SHIPPED.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_SHIPPED.create())
                    .withShippingMode(ShippingMode.ME1.getId())
                    .build();
        }
    },

    SHIPPED_SHIPMENT_WITH_FIRST_VISIT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.SHIPPED.getId())
                    .withSubstatus(Substatus.BAD_ADDRESS.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_SHIPPED_AND_DATE_FIRST_VISIT.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    DELIVERED_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.DELIVERED.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_DELIVERED.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },


    WAITING_FOR_WITHDRAWAL_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Substatus.WAITING_FOR_WITHDRAWAL.getParent().getId())
                    .withSubstatus(Substatus.WAITING_FOR_WITHDRAWAL.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_SHIPPED.create())
                    .withSubstatusHistory(SubstatusHistoryFactory.WAITING_FOR_WITHDRAWAL.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },

    CUSTOM {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.CUSTOM.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .build();
        }
    },
    NOT_SPECIFIED {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.NOT_SPECIFIED.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .build();
        }
    },
    NOT_DELIVERED_SHIPMENT {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.NOT_DELIVERED.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_NOT_DELIVERED.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    },
    HANDLING_SHIPMENT_ME1 {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.HANDLING.getId())
                    .withShippingMode(ShippingMode.ME1.getId())
                    .build();
        }
    },
    IN_WAREHOUSE_SHIPMENT_ME2 {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.IN_WAREHOUSE.getId())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withLogisticType(LogisticType.FULFILLMENT.getId())
                    .withSite("MLB")
                    .build();
        }
    }, PENDING_SHIPMENT_SUBSTATUS_CREATING_ROUTE {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.PENDING.getId())
                    .withSubstatus(Substatus.CREATING_ROUTE.getId())
                    .withStatusHistory(StatusHistoryFactory.DATE_READY_TO_SHIP.create())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .build();
        }
    }, READY_TO_SHIP_SHIPMENT_WAITING_FOR_CARRIER_AUTHORIZATION {
        @Override
        public Shipment create() {
            return getBaseShipmentBuilder()
                    .withStatus(Status.READY_TO_SHIP.getId())
                    .withSubstatus(Substatus.WAITING_FOR_CARRIER_AUTHORIZATION.getId())
                    .withShippingMode(ShippingMode.ME2.getId())
                    .withShippingOption(ShippingOptionFactory.STANDARD.create())
                    .build();
        }
    };


    public abstract Shipment create();

    protected Shipment.Builder getBaseShipmentBuilder() {
        return Shipment.builder()
                .withId(123456789l)
                .withServiceId("61")
                .withDateCreated(ZonedDateTime.now().minusDays(2)) // It should be before of notificationDate
                .withDateFirstPrinted(Optional.ofNullable(ZonedDateTime.now().minusDays(1)))
                .withSite("MLA")
                .withStatus(Status.PENDING.getId())
                .withLogisticType(LogisticType.DROP_OFF.getId())
                .withStatusHistory(StatusHistoryFactory.DEFAULT.create());
    }
}
