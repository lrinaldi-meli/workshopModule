package workshop.constants;

/**
 * Created by ncferrucci on 11/6/17.
 */
public enum Status {
    TO_BE_AGREED("to_be_agreed", "To be agreed"),
    PENDING("pending", "Pending"),
    HANDLING("handling", "Handling"),
    READY_TO_SHIP("ready_to_ship", "Ready to ship"),
    SHIPPED("shipped", "Shipped"),
    DELIVERED("delivered", "Delivered"),
    NOT_DELIVERED("not_delivered", "Not delivered"),
    NOT_VERIFIED("not_verified", "Not verified"),
    CANCELLED("cancelled", "Cancelled"),
    CLOSED("closed", "Closed"),
    ERROR("error", "Error"),
    ACTIVE("active", "Active"),
    NOT_SPECIFIED("not_specified", "Not specified"),
    STALE_READY_TO_SHIP("stale_ready_to_ship", "Stale ready to ship");


    private String id;
    private String name;

    Status(String id, String name) {
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
