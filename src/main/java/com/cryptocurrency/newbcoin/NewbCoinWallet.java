package com.cryptocurrency.newbcoin;

import java.io.File;
import java.io.IOException;

import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.NetworkParameters;
import com.google.bitcoin.core.Utils;
import com.google.bitcoin.core.Wallet;

public class NewbCoinWallet extends Wallet {

    private static final NetworkParameters netParams = NetworkParameters.fromPmtProtocolID("test");
    private static File walletFile = new File("myWallet.secret");
    private static NewbCoinWallet newbCoinWallet = null;
    private static String walletAddress = null;
    private static String walletPrivateKey = null;
    private static String walletPublicKey = null;
    private static Integer walletBalance = null;

    private NewbCoinWallet(NetworkParameters netParams) {
        super(netParams);
    }

    public static NewbCoinWallet getInstance() {
        if (newbCoinWallet == null) {

            newbCoinWallet = new NewbCoinWallet(netParams);
            // create a key and add it to the wallet
            ECKey ecKey = new ECKey();
            newbCoinWallet.addKey(ecKey);

            walletPublicKey = Utils.bytesToHexString(ecKey.getPubKey());
            walletPrivateKey = Utils.bytesToHexString(ecKey.getPrivKeyBytes());
            walletAddress = ecKey.toAddress(newbCoinWallet.getParams()).toString();
            walletBalance = 0;

            // save wallet contents to disk
            try {
                newbCoinWallet.saveToFile(walletFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return newbCoinWallet;
    }

    public static String getWalletAddress() {
        return walletAddress;
    }

    public static String getWalletPrivateKey() {
        return walletPrivateKey;
    }

    public static String getWalletPublicKey() {
        return walletPublicKey;
    }

    public static Integer getWalletBalance() {
        return walletBalance;
    }
}
