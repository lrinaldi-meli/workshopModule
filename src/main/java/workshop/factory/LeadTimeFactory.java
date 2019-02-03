package workshop.factory;



import workshop.dto.EstimatedDeliveryDates;
import workshop.dto.EstimatedDeliveryTime;
import workshop.dto.LeadTime;

import java.time.ZonedDateTime;
import java.util.Optional;

/**
 * Created by ncferrucci on 7/31/18.
 */
public enum LeadTimeFactory {


    DEFAULT {
        @Override
        public LeadTime create() {

            LeadTime leadTime = getBaseLeadTimeBuilder()
                    .withEstimatedDeliveryTime(EstimatedDeliveryTime.builder().withType("known_frame").withUnit("hour").build())
                    .withEstimatedDeliveryExtended(EstimatedDeliveryDates.builder().withOffset(72).build())
                    .withEstimatedDeliveryFinal(EstimatedDeliveryDates.builder().withOffset(480).build())
                    .withEstimatedDeliveryLimit(EstimatedDeliveryDates.builder().build())
                    .build();
            return leadTime;
        }
    },
    DEFAULT_WITH_ESTIMATED_DELIVERY_TIME_DATE {
        @Override
        public LeadTime create() {
            EstimatedDeliveryTime estimatedDeliveryTime = EstimatedDeliveryTime.builder()
                    .withType("known_frame")
                    .withUnit("hour")
                    .withDate(Optional.of(ZonedDateTime.parse("2018-09-20T00:00:00.032Z")))
                    .build();

            LeadTime leadTime = getBaseLeadTimeBuilder()
                    .withEstimatedDeliveryTime(estimatedDeliveryTime)
                    .withEstimatedDeliveryExtended(EstimatedDeliveryDates.builder().withOffset(72).build())
                    .withEstimatedDeliveryFinal(EstimatedDeliveryDates.builder().withOffset(480).build())
                    .withEstimatedDeliveryLimit(EstimatedDeliveryDates.builder().build())
                    .build();
            return leadTime;
        }
    };

    public abstract LeadTime create();

    protected LeadTime.Builder getBaseLeadTimeBuilder() {
        return LeadTime.builder().withEstimatedHandlingLimit(EstimatedDeliveryDates.builder().withOffset(240).build());
    }
}
