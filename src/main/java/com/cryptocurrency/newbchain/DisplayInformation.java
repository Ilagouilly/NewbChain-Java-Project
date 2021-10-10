package com.cryptocurrency.newbchain;

/** 
*  Describes the methods required to display information
*/
public interface DisplayInformation {

    public void displayOpeningBanner();
    public void displayClosingBanner();
    public void displayValidityOfBlockChain(boolean isValid);
    public void displayAllBlocks(BlockChain blockchain);
}
