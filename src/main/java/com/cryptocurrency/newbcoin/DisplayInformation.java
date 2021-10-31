package com.cryptocurrency.newbcoin;

import java.util.List;

/** 
*  Describes the methods required to display information
*/
public interface DisplayInformation {

    public void displayOpeningBanner();
    public void displayClosingBanner();
    public void displayValidityOfBlockChain(boolean isValid);
    public void displayAllBlocks(List<Block> newbchain);
    public void displayWallet(DigitalWallet myWallet);
}
