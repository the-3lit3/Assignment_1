package com.sanjaeJava.domain;

public class Card {
    private int CardNumber;
    private int Pin;
    private double Balance;
    private boolean Status;

    public Card(){}
    public Card(int cardNumber, int pin, double balance, boolean status) {
        CardNumber = cardNumber;
        Pin = pin;
        Balance = balance;
        Status = status;
    }


    public void setCardNumber(int cardNumber) {
        this.CardNumber = cardNumber;
    }

    public void setPin(int pin) {
        this.Pin = pin;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
    //Getters below this line
    public int getCardNumber() {
        return CardNumber;
    }

    public int getPin() {
        return Pin;
    }

    public double getBalance() {
        return Balance;
    }

    public boolean isStatus() {
        return Status;
    }

    public String Display(){

        return String.format("Card # : %d\nPin # : %d\nBalance : $%.2f\nCard Status : %B", getCardNumber(), getPin(), getBalance(), isStatus());
    }
}
