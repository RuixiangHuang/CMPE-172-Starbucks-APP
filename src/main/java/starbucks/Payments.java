/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks ;

/** Payments Screen */
public class Payments extends Screen
{

    public Payments()
    {

    }

    /**
     * Return Payments Screen
     * @return Contents from Payments Screen
     */
    public String display() {
        return "Find Store\nCheck Rewards" ;
    }

    public void touch(int x, int y) {
        AppController app = AppController.getInstance() ;
        if ( x == 3 && y == 3 ) {
            app.setScreen( AppController.SCREENS.MY_REWARDS ) ;
        }
        if ( x == 2 && y == 2 ) {
            app.setScreen( AppController.SCREENS.MY_STORE ) ;
        }
    }
}

