package workshop.dto;

import java.math.BigDecimal;


public class ShippingAddress {

    private Long id;
    private Long addressId;
    private String addressLine;
    private String streetName;
    private String streetNumber;
    private String comment;
    private String zipCode;
    private Location city;
    private Location state;
    private Location country;
    private Location neighborhood;
    private Location municipality;
    private Agency agency;
    private String[] types;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String geolocationType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAddressId() {
            return addressId;
     }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Location getCity() {
        return city;
    }

    public void setCity(Location city) {
        this.city = city;
    }

    public Location getState() {
        return state;
    }

    public void setState(Location state) {
        this.state = state;
    }

    public Location getCountry() {
        return country;
    }

    public void setCountry(Location country) {
        this.country = country;
    }

    public Location getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Location neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Location getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Location municipality) {
        this.municipality = municipality;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getGeolocationType() {
        return geolocationType;
    }

    public void setGeolocationType(String geolocationType) {
        this.geolocationType = geolocationType;
    }

    private ShippingAddress(){}

    public static class Builder {

        private ShippingAddress shippingAddress;

        private Builder() {
            this.shippingAddress = new ShippingAddress();
        }

        public Builder withId(Long id){
            shippingAddress.setId(id);
            return this;
        }

        public Builder withAddressId(Long addressId){
            shippingAddress.setAddressId(addressId);
            return this;
        }

        public Builder withAddressLine(String addressLine){
            shippingAddress.setAddressLine(addressLine);
            return this;
        }

        public Builder withStreetName(String streetName){
            shippingAddress.setStreetName(streetName);
            return this;
        }

        public Builder withStreetNumber(String streetNumber){
            shippingAddress.setStreetNumber(streetNumber);
            return this;
        }

        public Builder withComment(String comment){
            shippingAddress.setComment(comment);
            return this;
        }

        public Builder withZipCode(String zipCode){
            shippingAddress.setZipCode(zipCode);
            return this;
        }

        public Builder withCity(Location city){
            shippingAddress.setCity(city);
            return this;
        }

        public Builder withState(Location state){
            shippingAddress.setState(state);
            return this;
        }

        public Builder withCountry(Location country){
            shippingAddress.setCountry(country);
            return this;
        }

        public Builder withNeighborhood(Location neighborhood){
            shippingAddress.setNeighborhood(neighborhood);
            return this;
        }

        public Builder withMunicipality(Location municipality){
            shippingAddress.setMunicipality(municipality);
            return this;
        }

        public Builder withAgency(Agency agency){
            shippingAddress.setAgency(agency);
            return this;
        }

        public Builder withTypes(String[] types){
            shippingAddress.setTypes(types);
            return this;
        }

        public Builder withLatitude(BigDecimal latitude){
            shippingAddress.setLatitude(latitude);
            return this;
        }

        public Builder withLongitude(BigDecimal longitude){
            shippingAddress.setLongitude(longitude);
            return this;
        }

        public Builder withGeolocationType(String geolocationType){
            shippingAddress.setGeolocationType(geolocationType);
            return this;
        }

        public ShippingAddress build() {
            return shippingAddress;
        }

    }

    public static Builder builder() {
        return new Builder();
    }
}
