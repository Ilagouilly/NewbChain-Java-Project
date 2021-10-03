package com.cryptocurrency.newbchain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

/**
 * This class handles everything related to Blocks that will later constitute a Blockchain.
 */
@ToString
@Getter
@Setter
public class Block {

    private String hash;
    private String previousHash;
    private String data; // data will be contain a summary of a transaction.
    private long timeStamp;
    private int nonce; // an arbitrary number (to iterate from) used in cryptography

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateBlockHash();
    }

    public String mineBlock(int prefix) {
        String prefixString = new String(new char[prefix]).replace('\0', '0');
        while (!hash.substring(0, prefix).equals(prefixString)) {
            nonce++;
            hash = calculateBlockHash();
        }
        return hash;
    }

    String calculateBlockHash() {
        String calculatedhash = DigitalSignature.applySha256( 
            previousHash +
            Long.toString(timeStamp) +
            Integer.toString(nonce) +
            data 
            );
        return calculatedhash;
    }
}
