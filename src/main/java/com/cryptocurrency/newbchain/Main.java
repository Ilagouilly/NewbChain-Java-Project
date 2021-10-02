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
        
        Block block1 = new Block("Thomas sends 1n to Jean-françois", "0");
        block1.mineBlock(prefix);
        newbchain.add(block1);

        Block block2 = new Block("Jean-françois sends 0.1n to Taqueria el farolito", newbchain.get(newbchain.size()-1).getHash());	
		block2.mineBlock(prefix);
        newbchain.add(block2);   

		Block block3 = new Block("José sends 5n to Maria", newbchain.get(newbchain.size()-1).getHash()); 
        block3.mineBlock(prefix);
        newbchain.add(block3);
		
        for(Block nb : newbchain){
            System.out.println(nb.toString() + "\n\n");
        }

        System.out.println("Checking if the Chain is valid: "+isChainValid());
		
        // Display closing banner
        displayScoresImplSystemOut.displayClosingBanner();
    }

    public static Boolean isChainValid() {
		Block currentBlock; 
		Block previousBlock;
		String hashTarget = new String(new char[prefix]).replace('\0', '0');
		
		//loop through blockchain to check hashes:
		for(int i=1; i < newbchain.size(); i++) {
			currentBlock = newbchain.get(i);
			previousBlock = newbchain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.getHash().equals(currentBlock.calculateBlockHash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.getHash().equals(currentBlock.getPreviousHash()) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hash is solved
			if(!currentBlock.getHash().substring( 0, prefix).equals(hashTarget)) {
				System.out.println("This block hasn't been mined "+ currentBlock.getHash() +" "+ hashTarget);
				return false;
			}
		}
		return true;
	}
}
