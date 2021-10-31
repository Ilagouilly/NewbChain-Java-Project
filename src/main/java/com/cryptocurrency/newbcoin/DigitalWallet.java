package com.cryptocurrency.newbcoin;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import com.google.bitcoin.core.Address;
import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.NetworkParameters;
import com.google.bitcoin.core.Wallet;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class DigitalWallet {

    private static final String SPEC = "secp256k1";
    private static final String ALGO = "SHA256withECDSA";

    private static DigitalWallet myWallet = null;
    File walletFile = new File("myWallet.secret");
    private String walletAddress = null;
    private String walletPublicKey = null;
    private String walletPrivateKey = null;

    public static DigitalWallet getInstance() {
        if (myWallet == null) {
            myWallet = new DigitalWallet();
        }
        return myWallet;
    }

    private DigitalWallet() {
        
        final NetworkParameters netParams = NetworkParameters.fromPmtProtocolID("test");
        Wallet wallet = new Wallet(netParams);

        // create a key and add it to the wallet
        wallet.addKey(new ECKey());
        // save wallet contents to disk
        try {
            wallet.saveToFile(walletFile);
        } catch (IOException e) {
            System.out.println("Unable to create wallet file.");
        }
        System.out.println("wallet"+wallet);
    }
}
