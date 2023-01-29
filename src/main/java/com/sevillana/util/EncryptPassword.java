package com.sevillana.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptPassword {
	
	public static void main(String[] args) {
		 System.out.println(encrypt("123"));
	}
	
	public static String encrypt(String string) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.encode(string);
	}
}
