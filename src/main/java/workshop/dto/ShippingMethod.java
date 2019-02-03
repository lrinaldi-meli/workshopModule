package workshop.dto;


public class ShippingMethod {

    private Long id;
    private String deliveryTo;
    private String type;
    private String name;
    private Boolean trackShipments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeliveryTo() {
        return deliveryTo;
    }

    public void setDeliveryTo(String deliveryTo) {
        this.deliveryTo = deliveryTo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTrackShipments() {
        return trackShipments;
    }

    public void setTrackShipments(Boolean trackShipments) {
        this.trackShipments = trackShipments;
    }

    private ShippingMethod(){}

    public static class Builder {

        private ShippingMethod shippingMethod;

        private Builder() {
            this.shippingMethod = new ShippingMethod();
        }

        public Builder withId(Long id){
            shippingMethod.setId(id);
            return this;
        }

        public Builder withDeliveryTo(String deliveryTo){
            shippingMethod.setDeliveryTo(deliveryTo);
            return this;
        }

        public Builder withType(String type){
            shippingMethod.setType(type);
            return this;
        }

        public Builder withName(String name){
            shippingMethod.setName(name);
            return this;
        }

        public Builder withTrackShipments(Boolean trackShipments){
            shippingMethod.setTrackShipments(trackShipments);
            return this;
        }

        public ShippingMethod build() {
            return shippingMethod;
        }

    }

    public static Builder builder() {
        return new Builder();
    }
}
