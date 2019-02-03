package workshop.constants;

public enum ShippingMode {
    ME1("me1", "Me1"),
    ME2("me2", "Me2"),
    CUSTOM("custom", "custom"),
    NOT_SPECIFIED("not_specified", "not_specified");

    private String id;
    private String name;

    ShippingMode(String id, String name) {
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
