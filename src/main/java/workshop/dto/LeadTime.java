package workshop.dto;

/**
 * Created by plcuneo on 2/26/18.
 */
public class LeadTime {

    private ShippingMethod shippingMethod;
    private EstimatedDeliveryTime estimatedDeliveryTime;
    private EstimatedDeliveryDates estimatedHandlingLimit;
    private EstimatedDeliveryDates estimatedDeliveryFinal;
    private EstimatedDeliveryDates estimatedDeliveryLimit;
    private EstimatedDeliveryDates estimatedDeliveryExtended;

    public EstimatedDeliveryTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(EstimatedDeliveryTime estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public EstimatedDeliveryDates getEstimatedHandlingLimit() {
        return estimatedHandlingLimit;
    }

    public void setEstimatedHandlingLimit(EstimatedDeliveryDates estimatedHandlingLimit) {
        this.estimatedHandlingLimit = estimatedHandlingLimit;
    }

    public EstimatedDeliveryDates getEstimatedDeliveryFinal() {
        return estimatedDeliveryFinal;
    }

    public void setEstimatedDeliveryFinal(EstimatedDeliveryDates estimatedDeliveryFinal) {
        this.estimatedDeliveryFinal = estimatedDeliveryFinal;
    }

    public EstimatedDeliveryDates getEstimatedDeliveryLimit() {
        return estimatedDeliveryLimit;
    }

    public void setEstimatedDeliveryLimit(EstimatedDeliveryDates estimatedDeliveryLimit) {
        this.estimatedDeliveryLimit = estimatedDeliveryLimit;
    }

    public EstimatedDeliveryDates getEstimatedDeliveryExtended() {
        return estimatedDeliveryExtended;
    }

    public void setEstimatedDeliveryExtended(EstimatedDeliveryDates estimatedDeliveryExtended) {
        this.estimatedDeliveryExtended = estimatedDeliveryExtended;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    private LeadTime() {
    }

    public static class Builder {

        private LeadTime leadTime;

        private Builder() {
            this.leadTime = new LeadTime();
        }

        public Builder withEstimatedDeliveryTime(EstimatedDeliveryTime estimatedDeliveryTime) {
            leadTime.setEstimatedDeliveryTime(estimatedDeliveryTime);
            return this;
        }

        public Builder withEstimatedHandlingLimit(EstimatedDeliveryDates estimatedHandlingLimit) {
            leadTime.setEstimatedHandlingLimit(estimatedHandlingLimit);
            return this;
        }

        public Builder withEstimatedDeliveryLimit(EstimatedDeliveryDates estimatedDeliveryLimit) {
            leadTime.setEstimatedDeliveryLimit(estimatedDeliveryLimit);
            return this;
        }

        public Builder withEstimatedDeliveryFinal(EstimatedDeliveryDates estimatedDeliveryFinal) {
            leadTime.setEstimatedDeliveryFinal(estimatedDeliveryFinal);
            return this;
        }

        public Builder withEstimatedDeliveryExtended(EstimatedDeliveryDates estimatedDeliveryExtended) {
            leadTime.setEstimatedDeliveryExtended(estimatedDeliveryExtended);
            return this;
        }

        public Builder withShippingMethod(ShippingMethod shippingMethod) {
            leadTime.setShippingMethod(shippingMethod);
            return this;
        }

        public LeadTime build() {
            return leadTime;
        }

    }

    public static Builder builder() {
        return new Builder();
    }


}
