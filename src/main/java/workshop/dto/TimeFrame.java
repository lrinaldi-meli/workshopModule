package workshop.dto;

import java.time.ZonedDateTime;
import java.util.Optional;


public class TimeFrame {

    private Optional<ZonedDateTime> from;
    private Optional<ZonedDateTime> to;

    public Optional<ZonedDateTime> getFrom() { return from; }

    public void setFrom(Optional<ZonedDateTime> from) { this.from = from; }

    public Optional<ZonedDateTime> getTo() { return to; }

    public void setTo(Optional<ZonedDateTime> to) { this.to = to; }

    public static class Builder {

        private TimeFrame timeFrame;

        private Builder() { this.timeFrame = new TimeFrame(); }

        public Builder withFrom(ZonedDateTime date) {
            timeFrame.setFrom(Optional.ofNullable(date));
            return this;
        }

        public Builder withTo(ZonedDateTime date) {
            timeFrame.setTo(Optional.ofNullable(date));
            return this;
        }

        public TimeFrame build() { return timeFrame;}
    }

    public static Builder builder() {
        return new Builder();
    }
}
