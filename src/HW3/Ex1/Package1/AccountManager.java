package HW3.Ex1.Package1;

public class AccountManager {
    public void AccountManager(Account acc) {
        System.out.println(acc.owner);         // OK: public
        // System.out.println(acc.balance);   // Fehler: private
        System.out.println(acc.pin);           // OK: protected (im selben Package)
        System.out.println(acc.internalNote);  // OK: package-private
    }
}
