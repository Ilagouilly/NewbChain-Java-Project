package com.cryptocurrency.newbchain;

import java.util.ArrayList;

/**
 * this class contains the minimum instructions required to create and test our crypocurrency.
 */
public class Main {

    public static ArrayList<Block> newbchain = new ArrayList<Block>();
	public static int prefix = 5;

    public static void main(String[] args) {

        // DisplayInformation Instantiation
        DisplayInformation displayScoresImplSystemOut = new DisplayInformationImpl();

        // Display opening banner
        displayScoresImplSystemOut.displayOpeningBanner();

        newbchain.add(new Block("Thomas sends 1n to Jean-françois", "0"));		
		newbchain.add(new Block("Jean-françois sends 0.1n to Taqueria el farolito", newbchain.get(newbchain.size()-1).getHash())); 
		newbchain.add(new Block("José sends 5n to Maria", newbchain.get(newbchain.size()-1).getHash()));
		
        for(Block nb : newbchain){
            System.out.println(nb.toString() + "\n\n");
        }
		
        // Display closing banner
        displayScoresImplSystemOut.displayClosingBanner();
    }
}
