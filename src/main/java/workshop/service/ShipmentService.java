package workshop.service;

import workshop.dto.Shipment;
import workshop.factory.ShipmentFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

public class ShipmentService {

    private static ShipmentService INSTANCE;

    public static ShipmentService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ShipmentService();
        }
        return INSTANCE;
    }

    private static Map<Integer, Supplier<Shipment>> shipmentCreators = new HashMap<>();

    static {
        shipmentCreators.put(0, ShipmentFactory.NULL_NULL_SHIPMENT::create);
        shipmentCreators.put(1, ShipmentFactory.READY_TO_SHIP_SHIPMENT::create);
        shipmentCreators.put(2, ShipmentFactory.NULL_SHIPMENT::create);
    }

    public Shipment getShipment(Long id) {
        Shipment shipment = randomizeCreation();
        if (shipment != null) shipment.setId(id);
        return shipment;
    }

    private Shipment randomizeCreation() {
        Random random = new Random();
        return shipmentCreators.get(random.nextInt(3)).get();
    }
}
