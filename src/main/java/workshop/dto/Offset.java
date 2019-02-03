package workshop.dto;

import java.time.ZonedDateTime;
import java.util.Optional;

/**
 * Created by plcuneo on 2/23/18.
 */
public class Offset {

    private Optional<ZonedDateTime> date;
    private Integer shipping;

    public Optional<ZonedDateTime> getDate() {
        return date;
    }
    public void setDate(Optional<ZonedDateTime> date) {
        this.date = date;
    }

    public Integer getShipping() {
        return shipping;
    }
    public void setShipping(Integer shipping) {
        this.shipping = shipping;
    }

    public static class Builder {

        private Offset offset;

        private Builder() {
            this.offset = new Offset();
        }

        public Builder withDate(ZonedDateTime date) {
            offset.setDate(Optional.ofNullable(date));
            return this;
        }

        public Builder withShipping(Integer shipping) {
            offset.setShipping(shipping);
            return this;
        }

        public Offset build() {
            return offset;
        }
    }

    public static Builder builder() {
        return new Builder();
    }


}
