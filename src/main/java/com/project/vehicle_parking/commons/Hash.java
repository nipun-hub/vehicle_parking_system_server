package com.project.vehicle_parking.commons;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Hash {

    public static String make(String text) {
        var encoder = new BCryptPasswordEncoder();
        return encoder.encode(text);
    }

    public static boolean match(String text, String hash) {
        var encoder = new BCryptPasswordEncoder();
        return encoder.matches(text, hash);
    }
}
