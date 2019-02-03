package workshop.dto;

/**
 * Created by ppileci on 3/14/17.
 */
public class Location {

    private String id;
    private String name;

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

    private Location(){}

    public static class Builder {

        private Location location;

        private Builder() {
            this.location = new Location();
        }

        public Builder withId(String id){
            location.setId(id);
            return this;
        }

        public Builder withName(String name){
            location.setName(name);
            return this;
        }

        public Location build() {
            return location;
        }

    }

    public static Builder builder() {
        return new Builder();
    }
}
