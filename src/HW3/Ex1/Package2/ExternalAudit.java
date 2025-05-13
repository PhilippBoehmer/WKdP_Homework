package HW3.Ex1.Package2;

import HW3.Ex1.Package1.Account;

public class ExternalAudit {
    public Account account;

    public void ExternalAudit(Account account) {
        //System.out.println(account.owner);         // OK: public
        // System.out.println(account.balance);   // Fehler: private
        // System.out.println(account.pin);       // Fehler: protected aus anderem Package
        // System.out.println(account.internalNote); // Fehler: package-private
    }
}
