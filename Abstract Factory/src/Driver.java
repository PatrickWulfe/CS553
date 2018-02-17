import pattpack.account.*;

import java.util.Random;

public class Driver {
    public static void main (String[] ignore) {
        Random rand = new Random();

        /** Create abstract factories */
        AbstractFactoryIF eco = new AbstractFactoryEconomy();
        AbstractFactoryIF std = new AbstractFactoryStd();
        AbstractFactoryIF pro = new AbstractFactoryPro();

        /** Create array of users, 3 for each kind of account */
        User[] users = new User[9];

        /** Fill the array of user accounts */
        for(int i = 0; i < 3; i++) {
            //AccountIF account = eco.createAccount(rand.nextInt(100));
            //SecurityManagerIF sm = eco.createSecurityManager();
            FullAccountIF acc = eco.fullAccountCreator(rand.nextInt(100));
            users[i] = new User(acc);
        }
        for(int i = 3; i < 6; i++) {
            //AccountIF account = std.createAccount(rand.nextInt(100) + 100);
            //SecurityManagerIF sm = std.createSecurityManager();
            FullAccountIF acc = std.fullAccountCreator(rand.nextInt(100) + 100);
            users[i] = new User(acc);
        }
        for(int i = 6; i < 9; i++) {
            //AccountIF account = pro.createAccount(rand.nextInt(100) + 200);
            //SecurityManagerIF sm = pro.createSecurityManager();
            FullAccountIF acc = pro.fullAccountCreator(rand.nextInt(100) + 200);
            users[i] = new User(acc);
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
