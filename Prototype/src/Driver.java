import pattpack.account.*;

import java.util.Random;

public class Driver {
    public static void main (String[] ignore) {
        Random rand = new Random();

        /** Create abstract factories */
        Prototype eco = new Prototype(new AccountEconomy(1),new SecurityManagerEconomy());
        Prototype std = new Prototype(new AccountStd(2), new SecurityManagerStd());
        Prototype pro = new Prototype(new AccountPro(3), new SecurityManagerPro());

        /** Create array of users, 3 for each kind of account */
        User[] users = new User[9];

        /** Fill the array of user accounts */
        for(int i = 0; i < 3; i++) {
            AccountIF account = eco.createAccount(rand.nextInt(100));
            SecurityManagerIF sm = eco.createSecurityManager();
            users[i] = new User(account, sm);
        }
        for(int i = 3; i < 6; i++) {
            AccountIF account = std.createAccount(rand.nextInt(100) + 100);
            SecurityManagerIF sm = std.createSecurityManager();
            users[i] = new User(account, sm);
        }
        for(int i = 6; i < 9; i++) {
            AccountIF account = pro.createAccount(rand.nextInt(100) + 200);
            SecurityManagerIF sm = pro.createSecurityManager();
            users[i] = new User(account, sm);
        }

        for(int i = 0; i < 9; i++) {
            System.out.println(users[i].toString());
            try {
                users[i].login();
            }
            catch(LimitsException le) {
                break;
            }
        }
    }
}
