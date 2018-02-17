import pattpack.account.AccountIF;
import pattpack.account.AccountStd;
import pattpack.account.SecurityManagerIF;
import pattpack.account.SecurityManagerStd;

public class AbstractFactoryStd extends AbstractFactoryIF {
    /** Create a new standard account */
    /** @return an interface for the new account */
    public AccountIF createAccount(int loginID) {
        return new AccountStd(loginID);
    }

    /** Create a new standard security manager */
    /** @return the new standard security manager */
    public SecurityManagerIF createSecurityManager() {
        return new SecurityManagerStd();
    }
}
