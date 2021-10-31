package com.cryptocurrency.newbcoin;

import java.util.List;
import java.util.ArrayList;

public class BlockChain {

    private List<Block> chain = new ArrayList<>();
    private static int prefix = 5;

	public static String buildPrefixString(int prefix) {
		return new String(new char[prefix]).replace('\0', '0');
	}

    public void addBlock(String blockData) {

        String previousHash = "0"; 

        if(chain.size()>0) {
            previousHash = chain.get(chain.size() - 1).getHash();
        }
        Block block = new Block(blockData, previousHash);
        chain.add(block);
		block.mineBlock(prefix);
    }
    
    public Boolean check() {
		Block currentBlock;
		Block previousBlock;
		String hashTarget = buildPrefixString(prefix);

		// loop through blockchain to check hashes:
		for (int i = 1; i < chain.size(); i++) {
			currentBlock = chain.get(i);
			previousBlock = chain.get(i - 1);
			// compare registered hash and calculated hash:
			if (!currentBlock.getHash().equals(currentBlock.calculateBlockHash())) {
				System.out.println("Current Hashes not equal");
				return false;
			}
			// compare previous hash and registered previous hash
			if (!previousBlock.getHash().equals(currentBlock.getPreviousHash())) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			// check if hash is solved
			if (!currentBlock.getHash().substring(0, prefix).equals(hashTarget)) {
				System.out.println("This block hasn't been mined " + currentBlock.getHash() + " " + hashTarget);
				return false;
			}
		}
		return true;
	}
	
	public void accept(DisplayInformation di) {

        for (Block nb : chain) {
			di.displaySingleBloc(chain.indexOf(nb), nb);
		}
	}
}