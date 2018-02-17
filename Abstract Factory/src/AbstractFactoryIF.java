import pattpack.account.AccountIF;
import pattpack.account.SecurityManagerIF;
import pattpack.account.FullAccountIF;

abstract class AbstractFactoryIF {
    abstract AccountIF createAccount(int loginId);
    abstract SecurityManagerIF createSecurityManager();
    final FullAccountIF fullAccountCreator(int loginId) {
        return new FullAccountIF(createAccount(loginId), createSecurityManager());
    }
}
