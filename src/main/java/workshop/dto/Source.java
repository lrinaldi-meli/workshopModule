package workshop.dto;


public class Source {

    private String marketPlace;
    private Long applicationId;
    private String siteId;

    public String getMarketPlace() {
        return marketPlace;
    }

    public void setMarketPlace(String marketPlace) {
        this.marketPlace = marketPlace;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    private Source(){}

    public static class Builder {

        private Source source;

        private Builder() {
            this.source = new Source();
        }

        public Builder withMarketPlace(String marketPlace){
            source.setMarketPlace(marketPlace);
            return this;
        }

        public Builder withApplicationId(Long applicationId){
            source.setApplicationId(applicationId);
            return this;
        }

        public Builder withSiteId (String siteId){
            source.setSiteId(siteId);
            return this;
        }

        public Source build() {
            return source;
        }

    }

    public static Builder builder() {
        return new Builder();
    }
}
