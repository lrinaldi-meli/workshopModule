package workshop.factory;


import workshop.dto.StatusHistory;

import java.time.ZonedDateTime;

/**
 * Created by ncferrucci on 11/8/17.
 */
public enum StatusHistoryFactory {
    DATE_SHIPPED {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(null,  ZonedDateTime.now().minusDays(6), null, ZonedDateTime.now().minusDays(5), null, null, null, null);
        }
    },
    DATE_DELIVERED {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(null, null, null, ZonedDateTime.now().minusDays(5), null, ZonedDateTime.now().minusDays(4), null, null);
        }
    },
    DATE_NOT_DELIVERED  {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(null, null, null, ZonedDateTime.now().minusDays(5), null,null , null, ZonedDateTime.now().minusDays(4));
        }
    },
    DATE_HANDLING {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(ZonedDateTime.now().minusDays(1), null, null, null, null, null, null, null);
        }
    },
    FUTURE_DATE_SHIPPED {
        @Override
        public StatusHistory create() {
            return getStatusHistory(null,null, null, ZonedDateTime.now().plusDays(20), null, null, null, null);
        }
    },
    PAST_DATE_SHIPPED {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(null,null,null, ZonedDateTime.now().minusDays(20),null,null,null,null);
        }
    },
    DATE_SHIPPED_AND_DATE_FIRST_VISIT {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(null,null,null, ZonedDateTime.now(), ZonedDateTime.now(),null,null,null);
        }
    },
    DEFAULT {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(null,null,null,null,null,null,null,null);
        }
    },
    ALL_DATES_BUT_HANDLING {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(null,ZonedDateTime.now(),ZonedDateTime.now(),ZonedDateTime.now(),ZonedDateTime.now(),ZonedDateTime.now(),ZonedDateTime.now(),ZonedDateTime.now());
        }
    },
    ALL_FIXED_DATES {
        @Override
        public StatusHistory create() {
            ZonedDateTime referenceDate = ZonedDateTime.parse("2017-04-03T06:00:00Z");
            return this.getStatusHistory(referenceDate,referenceDate,referenceDate,referenceDate,referenceDate,referenceDate,referenceDate,referenceDate);
        }
    },
    DATE_HANDLING_BUT_NO_DATE_SHIPPED {
        @Override
        public StatusHistory create() {
            ZonedDateTime referenceDate = ZonedDateTime.parse("2017-04-03T06:00:00Z");
            return this.getStatusHistory(referenceDate,referenceDate,referenceDate,null,null,referenceDate,referenceDate,referenceDate);
        }
    },

    DATE_READY_TO_SHIP {
        @Override
        public StatusHistory create() {
            ZonedDateTime referenceDate = ZonedDateTime.parse("2017-04-03T06:00:00Z");
            return this.getStatusHistory(referenceDate,referenceDate,referenceDate,null,null,null,null,null);
        }
    },

    DATE_CANCELLED {
        @Override
        public StatusHistory create() {
            ZonedDateTime referenceDate = ZonedDateTime.now();
            return this.getStatusHistory(referenceDate,referenceDate,referenceDate,null,null,null,referenceDate,null);
        }
    },
    ALL_DIFFERENT_DATES {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(ZonedDateTime.now(),ZonedDateTime.now().minusDays(1),ZonedDateTime.now().plusDays(3),ZonedDateTime.now().minusMinutes(1),ZonedDateTime.now().minusMonths(1),ZonedDateTime.now().minusHours(8),ZonedDateTime.now().minusMonths(2),ZonedDateTime.now().minusHours(10));
        }
    },
    DELIVERED_DATE {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(null,null,null,null,null,ZonedDateTime.parse("2000-04-03T06:00:00Z"),null,null);
        }
    },
    DATE_HANDLING_TODAY {
        @Override
        public StatusHistory create() {
            return this.getStatusHistory(ZonedDateTime.now(), null, null, null, null, null, null, null);
        }
    };

    public abstract StatusHistory create();

    protected StatusHistory getStatusHistory(ZonedDateTime dateHandling, ZonedDateTime dateReadyToShip, ZonedDateTime dateFirstPrinted, ZonedDateTime dateShipped, ZonedDateTime dateFirstVisit, ZonedDateTime dateDelivered, ZonedDateTime dateCancelled, ZonedDateTime dateNotDelivered) {
        return StatusHistory.builder()
                .withDateHandling(dateHandling)
                .withDateReadyToShip(dateReadyToShip)
                .withDateShipped(dateShipped)
                .withDateFirstVisit(dateFirstVisit)
                .withDateDelivered(dateDelivered)
                .withDateCancelled(dateCancelled)
                .withDateNotDelivered(dateNotDelivered)
                .build();
    }
}
