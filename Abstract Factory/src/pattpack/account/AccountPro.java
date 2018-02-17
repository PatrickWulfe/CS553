package pattpack.account;

/**
 * Class abstracting a professional account.
 */
public class AccountPro extends AccountIF{
    /**
     *  Construct an economy account.
     *  @param loginId  The login id of this account.
     *    The login Id is used to retrieve from a database
     *    persistent data, such as the number of connection hours
     *    already used during the current month.
     */
    public AccountPro (int loginId) {
        /* Changed to use setter method */
        //this.loginId = loginId;
        this.setLoginId(loginId);

        // Get hoursConnectThisMonth and all other account parameters
        // from the database.  Argument loginId is the record's key.
    }

    public String toString () {
        /* Changed to use getter */
        //return "AccountProfessional (" + loginId + ")";
        return "AccountProfessional (" + this.getLoginId() + ")";
    }
}