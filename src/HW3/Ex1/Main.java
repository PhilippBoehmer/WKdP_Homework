package HW3.Ex1;

import HW3.Ex1.Package1.Account;
import HW3.Ex1.Package1.AccountManager;
import HW3.Ex1.Package2.CompanyAccount;
import HW3.Ex1.Package2.ExternalAudit;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("Alice", 1000.0, 1234);


        AccountManager accountManager = new AccountManager(account);
        System.out.println("Owner: " + accountManager.account.Owner);
        System.out.println("Balance: " + accountManager.account.balance);
        System.out.println("PIN: " + accountManager.account.pin);
        System.out.println("Internal Note: " + accountManager.account.internalNote);


        ExternalAudit externalAudit = new ExternalAudit(account);
        System.out.println("Owner: " + externalAudit.account.Owner);
        System.out.println("Balance: " + externalAudit.account.balance);
        System.out.println("PIN: " + externalAudit.account.pin);
        System.out.println("Internal Note: " + externalAudit.account.internalNote);

        CompanyAccount companyAccount = new CompanyAccount("Company", 5000.0, 5678);

        System.out.println("Owner: " + companyAccount.Owner);
        System.out.println("Balance: " + companyAccount.balance);
        System.out.println("PIN: " + companyAccount.pin);
        System.out.println("Internal Note: " + companyAccount.internalNote);


    }
}
