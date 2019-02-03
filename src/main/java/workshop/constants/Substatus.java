package workshop.constants;


public enum Substatus {

    //PENDING
    COST_EXCEEDED("cost_exceeded", "Cost exceeded", Status.PENDING),
    UNDER_REVIEW("under_review", "Under review (e.g. fraud)", Status.PENDING),
    REVIEWED("reviewed", "Reviewed", Status.PENDING),
    FRAUDULENT("fraudulent", "fraudulent", Status.PENDING),
    WAITING_FOR_PAYMENT("waiting_for_payment", "Waiting for shipping payment to be accredited", Status.PENDING),
    SHIPMENT_PAID("shipment_paid", "Shipping cost has been paid", Status.PENDING),
    CREATING_ROUTE("creating_route", "Route has been created", Status.PENDING),

    // HANDLING
    REGENERATING("regenerating", "Regenerating", Status.HANDLING),
    WAITING_FOR_LABEL_GENERATION("waiting_for_label_generation", "Waiting for label generation", Status.HANDLING),
    HANDLING_INVOICE_PENDING("invoice_pending", "Invoice pending", Status.HANDLING),
    WAITING_FOR_RETURN_CONFIRMATION("waiting_for_return_confirmation", "Waiting for return confirmation", Status.HANDLING),
    RETURN_CONFIRMED("return_confirmed", "Return Confirmed", Status.HANDLING),
    MANUFACTURING("manufacturing", "Manufacturing", Status.HANDLING),


    // READY TO SHIP
    READY_TO_PRINT("ready_to_print", "Ready to print", Status.READY_TO_SHIP),
    INVOICE_PENDING("invoice_pending", "Invoice pending", Status.READY_TO_SHIP),
    PRINTED("printed", "Printed", Status.READY_TO_SHIP),
    IN_PICKUP_LIST("in_pickup_list", "In pikcup list", Status.READY_TO_SHIP),
    READY_FOR_PKL_CREATION("ready_for_pkl_creation", "Ready for pkl creation", Status.READY_TO_SHIP),
    READY_FOR_PICKUP("ready_for_pickup", "Ready for pickup", Status.READY_TO_SHIP),
    READY_FOR_DROPOFF("ready_for_dropoff", "Ready for drop off", Status.READY_TO_SHIP),
    PICKED_UP("picked_up", "Picked up", Status.READY_TO_SHIP),
    STALE_READY_TO_SHIP("stale", "Stale Ready To Ship", Status.READY_TO_SHIP),
    DROPPED_OFF("dropped_off", "Dropped off in Melipoint", Status.READY_TO_SHIP),

    // NEYMAR SHIPPED
    IN_HUB("in_hub", "In hub", Status.READY_TO_SHIP),
    MEASURES_READY("measures_ready", "Measures and weight ready", Status.READY_TO_SHIP),
    WAITING_FOR_CARRIER_AUTHORIZATION("waiting_for_carrier_authorization", "Waiting for carrier authorization", Status.READY_TO_SHIP),
    AUTHORIZED_BY_CARRIER("authorized_by_carrier", "Authorized by carrier MELI", Status.READY_TO_SHIP),
    IN_PACKING_LIST("in_packing_list", "In packing list", Status.READY_TO_SHIP),
    IN_PLP("in_plp", "In PLP", Status.READY_TO_SHIP),

    // FULFILLMENT
    IN_WAREHOUSE("in_warehouse", "In Warehouse", Status.READY_TO_SHIP),
    READY_TO_PACK("ready_to_pack", "Ready to Pack", Status.READY_TO_SHIP),

    // ALICIA
    DELIVERY_FAILED("delivery_failed", "Delivery failed", Status.SHIPPED),
    WAITING_FOR_CONFIRMATION("waiting_for_confirmation", "waiting for confirmation", Status.SHIPPED),


    // SHIPPED
    DELAYED("delayed", "Delayed", Status.SHIPPED),
    WAITING_FOR_WITHDRAWAL("waiting_for_withdrawal", "Waiting for withdrawal", Status.SHIPPED),
    CONTACT_WITH_CARRIER("contact_with_carrier_required", "Contact with carrier required", Status.SHIPPED),
    RECEIVER_ABSENT("receiver_absent", "Receiver absent", Status.SHIPPED),
    RECLAIMED("reclaimed", "Reclaimed", Status.SHIPPED),
    NOT_LOCALIZED("not_localized", "Not localized", Status.SHIPPED),
    FORWARDED_TO_THIRD("forwarded_to_third", "Forwarded to third party", Status.SHIPPED),
    SOON_DELIVER("soon_deliver", "Soon deliver", Status.SHIPPED),
    REFUSED_DELIVERY("refused_delivery", "Delivery refused", Status.SHIPPED),
    BAD_ADDRESS("bad_address", "Bad address", Status.SHIPPED),
    NEGATIVE_FEEDBACK("negative_feedback", "Stale shipped with negative feedback by buyer", Status.SHIPPED),
    NEED_REVIEW("need_review", "Need to review carrier status to understand what happened", Status.SHIPPED),
    STALE_SHIPPED("stale", "Stale shipped", Status.SHIPPED),
    OPERATOR_INTERVENTION("operator_intervention", "Need operator intervention", Status.SHIPPED),
    CLAIMED_ME_SHIPPED("claimed_me", "Stale shipped that was claimed by the receiver", Status.SHIPPED),
    RETAINED_SHIPPED("retained", "Retained when package is on going", Status.SHIPPED),

