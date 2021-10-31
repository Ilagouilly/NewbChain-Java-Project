package com.cryptocurrency.newbcoin;

import java.security.MessageDigest;

/**
 * This class handles everything related generating a digital fingerprint for
 * our Blockchain.
 */
public class DigitalSignature {

	/**
	 * Applies Sha256 to a string and returns the result
	 *
	 * @param input string message we want to use hash on
	 * @return the generated signature as a string
	 */
	public static String applySha256(String input) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			// Applies sha256 to our input
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}