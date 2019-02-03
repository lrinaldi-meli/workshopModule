package workshop.factory;

import workshop.dto.TrackingNumber;

public enum TrackingNumberFactory {

    BASE_TRACKING_NUMBER {
        @Override
        public TrackingNumber create() {
            return getBaseTrackingNumberBuilder()
                    .build();
        }
    };

    public abstract TrackingNumber create();

    protected TrackingNumber.Builder getBaseTrackingNumberBuilder() {

        return TrackingNumber.builder()
                .withTrackingNumber("123456789")
                .withShipmentId(123456789l)
                .withSectionType("processing")
                .withLogisticCenterId("TEX")
                .withServiceId(10l);
    }
}
