package com.cryptocurrency.newbchain;

import java.util.List;

/**                                                                                 
 *  Defines the methods required to display information                          
 */                                                                                   
public class DisplayInformationImpl implements DisplayInformation {

    @Override
    public void displayOpeningBanner() {
        
        System.out.println("\n");
        System.out.println("                            888b    888                        888       .d8888b.  888               d8b          ");
        System.out.println("                            8888b   888                        888      d88P  Y88b 888               Y8P          ");
        System.out.println("                            88888b  888                        888      888    888 888                            ");
        System.out.println("                            888Y88b 888  .d88b.  888  888  888 88888b.  888        88888b.   8888b.  888 88888b.  ");
        System.out.println("                            888 Y88b888 d8P  Y8b 888  888  888 888  88b 888        888  88b      88b 888 888  88b ");
        System.out.println("                            888  Y88888 88888888 888  888  888 888  888 888    888 888  888 .d888888 888 888  888 ");
        System.out.println("                            888   Y8888 Y8b.     Y88b 888 d88P 888 d88P Y88b  d88P 888  888 888  888 888 888  888 ");
        System.out.println("                            888    Y888   Y8888    Y8888888P   88888P     Y8888P   888  888  Y888888 888 888  888 \n\n\n");
    }

    @Override
    public void displayClosingBanner() {

        System.out.print("\n\nEnd");
    }

    @Override
    public void displayValidityOfBlockChain(BlockChain blockchain) {

        System.out.print("Checking if the Chain is valid: "+ blockchain.check());
    }

    @Override
    public void displaySingleBloc(int index, Block bloc) {

        System.out.println("Block index: " + index + ", Block content: " + bloc.toString() + "\n\n");
    }

    @Override
    public void displayAllBlocks(BlockChain blockchain){

        // use visitor pattern
        blockchain.accept(this);
    }    
}
