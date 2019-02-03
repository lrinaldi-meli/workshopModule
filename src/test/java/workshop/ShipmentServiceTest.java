package workshop;

import static org.junit.Assert.*;

import org.junit.Test;
import workshop.dto.Shipment;
import workshop.service.ShipmentService;


public class ShipmentServiceTest {

    @Test
    public void getRandomShipmentTest() {
        Shipment shipment = ShipmentService.getInstance().getShipment();
        assertNotNull(shipment);
    }


}
