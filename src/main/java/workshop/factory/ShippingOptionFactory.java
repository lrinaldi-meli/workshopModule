package workshop.factory;

import workshop.dto.EstimatedDeliveryDates;
import workshop.dto.EstimatedDeliveryTime;
import workshop.dto.ShippingOption;

/**
 * Created by ncferrucci on 7/26/18.
 */
public enum ShippingOptionFactory {


    STANDARD {
        @Override
        public ShippingOption create() {
            return getBaseShippingOption()
                    .build();
        }
    };

    public abstract ShippingOption create();

    protected ShippingOption.Builder getBaseShippingOption() {
        return ShippingOption.builder().
                withEstimatedDeliveryTime(EstimatedDeliveryTime.builder().withType("known_frame").withUnit("hour").build())
                .withEstimatedHandlingLimit(EstimatedDeliveryDates.builder().withOffset(240).build())
                .withEstimatedDeliveryFinal(EstimatedDeliveryDates.builder().withOffset(480).build())
                .withEstimatedDeliveryLimit(EstimatedDeliveryDates.builder().build())
                .withEstimatedDeliveryLimit(EstimatedDeliveryDates.builder().build())
                .withEstimatedDeliveryExtended(EstimatedDeliveryDates.builder().withOffset(72).build());
    }

}