    //DELIVERY
    DAMAGED("damaged", "damaged", Status.DELIVERED),
    FULFILLED_FEEDBACK("fulfilled_feedback", "Fulfilled by buyer feedback", Status.DELIVERED),
    NO_ACTION_TAKEN("no_action_taken", "No action taken by buyer", Status.DELIVERED),
    DELIVERED_DOUBLE_REFUND("double_refund", "Double Refund", Status.DELIVERED),
    INFERRED("inferred", "Inferred Delivery", Status.DELIVERED),

    // NOT DELIVERY
    RETURNING_TO_SENDER("returning_to_sender", "Returning to sender", Status.NOT_DELIVERED),
    RETAINED("retained", "Retained", Status.NOT_DELIVERED),
    STOLEN("stolen", "Stolen", Status.NOT_DELIVERED),
    RETURNED("returned", "Returned", Status.NOT_DELIVERED),
    RECEIVER_ABSENT_NOT_DELIVERED("receiver_absent", "Receiver absent", Status.NOT_DELIVERED),
    CONFISCATED("confiscated", "confiscated", Status.NOT_DELIVERED),
    TO_REVIEW("to_review", "Closed shipment", Status.NOT_DELIVERED),
    DESTROYED("destroyed", "Destroyed", Status.NOT_DELIVERED),
    WAITING_FOR_WITHDRAWAL_NOT_DELIVERED("waiting_for_withdrawal", "Waiting for withdrawal", Status.NOT_DELIVERED),
    NEGATIVE_FEEDBACK_NOT_DELIVERED("negative_feedback", "Stale shipped forced to not delivered due to negative feedback by buyer", Status.NOT_DELIVERED),
    NOT_LOCALIZED_NOT_DELIVERED("not_localized", "Not localized", Status.NOT_DELIVERED),
    NOT_DELIVERED_DOUBLE_REFUND("double_refund", "Double Refund", Status.NOT_DELIVERED),
    DAMAGED_IN_HUB("damaged", "Package damaged in hub", Status.NOT_DELIVERED),
    LOST("lost", "Package lost", Status.NOT_DELIVERED),
    CANCELLED_MEASUREMENT_EXCEEDED("cancelled_measurement_exceeded", "Shipment cancelled for measurement exceeded", Status.NOT_DELIVERED),
    RETURNED_TO_HUB("returned_to_hub", "Returned to hub", Status.NOT_DELIVERED),
    RETURNED_TO_AGENCY("returned_to_agency", "Returned to agency", Status.NOT_DELIVERED),
    PICKED_UP_FOR_RETURN("picked_up_for_return", "Picked up for return", Status.NOT_DELIVERED),
    CLAIMED_ME_NOT_DELIVERED("claimed_me", "Not delivered that was claimed by the receiver", Status.NOT_DELIVERED),
    RETURNING_TO_WAREHOUSE("returning_to_warehouse", "Returning to Warehouse", Status.NOT_DELIVERED),
    RETURNED_TO_WAREHOUSE("returned_to_warehouse", "Returned to Warehouse", Status.NOT_DELIVERED),

    // CANCELLED
    RECOVERED("recovered", "Recovered", Status.CANCELLED),
    LABEL_EXPIRED("label_expired", "Label Expired", Status.CANCELLED),
    CANCELLED_MANUALLY("cancelled_manually", "Cancelled Manually", Status.CANCELLED),
    CANCELLED_FRAUDULENT("fraudulent", "Cancelled Fraudulent", Status.CANCELLED),
    RETURN_EXPIRED("return_expired", "Return expired", Status.CANCELLED),
    RETURN_SESSION_EXPIRED("return_session_expired", "Return session expired", Status.CANCELLED),
    UNFULFILLABLE("unfulfillable", "Unfulfillable", Status.CANCELLED);


    private String id;
    private String name;
    private Status parent;

    Substatus(String id, String name, Status parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
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

    public Status getParent() {
        return parent;
    }

    public void setParent(Status parent) {
        this.parent = parent;
    }

    public static Substatus valueOf(String subStatusName, Status status) {

        try {
            return Substatus.valueOf(subStatusName);
        } catch (IllegalArgumentException e) {
            return Substatus.valueOf(subStatusName + "_" + status.getId().toUpperCase());
        }
    }
}
