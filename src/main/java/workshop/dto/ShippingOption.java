package workshop.dto;
import java.math.BigDecimal;


public class ShippingOption {

    private String id;
    private BigDecimal listCost;
    private BigDecimal cost;
    private String currencyId;
    private String costType;
    private Long serviceId;
    private BigDecimal shippingTime;
    private Double handlingTime;
    private BigDecimal shippingTimeOffset;
    private Integer extendedOffset;
    private Integer limitOffset;
    private Integer finalOffset;
    private String deliveryType;
    private Integer shippingMethodId;
    private EstimatedDeliveryTime estimatedDeliveryTime;
    private EstimatedDeliveryDates estimatedHandlingLimit;
    private EstimatedDeliveryDates estimatedDeliveryFinal;
    private EstimatedDeliveryDates estimatedDeliveryLimit;
    private EstimatedDeliveryDates estimatedDeliveryExtended;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getListCost() {
        return listCost;
    }

    public void setListCost(BigDecimal listCost) {
        this.listCost = listCost;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public BigDecimal getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(BigDecimal shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Double getHandlingTime() {
        return handlingTime;
    }

    public void setHandlingTime(Double handlingTime) {
        this.handlingTime = handlingTime;
    }

    public BigDecimal getShippingTimeOffset() {
        return shippingTimeOffset;
    }

    public void setShippingTimeOffset(BigDecimal shippingTimeOffset) {
        this.shippingTimeOffset = shippingTimeOffset;
    }

    public Integer getExtendedOffset() {
        return extendedOffset;
    }

    public void setExtendedOffset(Integer extendedOffset) {
        this.extendedOffset = extendedOffset;
    }

    public Integer getLimitOffset() {
        return limitOffset;
    }

    public void setLimitOffset(Integer limitOffset) {
        this.limitOffset = limitOffset;
    }

    public Integer getFinalOffset() {
        return finalOffset;
    }

    public void setFinalOffset(Integer finalOffset) {
        this.finalOffset = finalOffset;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Integer getShippingMethodId() {
        return shippingMethodId;
    }

    public void setShippingMethodId(Integer shippingMethodId) {this.shippingMethodId = shippingMethodId;}

    public EstimatedDeliveryTime getEstimatedDeliveryTime() {return estimatedDeliveryTime;}

    public void setEstimatedDeliveryTime(EstimatedDeliveryTime estimatedDeliveryTime) {this.estimatedDeliveryTime = estimatedDeliveryTime;}

    public EstimatedDeliveryDates getEstimatedHandlingLimit() { return estimatedHandlingLimit; }

    public void setEstimatedHandlingLimit(EstimatedDeliveryDates estimatedHandlingLimit) {
        this.estimatedHandlingLimit = estimatedHandlingLimit;
    }

    public EstimatedDeliveryDates getEstimatedDeliveryFinal() { return estimatedDeliveryFinal; }

    public void setEstimatedDeliveryFinal(EstimatedDeliveryDates estimatedDeliveryFinal) {
        this.estimatedDeliveryFinal = estimatedDeliveryFinal;
    }

    public EstimatedDeliveryDates getEstimatedDeliveryLimit() { return estimatedDeliveryLimit; }

    public void setEstimatedDeliveryLimit(EstimatedDeliveryDates estimatedDeliveryLimit) {
        this.estimatedDeliveryLimit = estimatedDeliveryLimit;
    }

    public EstimatedDeliveryDates getEstimatedDeliveryExtended() { return estimatedDeliveryExtended; }

    public void setEstimatedDeliveryExtended(EstimatedDeliveryDates estimatedDeliveryExtended) {
        this.estimatedDeliveryExtended = estimatedDeliveryExtended;
    }


    private ShippingOption(){}

    public static class Builder {

        private ShippingOption shippingOption;

        private Builder() {
            this.shippingOption = new ShippingOption();
        }

        public Builder withId (String id){
            shippingOption.setId(id);
            return this;
        }

        public Builder withListCost (BigDecimal listCost){
            shippingOption.setListCost(listCost);
            return this;
        }

        public Builder withCost (BigDecimal cost){
            shippingOption.setCost(cost);
            return this;
        }

        public Builder withCurrencyId (String currencyId){
            shippingOption.setCurrencyId(currencyId);
            return this;
        }

        public Builder withCostType (String costType){
            shippingOption.setCostType(costType);
            return this;
        }

        public Builder withServiceId (Long serviceId){
            shippingOption.setServiceId(serviceId);
            return this;
        }

        public Builder withShippingTime (BigDecimal shippingTime){
            shippingOption.setShippingTime(shippingTime);
            return this;
        }

        public Builder withHandlingTime (Double handlingTime){
            shippingOption.setHandlingTime(handlingTime);
            return this;
        }

        public Builder withShippingTimeOffset (BigDecimal shippingTimeOffset){
            shippingOption.setShippingTimeOffset(shippingTimeOffset);
            return this;
        }

        public Builder withExtendedOffset (Integer extendedOffset){
            shippingOption.setExtendedOffset(extendedOffset);
            return this;
        }

        public Builder withLimitOffset (Integer limitOffset){
            shippingOption.setLimitOffset(limitOffset);
            return this;
        }

        public Builder withFinalOffset (Integer finalOffset){
            shippingOption.setFinalOffset(finalOffset);
            return this;
        }

        public Builder withDeliveryType (String deliveryType){
            shippingOption.setDeliveryType(deliveryType);
            return this;
        }

        public Builder withShippingMethodId (Integer shippingMethodId){
            shippingOption.setShippingMethodId(shippingMethodId);
            return this;
        }

        public Builder withEstimatedDeliveryTime (EstimatedDeliveryTime estimatedDeliveryTime){
            shippingOption.setEstimatedDeliveryTime(estimatedDeliveryTime);
            return this;
        }

        public Builder withEstimatedHandlingLimit(EstimatedDeliveryDates estimatedHandlingLimit){
            shippingOption.setEstimatedHandlingLimit(estimatedHandlingLimit);
            return this;
        }

        public Builder withEstimatedDeliveryLimit (EstimatedDeliveryDates estimatedDeliveryLimit){
            shippingOption.setEstimatedDeliveryLimit(estimatedDeliveryLimit);
            return this;
        }

        public Builder withEstimatedDeliveryFinal (EstimatedDeliveryDates estimatedDeliveryFinal){
            shippingOption.setEstimatedDeliveryFinal(estimatedDeliveryFinal);
            return this;
        }

        public Builder withEstimatedDeliveryExtended (EstimatedDeliveryDates estimatedDeliveryExtended){
            shippingOption.setEstimatedDeliveryExtended(estimatedDeliveryExtended);
            return this;
        }

        public ShippingOption build() {
            return shippingOption;
        }

    }

    public static Builder builder() {
        return new Builder();
    }
}
