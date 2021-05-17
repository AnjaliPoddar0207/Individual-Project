package com.sjsu.anjali.ccproject.fileReaderWriter;

import com.sjsu.anjali.ccproject.data.CreditCard;
import com.sjsu.anjali.ccproject.factory.CreditCardFactory;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class CSVFile {
    public List<CreditCard> finalCreditCards = new ArrayList<>();

    public void readCSV(String file) throws Exception {
        if (!file.endsWith(".csv"))
            throw new IllegalAccessException("This is not a csv file");
        BufferedReader br;
        String line;
        String cvsSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(file));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] creditCards = line.split(cvsSplitBy);
                String cardNumber = creditCards[0];
                String expirationDate = creditCards[1];
                String cardHolder = creditCards[2];
                CreditCardFactory cf = new CreditCardFactory();
                CreditCard x = cf.createCard(cardNumber, cardHolder, expirationDate);
                if(x.getType().equalsIgnoreCase("Credit Card")){
                    x.setCardNumber(cardNumber);
                    x.setCardHolder(cardHolder);
                    x.setExpirationDate(expirationDate);
                }else {
                    finalCreditCards.add(x);
                    x.print();
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");
        } catch (IOException e) {
            throw new IOException("IO Exception");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            CreditCard card = new CreditCard();
            card.setType("Credit Card");
            card.setErrorType(e.getMessage());
            finalCreditCards.add(card);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public void writeCSV(String file) throws Exception {
        if (!file.endsWith(".csv"))
            throw new IllegalAccessException("This is not a csv file");
        try {
            FileWriter f = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(f);
            for (CreditCard c : finalCreditCards) {
                String tmp;
                if (!c.getType().equals("Credit Card")) {
                    tmp = c.cardNumber + "," + c.getType();
                }else{
                    tmp = c.getErrorType();
                }
                writer.write(tmp);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            throw new IOException("IO Exception");
        } catch (Exception e){
            throw new Exception("Exception throw");
        }
    }
}
