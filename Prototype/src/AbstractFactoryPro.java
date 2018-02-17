import pattpack.account.AccountIF;
import pattpack.account.AccountPro;
import pattpack.account.SecurityManagerIF;
import pattpack.account.SecurityManagerPro;

public class AbstractFactoryPro implements AbstractFactoryIF {
    /** Create a new professional account */
    /** @return an interface for the new account */
    public AccountIF createAccount(int loginID) {
        return new AccountPro(loginID);
    }

    /** Create a new professional security manager */
    /** @return the new security manager */
    public SecurityManagerIF createSecurityManager() {
        return new SecurityManagerPro();
    }
}
