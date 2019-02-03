package workshop.dto;

import java.time.ZonedDateTime;
import java.util.Optional;

/**
 * Created by plcuneo on 2/23/18.
 */
public class EstimatedDeliveryDates {

    private Optional<ZonedDateTime> date;
    private Integer offset;

    public Optional<ZonedDateTime> getDate() {
        return date;
    }
    public void setDate(Optional<ZonedDateTime> date) {
        this.date = date;
    }

    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public static class Builder {

        private EstimatedDeliveryDates estimatedDeliveryDates;

        private Builder() {
            this.estimatedDeliveryDates = new EstimatedDeliveryDates();
        }

        public Builder withDate(ZonedDateTime date) {
            estimatedDeliveryDates.setDate(Optional.ofNullable(date));
            return this;
        }

        public Builder withOffset(Integer offset) {
            estimatedDeliveryDates.setOffset(offset);
            return this;
        }

        public EstimatedDeliveryDates build() {
            return estimatedDeliveryDates;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

}
