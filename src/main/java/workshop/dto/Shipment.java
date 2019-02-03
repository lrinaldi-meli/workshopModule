package workshop.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Shipment {

    private Long id;
    private String mode;
    private String createdBy;
    private String externalReference;
    private String status;
    private String substatus;
    private String siteId;
    private String serviceId;
    private Long senderId;
    private ZonedDateTime dateCreated;
    private ZonedDateTime lastUpdated;
    private Optional<ZonedDateTime> dateFirstPrinted;
    private BigDecimal declaredValue;
    private Dimension dimensions;
    private StatusHistory statusHistory;
    private String comments;
    private String logisticType;
    private Source source;
    private String trackingNumber;
    private String trackingMethod;
    private ShippingOption shippingOption;
    private ShippingMethod shippingMethod;
    private List<String> tags;
    private List<String> delay;
    private List<Object> items;
    private List<Object> payments;
    private String returnAuthorizationCode;
    private String returnTrackingNumber;
    private Long pickupListId;
    private List<SubstatusHistory> substatusHistory;
    private String customCarrierId;
    private ShippingAddress receiverAddress;
    private String type;


    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getDelay() {
        return delay;
    }

    public void setDelay(List<String> delay) {
        this.delay = delay;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubstatus() {
        return substatus;
    }

    public void setSubstatus(String substatus) {
        this.substatus = substatus;
    }

    public ZonedDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(ZonedDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public BigDecimal getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(BigDecimal declaredValue) {
        this.declaredValue = declaredValue;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }

    public StatusHistory getStatusHistory() {
        return statusHistory;
    }

    public void setStatusHistory(StatusHistory statusHistory) {
        this.statusHistory = statusHistory;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Long getSenderId() { return senderId; }

    public void setSenderId(Long senderId) { this.senderId = senderId;}

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingMethod() {
        return trackingMethod;
    }

    public void setTrackingMethod(String trackingMethod) {
        this.trackingMethod = trackingMethod;
    }

    public ShippingOption getShippingOption() {
        return shippingOption;
    }

    public void setShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public List<Object> getPayments() {
        return payments;
    }

    public void setPayments(List<Object> payments) {
        this.payments = payments;
    }

    public String getReturnAuthorizationCode() {
        return returnAuthorizationCode;
    }

    public void setReturnAuthorizationCode(String returnAuthorizationCode) {
        this.returnAuthorizationCode = returnAuthorizationCode;
    }

    public String getReturnTrackingNumber() {
        return returnTrackingNumber;
    }

    public void setReturnTrackingNumber(String returnTrackingNumber) {
        this.returnTrackingNumber = returnTrackingNumber;
    }

    public Long getPickupListId() {
        return pickupListId;
    }

    public Optional<ZonedDateTime> getDateFirstPrinted() {
        return dateFirstPrinted;
    }

    public void setDateFirstPrinted(Optional<ZonedDateTime> dateFirstPrinted) {
        this.dateFirstPrinted = dateFirstPrinted;
    }

    public void setPickupListId(Long pickupListId) {
        this.pickupListId = pickupListId;
    }

    public List<SubstatusHistory> getSubstatusHistory() {
        return substatusHistory;
    }

    public void setSubstatusHistory(List<SubstatusHistory> substatusHistory) {
        this.substatusHistory = substatusHistory;
    }

    public String getCustomCarrierId() {
        return customCarrierId;
    }

    public void setCustomCarrierId(String customCarrierId) {
        this.customCarrierId = customCarrierId;
    }

    public ShippingAddress getReceiverAddress() {return receiverAddress;}

    public void setReceiverAddress(ShippingAddress receiverAddress) {this.receiverAddress = receiverAddress;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    private Shipment(){}

    public String getLogisticType() {
        return logisticType;
    }

    public void setLogisticType(String logisticType) {
        this.logisticType = logisticType;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public static class Builder {

        private Shipment shipment;

        private Builder() {
            this.shipment = new Shipment();
        }

        public Builder withId(Long id){
            shipment.setId(id);
            return this;
        }


        public Builder withSite(String id){
            shipment.setSiteId(id);
            return this;
        }

        public Builder withCreatedBy(String createdBy){
            shipment.setCreatedBy(createdBy);
            return this;
        }

        public Builder withExternalReference(String externalReference){
            shipment.setExternalReference(externalReference);
            return this;
        }

        public Builder withStatus(String status){
            shipment.setStatus(status);
            return this;
        }

        public Builder withSubstatus(String substatus){
            shipment.setSubstatus(substatus);
            return this;
        }

        public Builder withServiceId(String serviceId){
            shipment.setServiceId(serviceId);
            return this;
        }
        public Builder withSenderId(Long senderId){
            shipment.setSenderId(senderId);
            return this;
        }

        public Builder withDateCreated(ZonedDateTime dateCreated){
            shipment.setDateCreated(dateCreated);
            return this;
        }

        public Builder withLastUpdated(ZonedDateTime lastUpdated){
            shipment.setLastUpdated(lastUpdated);
            return this;
        }

        public Builder withDeclaredValue(BigDecimal declaredValue){
            shipment.setDeclaredValue(declaredValue);
            return this;
        }

        public Builder withDimensions(Dimension dimensions){
            shipment.setDimensions(dimensions);
            return this;
        }

        public Builder withStatusHistory(StatusHistory statusHistory){
            shipment.setStatusHistory(statusHistory);
            return this;
        }

        public Builder withComments(String comments){
            shipment.setComments(comments);
            return this;
        }

        public Builder withSource(Source source){
            shipment.setSource(source);
            return this;
        }

        public Builder withTrackingNumber(String trackingNumber){
            shipment.setTrackingNumber(trackingNumber);
            return this;
        }

        public Builder withTrackingMethod(String trackingMethod){
            shipment.setTrackingMethod(trackingMethod);
            return this;
        }

        public Builder withShippingOption(ShippingOption shippingOption){
            shipment.setShippingOption(shippingOption);
            return this;
        }

        public Builder withShippingMethod(ShippingMethod shippingMethod){
            shipment.setShippingMethod(shippingMethod);
            return this;
        }

        public Builder withTags(List<String> tags){
            shipment.setTags(tags);
            return this;
        }



        public Builder withItems(List<Object> items){
            shipment.setItems(items);
            return this;
        }

        public Builder withPayments(List<Object> payments){
            shipment.setPayments(payments);
            return this;
        }

        public Builder withReturnAuthorizationCode(String returnAuthorizationCode){
            shipment.setReturnAuthorizationCode(returnAuthorizationCode);
            return this;
        }

        public Builder withReturnTrackingNumber(String returnTrackingNumber){
            shipment.setReturnTrackingNumber(returnTrackingNumber);
            return this;
        }

        public Builder withPickupListId(Long pickupListId){
            shipment.setPickupListId(pickupListId);
            return this;
        }

        public Builder withSubstatusHistory(SubstatusHistory substatusHistory){
            if (shipment.substatusHistory == null){
                shipment.setSubstatusHistory(new ArrayList<>());
            }
            shipment.getSubstatusHistory().add(substatusHistory);
            return this;
        }

        public Builder withCustomCarrierId(String customCarrierId){
            shipment.setCustomCarrierId(customCarrierId);
            return this;
        }

        public Builder withShippingAddress(ShippingAddress shippingAddress){
            shipment.setReceiverAddress(shippingAddress);
            return this;
        }

        public Builder withType(String type){
            shipment.setType(type);
            return this;
        }

        public Builder withDateFirstPrinted(Optional<ZonedDateTime> dateFirstPrinted){
            shipment.setDateFirstPrinted(dateFirstPrinted);
            return this;
        }

        public Builder withShippingMode(String mode){
            shipment.setMode(mode);
            return this;
        }

        public Builder withLogisticType(String logisticType) {
            shipment.setLogisticType(logisticType);
            return this;
        }


        public Shipment build() {
            return shipment;
        }

    }

    public static Builder builder() {
        return new Builder();
    }


}
