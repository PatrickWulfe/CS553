import pattpack.account.AccountIF;
import pattpack.account.AccountEconomy;
import pattpack.account.SecurityManagerIF;
import pattpack.account.SecurityManagerEconomy;

public class AbstractFactoryEconomy extends AbstractFactoryIF {
    /** Create a new economy account */
    /** @return an interface for the new account */
    public AccountIF createAccount(int loginID) {
        return new AccountEconomy(loginID);
    }

    /** Create a new economy security manager */
    /** @return the new security manager */
    public SecurityManagerIF createSecurityManager() {
        return new SecurityManagerEconomy();
    }
}
