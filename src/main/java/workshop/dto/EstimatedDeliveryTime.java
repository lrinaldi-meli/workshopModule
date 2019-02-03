package workshop.dto;

import java.time.ZonedDateTime;
import java.util.Optional;

/**
 * Created by plcuneo on 2/23/18.
 */
public class EstimatedDeliveryTime {

    private String type;
    private Optional<ZonedDateTime> date;
    private String unit;

    private Offset offset;
    private Optional<TimeFrame> timeFrame;

    private Optional<ZonedDateTime> payBefore;
    private Integer shipping;
    private Integer handling;
    private Integer schedule;

    private EstimatedDeliveryTime(){}

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public Optional<ZonedDateTime> getDate() { return date; }

    public void setDate(Optional<ZonedDateTime> date) { this.date = date; }

    public String getUnit() { return unit; }

    public void setUnit(String unit) { this.unit = unit; }

    public Offset getOffset() { return offset; }

    public void setOffset(Offset offset) { this.offset = offset; }

    public Optional<TimeFrame> getTimeFrame() { return timeFrame; }

    public void setTimeFrame(Optional<TimeFrame> timeFrame) { this.timeFrame = timeFrame; }

    public Optional<ZonedDateTime> getPayBefore() { return payBefore; }

    public void setPayBefore(Optional<ZonedDateTime> payBefore) { this.payBefore = payBefore; }

    public Integer getShipping() { return shipping; }

    public void setShipping(Integer shipping) { this.shipping = shipping; }

    public Integer getHandling() { return handling; }

    public void setHandling(Integer handling) { this.handling = handling; }

    public Integer getSchedule() { return schedule; }

    public void setSchedule(Integer schedule) { this.schedule = schedule; }


    public static class Builder {

        private EstimatedDeliveryTime estimatedDeliveryTime;

        private Builder() { this.estimatedDeliveryTime = new EstimatedDeliveryTime(); }

        public Builder withType(String type){
            estimatedDeliveryTime.setType(type);
            return this;
        }

        public Builder withDate(Optional<ZonedDateTime> date){
            estimatedDeliveryTime.setDate(date);
            return this;
        }

        public Builder withUnit(String unit){
            estimatedDeliveryTime.setUnit(unit);
            return this;
        }

        public Builder withOffset(Offset offset){
            estimatedDeliveryTime.setOffset(offset);
            return this;
        }

        public Builder withTimeFrame(TimeFrame timeFrame){
            estimatedDeliveryTime.setTimeFrame(Optional.ofNullable(timeFrame));
            return this;
        }

        public Builder withPayBefore(ZonedDateTime payBefore){
            estimatedDeliveryTime.setPayBefore(Optional.ofNullable(payBefore));
            return this;
        }

        public Builder withShipping(Integer shipping){
            estimatedDeliveryTime.setShipping(shipping);
            return this;
        }

        public Builder withHandling(Integer handling){
            estimatedDeliveryTime.setHandling(handling);
            return this;
        }

        public Builder withSchedule(Integer schedule){
            estimatedDeliveryTime.setSchedule(schedule);
            return this;
        }

        public EstimatedDeliveryTime build() { return estimatedDeliveryTime; }

    }

    public static Builder builder() {
        return new Builder();
    }

}
