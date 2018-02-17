import pattpack.account.AccountIF;
import pattpack.account.SecurityManagerIF;

public class Prototype {
    AccountIF acc;
    SecurityManagerIF sm;
    Prototype(AccountIF acc, SecurityManagerIF sm) {
        this.acc = acc;
        this.sm = sm;
    }
    AccountIF createAccount(int loginID) {
        AccountIF newAcc = acc.clone();
        newAcc.setLoginId(loginID);
        return newAcc;
    }
    SecurityManagerIF createSecurityManager() {
        return sm.clone();
    }
}
