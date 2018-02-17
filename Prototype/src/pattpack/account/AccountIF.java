package pattpack.account;

/**
 * Base class of all accounts.
 */
public abstract class AccountIF implements Cloneable {
    /** The id of this account. */
    //  Setting variables to private
    //protected int loginId;
    private int loginId;

    /** The number of connection hours used during the current month. */
    //protected int connectionHoursThisMonth;
    private int connectionHoursThisMonth;

    /** The connection speed in Kbs of this login. */
    //protected int connectionSpeedThisLogin;
    private int connectionSpeedThisLogin;

    /*
     * Adding getter and setter for login ID
     */
    public int getLoginId() { return loginId; }
    public void setLoginId(int loginId) { this.loginId = loginId; }

    /**
     *  Obtain the number of connection hours used during the current month.
     *  @return the number of connection hours used during the current month.
     */
    public int getConnectionHoursThisMonth () { return connectionHoursThisMonth; }
    /**
     *  Obtain the connection speed in Kbs of this login.
     *  @return the connection speed in Kbs of this login.
     */
    public int getConnectionSpeedThisLogin () { return connectionSpeedThisLogin; }
    // mailboxes, storage, comains, etc.

    public AccountIF clone() {
        try {
            return (AccountIF) super.clone();
        } catch (Exception e) {
            System.out.println("Could not clone");
        }
        return null;
    }
}






