package com.sjsu.anjali.ccproject.factory;

import com.sjsu.anjali.ccproject.data.AmExCC;
import com.sjsu.anjali.ccproject.data.CreditCard;
import com.sjsu.anjali.ccproject.data.MasterCC;
import com.sjsu.anjali.ccproject.data.VisaCC;

public class CreditCardFactory {

    private String cardType = "Credit Card";
    private CreditCard cc;
    public CreditCard createCard(String number, String cardHolder, String expirationDate) {
        cc = new CreditCard(number, cardHolder, expirationDate, cardType);
        if (number.length() == 0 || number.length() > 19)
            return cc;
        else if (isMasterCard(number)) {
            setType("Master Card");
            cc = new MasterCC(number, cardHolder, expirationDate, cardType);
        }
        else if (isVisa(number)) {
            setType("Visa Card");
            cc = new VisaCC(number, cardHolder, expirationDate, "Visa Card");
        }
        else if (isAmericanExpress(number)) {
            setType("American Express Card");
            cc = new AmExCC(number, cardHolder, expirationDate, cardType);
        }
        return cc;
    }

    private boolean isMasterCard(String number){

        if (number.length() != 16)
            return false;
        int i = Integer.parseInt(String.valueOf(number.charAt(1)));
        return (number.charAt(0) == '5'
                && i >= 1
                && i <= 5);
    }

    private boolean isVisa(String number){
        if (number.length() != 16 && number.length() != 13)
            return false;
        return number.charAt(0) == '4';
    }

    private boolean isAmericanExpress(String number){
        if (number.length() != 15)
            return false;
        return (number.charAt(0) == '3'
                && ( number.charAt(1) == '4'
                || number.charAt(1) == '7' ));
    }

    public void setType(String type){
        cardType = type;
    }
}
