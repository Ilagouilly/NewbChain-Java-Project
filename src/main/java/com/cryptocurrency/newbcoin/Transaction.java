package com.cryptocurrency.newbcoin;

public class Transaction {

    private String senderPublicKey = null;
    private String receiverPublicKey = null;
    private Integer amount = null;

    public Transaction(String senderPublicKey, String receiverPublicKey, Integer amount) {
        this.senderPublicKey = senderPublicKey;
        this.receiverPublicKey = receiverPublicKey;
        this.amount = amount;
    }
    // TO DO implement how a transaction will be signed using the private key of the
    // sender
    // And will be added to the blockchain
}
