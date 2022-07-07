package com.brideglabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {

    public static void checkValidPinCode(String pinCode){

        boolean isPinCode;
        String pinCodeRegex = "^[0-9]{6}$";
        Pattern patternObject = Pattern.compile(pinCodeRegex);
        if (pinCode == null) {
            isPinCode = false;
        }
        Matcher matcherObject = patternObject.matcher(pinCode);
        isPinCode =  matcherObject.matches();

        if(isPinCode)
            System.out.println(pinCode+" is a Valid PinCode");
        else
            System.out.println(pinCode+" is an Invalid PinCode");
    }

    public static void main(String[] args) {

        System.out.println(" Welcome To Pin Code Validator");

        String pinCode = "400088";
        checkValidPinCode(pinCode);
        pinCode = "A400088";
        checkValidPinCode(pinCode);


    }

}
