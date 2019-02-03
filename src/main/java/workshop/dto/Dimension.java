package workshop.dto;

import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;

public class Dimension {

    @DecimalMin(value = "0", message="Height can not be negative")
    private BigDecimal height;
    @DecimalMin(value = "0", message="Width can not be negative")
    private BigDecimal width;
    @DecimalMin(value = "0", message="Length can not be negative")
    private BigDecimal length;
    @DecimalMin(value = "0", message="Weight can not be negative")
    private BigDecimal weight;

    private Dimension(){}

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public static class Builder {

        private Dimension dimension;

        private Builder() {
            this.dimension = new Dimension();
        }

        public Builder withHeight(BigDecimal height){
            dimension.setHeight(height);
            return this;
        }

        public Builder withWidth(BigDecimal width){
            dimension.setWidth(width);
            return this;
        }

        public Builder withLength(BigDecimal length){
            dimension.setLength(length);
            return this;
        }

        public Builder withWeight(BigDecimal weight){
            dimension.setWeight(weight);
            return this;
        }

        public Dimension build() {
            return dimension;
        }

    }

    public static Builder builder() {
        return new Builder();
    }
}
