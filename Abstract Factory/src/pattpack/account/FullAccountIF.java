package pattpack.account;

public class FullAccountIF {
    AccountIF acc;
    SecurityManagerIF sm;
    public FullAccountIF(AccountIF acc, SecurityManagerIF sm) {
        this.acc = acc;
        this.sm = sm;
    }
}
