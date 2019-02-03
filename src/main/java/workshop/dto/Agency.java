package workshop.dto;

/**
 * Created by ppileci on 3/14/17.
 */
public class Agency {

    private String id;
    private Long carrierId;
    private String agencyId;
    private String cityName;
    private String stateName;
    private String zipCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public String getAgencyId() {return agencyId;}

    public void setAgencyId(String agencyId) {this.agencyId = agencyId;}

    public String getCityName() {return cityName;}

    public void setCityName(String cityName) {this.cityName = cityName;}

    public String getStateName() {return stateName;}

    public void setStateName(String stateName) {this.stateName = stateName;}

    public String getZipCode() {return zipCode;}

    public void setZipCode(String zipCode) {this.zipCode = zipCode;}


    public Agency(){}
}
