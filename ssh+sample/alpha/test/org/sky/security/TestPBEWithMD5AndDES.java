package org.sky.security;

import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKeyFactory;

public class TestPBEWithMD5AndDES {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			for (Object obj : java.security.Security.getAlgorithms("Cipher")) {
				System.out.println(obj);
			}
			SecretKeyFactory.getInstance("PBEWITHMD5ANDDES");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
