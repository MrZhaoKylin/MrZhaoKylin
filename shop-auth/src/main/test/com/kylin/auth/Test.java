package com.kylin.auth;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;

public class Test {


    public static void testPassword(){
        System.out.println(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("secret"));
    }

    public static void main(String[] args) {

    }
}
