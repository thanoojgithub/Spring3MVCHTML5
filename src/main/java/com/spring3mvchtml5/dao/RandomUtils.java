package com.spring3mvchtml5.dao;

import java.util.Random;

public class RandomUtils {

	private final static Random random = new Random();
	
	public static Random getRandom() {
		return random;
	}

	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private RandomUtils() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Generates a random String with the number of characters requested.
	 * @param amount
	 * The number of characters in the string. If negative, it will be treated as zero.
	 * @return The random String.
	 */
	public static String generateRandomString(int amount) {
		char[] characters = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
				'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z', };
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < amount; i++) {
			buffer.append(characters[getRandom().nextInt(characters.length - 1)]);
		}
		return buffer.toString();
	}
	
	public static Integer generateRandomInteger(Integer amount) {
		return getRandom().nextInt(amount);
	}
}
