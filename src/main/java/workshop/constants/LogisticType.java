package workshop.constants;

public enum LogisticType {

    DROP_OFF("drop_off", "Drop Off"),
    CROSS_DOCKING("cross_docking", "Cross Docking"),
    XD_DROP_OFF("xd_drop_off","Cross Docking Drop off"),
    FULFILLMENT("fulfillment", "Fulfillment"),
    SELF_SERVICE("self_service", "Self Service");


    private String id;
    private String name;

    LogisticType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
