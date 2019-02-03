package workshop.dto;

import java.util.Objects;

public class TrackingNumber {
    public String trackingNumber;
    public String status;
    public String substatus;
    public Long shipmentId;
    public Long serviceId;
    public String packageOrigin;
    public Long companyId;
    public String sectionType;
    public String logisticCenterId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackingNumber that = (TrackingNumber) o;
        return Objects.equals(trackingNumber, that.trackingNumber) &&
                Objects.equals(status, that.status) &&
                Objects.equals(substatus, that.substatus) &&
                Objects.equals(shipmentId, that.shipmentId) &&
                Objects.equals(serviceId, that.serviceId) &&
                Objects.equals(packageOrigin, that.packageOrigin) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(sectionType, that.sectionType) &&
                Objects.equals(logisticCenterId, that.logisticCenterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackingNumber, status, substatus, shipmentId, serviceId, packageOrigin, companyId, sectionType, logisticCenterId);
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
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

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Long getShipmentId() {
        return shipmentId;
    }

    public String getPackageOrigin() {
        return packageOrigin;
    }

    public void setPackageOrigin(String packageOrigin) {
        this.packageOrigin = packageOrigin;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getSectionType() {
        return sectionType;
    }

    public String getLogisticCenterId() {
        return logisticCenterId;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }

    public void setLogisticCenterId(String logisticCenterId) {
        this.logisticCenterId = logisticCenterId;
    }

    public static class Builder {
        private TrackingNumber trackingNumber;

        private Builder() {
            this.trackingNumber = new TrackingNumber();
        }

        public Builder withTrackingNumber(String trackingNumber1) {
            trackingNumber.setTrackingNumber(trackingNumber1);
            return this;
        }

        public Builder withStatus(String status) {
            trackingNumber.setStatus(status);
            return this;
        }

        public Builder withSubstatus(String substatus) {
            trackingNumber.setSubstatus(substatus);
            return this;
        }

        public Builder withShipmentId(Long shippingId) {
            trackingNumber.setShipmentId(shippingId);
            return this;
        }

        public Builder withServiceId(Long serviceId) {
            trackingNumber.setServiceId(serviceId);
            return this;
        }

        public Builder withCompanyId(Long companyId) {
            trackingNumber.setCompanyId(companyId);
            return this;
        }

        public Builder withPackageOrigin(String packageOrigin) {
            trackingNumber.setPackageOrigin(packageOrigin);
            return this;
        }

        public Builder withSectionType(String sectionType) {
            trackingNumber.setSectionType(sectionType);
            return this;
        }

        public Builder withLogisticCenterId(String logisticCenterId) {
            trackingNumber.setLogisticCenterId(logisticCenterId);
            return this;
        }

        public TrackingNumber build() {
            return trackingNumber;
        }
    }

    public static TrackingNumber.Builder builder() {
        return new Builder();
    }
}


