import pattpack.account.AccountIF;
import pattpack.account.SecurityManagerIF;

public interface AbstractFactoryIF {
    AccountIF createAccount(int loginId);
    SecurityManagerIF createSecurityManager();
}
