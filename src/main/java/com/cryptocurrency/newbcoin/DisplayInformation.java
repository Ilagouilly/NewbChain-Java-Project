package com.cryptocurrency.newbcoin;

/**
 * Describes the methods required to display information
 */
public interface DisplayInformation {

    public void displayOpeningBanner();

    public void displayClosingBanner();

    public void displayValidityOfBlockChain(BlockChain blockchain);

    public void displaySingleBloc(int index, Block bloc);

    public void displayAllBlocks(BlockChain blockchain);

    public void displayWallet(NewbCoinWallet myWallet);
}
