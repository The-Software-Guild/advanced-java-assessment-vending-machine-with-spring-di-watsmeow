package com.watsmeow.VendingMachine.ui;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
* This class implements the UserIO by defining the public methods that  print out information to the user and
* take in the user's input
* */
@Component
public class UserConsoleImpl implements UserIO {
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public BigDecimal takeMoney(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        double userInput = scanner.nextDouble();
        BigDecimal bigDecInput = new BigDecimal(userInput);
        bigDecInput.setScale(2, RoundingMode.HALF_UP);
        return bigDecInput;
    }

    @Override
    public String readString(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        String userInput = scanner.nextLine();
        return userInput;
    }


}
