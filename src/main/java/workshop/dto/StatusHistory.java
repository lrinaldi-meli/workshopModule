package workshop.dto;

import java.time.ZonedDateTime;
import java.util.Optional;

public class StatusHistory implements Cloneable {


    private Optional<ZonedDateTime> dateHandling;
    private Optional<ZonedDateTime> dateReadyToShip;
    private Optional<ZonedDateTime> dateShipped;
    private Optional<ZonedDateTime> dateFirstVisit;
    private Optional<ZonedDateTime> dateDelivered;
    private Optional<ZonedDateTime> dateCancelled;
    private Optional<ZonedDateTime> dateNotDelivered;
    private Optional<ZonedDateTime> dateReturned;

    public Optional<ZonedDateTime> getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Optional<ZonedDateTime> dateReturned) {
        this.dateReturned = dateReturned;
    }

    public Optional<ZonedDateTime> getDateHandling() {
        return dateHandling;
    }

    public void setDateHandling(Optional<ZonedDateTime> dateHandling) {
        this.dateHandling = dateHandling;
    }

    public Optional<ZonedDateTime> getDateReadyToShip() {
        return dateReadyToShip;
    }

    public void setDateReadyToShip(Optional<ZonedDateTime> dateReadyToShip) {
        this.dateReadyToShip = dateReadyToShip;
    }

    public Optional<ZonedDateTime> getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(Optional<ZonedDateTime> dateShipped) {
        this.dateShipped = dateShipped;
    }

    public Optional<ZonedDateTime> getDateFirstVisit() {
        return dateFirstVisit;
    }

    public void setDateFirstVisit(Optional<ZonedDateTime> dateFirstVisit) {
        this.dateFirstVisit = dateFirstVisit;
    }

    public Optional<ZonedDateTime> getDateDelivered() {
        return dateDelivered;
    }

    public void setDateDelivered(Optional<ZonedDateTime> dateDelivered) {
        this.dateDelivered = dateDelivered;
    }

    public Optional<ZonedDateTime> getDateCancelled() {
        return dateCancelled;
    }

    public void setDateCancelled(Optional<ZonedDateTime> dateCancelled) {
        this.dateCancelled = dateCancelled;
    }

    public Optional<ZonedDateTime> getDateNotDelivered() {
        return dateNotDelivered;
    }

    public void setDateNotDelivered(Optional<ZonedDateTime> dateNotDelivered) {
        this.dateNotDelivered = dateNotDelivered;
    }

    @Override
    public StatusHistory clone() {
        StatusHistory statusHistory = null;
        try {
            statusHistory = (StatusHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            // this should never happen.
            e.printStackTrace();
        }
        return statusHistory;
    }


    private StatusHistory() {
    }

    public static class Builder {

        private StatusHistory statusHistory;

        private Builder() {
            this.statusHistory = new StatusHistory();
        }

        public Builder withDateHandling(ZonedDateTime dateHandling) {

            statusHistory.setDateHandling(Optional.ofNullable(dateHandling));
            return this;
        }

        public Builder withDateReadyToShip(ZonedDateTime dateReadyToShip) {
            statusHistory.setDateReadyToShip(Optional.ofNullable(dateReadyToShip));
            return this;
        }


        public Builder withDateShipped(ZonedDateTime dateShipped) {
            statusHistory.setDateShipped(Optional.ofNullable(dateShipped));
            return this;
        }

        public Builder withDateFirstVisit(ZonedDateTime dateFirstVisit) {
            statusHistory.setDateFirstVisit(Optional.ofNullable(dateFirstVisit));
            return this;
        }

        public Builder withDateDelivered(ZonedDateTime dateDelivered) {
            statusHistory.setDateDelivered(Optional.ofNullable(dateDelivered));
            return this;
        }

        public Builder withDateCancelled(ZonedDateTime dateCancelled) {
            statusHistory.setDateCancelled(Optional.ofNullable(dateCancelled));
            return this;
        }

        public Builder withDateNotDelivered(ZonedDateTime dateNotDelivered) {
            statusHistory.setDateNotDelivered(Optional.ofNullable(dateNotDelivered));
            return this;
        }

        public StatusHistory build() {
            return statusHistory;
        }

    }

    public static Builder builder() {
        return new Builder();
    }

}
