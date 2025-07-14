package com.xworkz.optional;

import java.util.Optional;

public class OptionalRunner {


        public Optional<Long> getMobileByName(String name) {
            System.out.println("running getMobileByName with Args " + name);
            if ("Supriya".equals(name)) {
                return Optional.of(7760539880L);
            }
            return Optional.empty();
        }

        public static void main(String[] args) {
            OptionalRunner runner = new OptionalRunner();
            Optional<Long> optionalMobile = runner.getMobileByName("Supriya");

            if (optionalMobile.isPresent()) {
                Long mobileNo = optionalMobile.get();
                System.out.println("Mobile number: " + mobileNo);
            } else {
                System.out.println("Mobile not found");
            }
        }
    }