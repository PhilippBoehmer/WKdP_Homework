package HW5.Ex1and2;

public class ShippingInfo {
    private String city;
    private int zipCode;
    private String country;

    public ShippingInfo(String city, int zipCode, String country) throws InvalidShippingInfoException {
        if (city == null || city.isEmpty()) {
            throw new InvalidShippingInfoException("City cannot be empty.");
        }
        if (zipCode <= 0) {
            throw new InvalidShippingInfoException("Zip code must be a positive number.");
        }
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }
}
