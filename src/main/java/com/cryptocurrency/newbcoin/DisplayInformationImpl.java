package com.cryptocurrency.newbcoin;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**                                                                                 
 *  Defines the methods required to display information                          
 */                                                                                   
public class DisplayInformationImpl implements DisplayInformation {

    private static Logger LOGGER = LoggerFactory.getLogger(DisplayInformationImpl.class);
    
    
    @Override
    public void displayOpeningBanner() {
        
        System.out.println("\n");
        System.out.println("                            888b    888                        888       .d8888b.           d8b          ");
        System.out.println("                            8888b   888                        888      d88P  Y88b          Y8P          ");
        System.out.println("                            88888b  888                        888      888    888                       ");
        System.out.println("                            888Y88b 888  .d88b.  888  888  888 88888b.  888         .d88b.  888 88888b.  ");
        System.out.println("                            888 Y88b888 d8P  Y8b 888  888  888 888  88b 888        d88  88b 888 888  88b ");
        System.out.println("                            888  Y88888 88888888 888  888  888 888  888 888    888 888  888 888 888  888 ");
        System.out.println("                            888   Y8888 Y8b.     Y88b 888 d88P 888 d88P Y88b  d88P Y88..88P 888 888  888 ");
        System.out.println("                            888    Y888   Y8888    Y8888888P   88888P     Y8888P     Y88P   888 888  888 \n\n\n");
        }

    @Override
    public void displayClosingBanner() {

        System.out.println("\n\nEnd");
    }

    @Override
    public void displayValidityOfBlockChain(boolean isValid) {

        System.out.print("Checking if the Chain is valid: {0}", isValid);
    }

    @Override
    public void displayAllBlocks(List<Block> newbchain){

        for (Block nb : newbchain) {
			LOGGER.info("Block index: {0}, Block content: {1}\n\n", newbchain.indexOf(nb), nb.toString());
		}
    }

    @Override
    public void displayWallet(DigitalWallet myWallet) {

        LOGGER.info("My wallet:");
        LOGGER.info("*********************************************************************************");
        LOGGER.info("PublicKey: {0}", myWallet.getWalletPublicKey());
        LOGGER.info("PrivateKey: {0}", myWallet.getWalletPrivateKey());
        LOGGER.info("Address: {0}", myWallet.getWalletAddress());
        LOGGER.info("*********************************************************************************\n");
    }
    
}
