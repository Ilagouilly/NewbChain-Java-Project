package com.cryptocurrency.newbcoin;

/**
 * this class contains the minimum instructions required to create and test our
 * crypocurrency.
 */
public class Main {

	public static final int PREFIX = 5;

	public static void main(String[] args) {

		// DisplayInformation Instantiation
		DisplayInformation displayDataImplSystemOut = new DisplayInformationImpl();

		// Display opening banner
		displayDataImplSystemOut.displayOpeningBanner();

		NewbCoinWallet myWallet = NewbCoinWallet.getInstance();

		// Display all blocks
		displayDataImplSystemOut.displayWallet(myWallet);

		BlockChain blockChain = new BlockChain();
		blockChain.addBlock("Thomas sends 1n to Jean-françois");
		blockChain.addBlock("Jean-françois sends 0.1n to Taqueria el farolito");
		blockChain.addBlock("José sends 5n to Maria");

		// Display all blocks
		displayDataImplSystemOut.displayAllBlocks(blockChain);

		// Check and display if the BlockChain is valid
		displayDataImplSystemOut.displayValidityOfBlockChain(blockChain);

		// Display closing banner
		displayDataImplSystemOut.displayClosingBanner();

		// Close the program
		System.exit(0);
	}
}
