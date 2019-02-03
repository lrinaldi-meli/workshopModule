package workshop.dto;

import java.time.ZonedDateTime;
import java.util.Objects;


public class SubstatusHistory {

    private String status;
    private String substatus;
    private ZonedDateTime date;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubstatus() {
        return substatus;
    }

    public void setSubstatus(String substatus) {
        this.substatus = substatus;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    private SubstatusHistory(){}

    public static class Builder {

        private SubstatusHistory substatusHistory;

        private Builder() {
            this.substatusHistory = new SubstatusHistory();
        }

        public Builder withStatus(String status){
            substatusHistory.setStatus(status);
            return this;
        }

        public Builder withSubstatus(String substatus){
            substatusHistory.setSubstatus(substatus);
            return this;
        }

        public Builder withDate(ZonedDateTime date){
            substatusHistory.setDate(date);
            return this;
        }

        public SubstatusHistory build() {
            return substatusHistory;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubstatusHistory that = (SubstatusHistory) o;
        return Objects.equals(getStatus(), that.getStatus()) &&
                Objects.equals(getSubstatus(), that.getSubstatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus(), getSubstatus());
    }

    public static Builder builder() {
        return new Builder();
    }
}
