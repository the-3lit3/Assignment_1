package com.sanjaeJava.domain;

public class Client {
    private int idNumber;
    private String FirstName;
    private String LastName;
    private int Age;
    private Card newCard; //Composite has-a

    public Client(int idNumber, String firstName, String lastName, int age, Card newCard) {
        this.idNumber = idNumber;
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        this.newCard = newCard;
    }


    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(int age) {
        Age = age;
    }

    //Getters below this line
    public int getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    public Card getNewCard() {
        return newCard;
    }

    public void Display(){
        System.out.println("ID # : " + getIdNumber() + "\nFirst Name : " + getFirstName() +
                "\nLast Name : " + getLastName() + "\nAge : " + getAge() + "\nCard Info : \n" + newCard.Display());
    }

    public void cardDisplay(){
        System.out.println(newCard.Display());
    }
}
