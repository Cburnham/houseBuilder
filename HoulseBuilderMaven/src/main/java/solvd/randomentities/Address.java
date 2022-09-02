package solvd.randomentities;

public class Address {
    private String streetAddress;
    private String state;
    private String region;

    public Address(String streetAddress, String state, String region) {
        this.streetAddress = streetAddress;
        this.state = state;
        this.region = region;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
