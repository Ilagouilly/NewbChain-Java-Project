package com.cryptocurrency.newbchain;

/**
 * Created by Ismail Lagouilly.
 */

/* ********************************************************************************* */
/*                                                                                   */
/*  DisplayInformationImpl Class                                                     */
/*                                                                                   */
/*  Defines the methods required to display information.                             */
/*                                                                                   */
/* ********************************************************************************* */

public class DisplayInformationImpl implements DisplayInformation {

    @Override
    public void displayOpeningBanner() {
        System.out.println("Start\n\n\n");
    }

    @Override
    public void displayClosingBanner() {

        System.out.println("\n\n\nEnd");
    }
}
