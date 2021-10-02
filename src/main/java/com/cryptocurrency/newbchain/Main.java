package com.cryptocurrency.newbchain;

import java.util.Scanner;

/**
 * Created by Ismail Lagouilly.
 */

/* ******************************************************************************** */
/*                                                                                  */
/*  Main Class                                                                      */
/*                                                                                  */
/*  Contains the minimum instructions required to create a new cryptocurrency.      */
/*                                                                                  */
/*                                                                                  */
/* ******************************************************************************** */

public class Main {

    public static void main(String[] args) {

        // DisplayInformation Instantiation
        DisplayInformation displayScoresImplSystemOut = new DisplayInformationImpl();

        // Display opening banner
        displayScoresImplSystemOut.displayOpeningBanner();

                // Display closing banner
        displayScoresImplSystemOut.displayClosingBanner();
    }
}
