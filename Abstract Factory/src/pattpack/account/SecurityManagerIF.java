package pattpack.account;

/**
 *  Interface of all security managers of an account.
 */
public abstract class SecurityManagerIF {
    /**
     *  Check that an account usage does not violate the
     *  limits set for that account.
     *  @param account The account whose limits must be checked.
     *  @exception LimitsException thrown if and only if the limits
     *    are exceeded.
     */
    public void checkLimits (AccountIF account) throws LimitsException {
    /* Added condition for unlimited hours */
	//if (account.getConnectionHoursThisMonth () > getConnectionHours ())
    if (account.getConnectionHoursThisMonth () > getConnectionHours ()
            && getConnectionHours() != 0)
        throw new LimitsException ("Connection hours exceeds limit");
    /* Added condition for unlimited speed */
    //if (account.getConnectionSpeedThisLogin () > getConnectionSpeed ())
	if (account.getConnectionSpeedThisLogin () > getConnectionSpeed ()
            && getConnectionSpeed() != 0)
	    throw new LimitsException ("Connection speed exceeds limit");
    }
    /**
     *  Get the maximum allowed connection hours.
     */
    public abstract int getConnectionHours ();
    /**
     *  Get the maximum allowed connection speed.
     */
    public abstract int getConnectionSpeed ();
}






