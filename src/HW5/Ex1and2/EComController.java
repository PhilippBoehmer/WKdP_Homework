package HW5.Ex1and2;

public class EComController {
    public static void main(String[] args) {
        // Test case 1: Valid inputs
        try {
            ShippingInfo validInfo = new ShippingInfo("Munich", 80331, "Germany");
            Profile validProfile = new Profile(validInfo);
            Customer validCustomer = new Customer(validProfile, 123);
            System.out.println("Shipping to: " + validCustomer.getProfile().getShippingInfo().getCity());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Test case 2: Invalid city (empty)
        try {
            ShippingInfo invalidCityInfo = new ShippingInfo("", 80331, "Germany");
        } catch (InvalidShippingInfoException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Test case 3: Invalid zip code (negative)
        try {
            ShippingInfo invalidZipInfo = new ShippingInfo("Berlin", -12345, "Germany");
        } catch (InvalidShippingInfoException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Test case 4: Missing ShippingInfo in Profile
        try {
            Profile missingShippingInfoProfile = new Profile(null);
        } catch (MissingShippingInfoException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Test case 5: Missing Profile in Customer
        try {
            Customer missingProfileCustomer = new Customer(null, 123);
        } catch (InvalidCustomerException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Test case 6: Invalid Customer ID (negative)
        try {
            ShippingInfo validInfo = new ShippingInfo("Hamburg", 20095, "Germany");
            Profile validProfile = new Profile(validInfo);
            Customer invalidCustomerId = new Customer(validProfile, -1);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}