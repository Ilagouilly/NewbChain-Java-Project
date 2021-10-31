package com.cryptocurrency.newbcoin;

/**
 * Defines the methods required to display information
 */
public class DisplayInformationImpl implements DisplayInformation {

        @Override
        public void displayOpeningBanner() {
                StringBuilder builder = new StringBuilder();
                builder.append("\n");
                builder.append("                            888b    888                        888       .d8888b.           d8b          ");
                builder.append("                            8888b   888                        888      d88P  Y88b          Y8P          ");
                builder.append("                            88888b  888                        888      888    888                       ");
                builder.append("                            888Y88b 888  .d88b.  888  888  888 88888b.  888         .d88b.  888 88888b.  ");
                builder.append("                            888 Y88b888 d8P  Y8b 888  888  888 888  88b 888        d88  88b 888 888  88b ");
                builder.append("                            888  Y88888 88888888 888  888  888 888  888 888    888 888  888 888 888  888 ");
                builder.append("                            888   Y8888 Y8b.     Y88b 888 d88P 888 d88P Y88b  d88P Y88..88P 888 888  888 ");
                builder.append("                            888    Y888   Y8888    Y8888888P   88888P     Y8888P     Y88P   888 888  888 \n\n\n");

                System.out.println(builder.toString());
        }

        @Override
        public void displayClosingBanner() {

                System.out.println("\n\nEnd");
        }

        @Override
        public void displayValidityOfBlockChain(BlockChain newbchain) {

                System.out.print("Checking if the Chain is valid: " + newbchain.check());
        }

        @Override
        public void displayWallet(NewbCoinWallet newbCoinWallet) {
                StringBuilder builder = new StringBuilder();
                builder.append("My wallet:\n");
                builder.append("***********************************************************************************\n");
                builder.append(" Wallet Address: " + newbCoinWallet.getWalletAddress() + "\n");
                builder.append(" Public Key:     " + newbCoinWallet.getWalletPublicKey() + "\n");
                builder.append(" Private Key:    " + newbCoinWallet.getWalletPrivateKey() + "\n");
                builder.append("***********************************************************************************\n");

                System.out.println(builder.toString());
        }

        @Override
        public void displaySingleBloc(int index, Block bloc) {

                System.out.println("Block index: " + index + ", Block content: " + bloc.toString() + "\n\n");
        }

        @Override
        public void displayAllBlocks(BlockChain blockchain) {

                // use visitor pattern
                blockchain.accept(this);
        }

}
