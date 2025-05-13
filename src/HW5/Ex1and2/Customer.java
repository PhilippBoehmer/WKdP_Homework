package HW5.Ex1and2;

public class Customer {
    private Profile profile;
    private int customerId;

    public Customer(Profile profile, int customerId) throws InvalidCustomerException {
        if (profile == null) {
            throw new InvalidCustomerException("Profile cannot be null.");
        }
        if (customerId < 0) {
            throw new InvalidCustomerException("Customer ID must be a non-negative number.");
        }
        this.profile = profile;
        this.customerId = customerId;
    }

    public Profile getProfile() {
        return profile;
    }

    public int getCustomerId() {
        return customerId;
    }
}