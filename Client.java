package com.sanjaeJava.domain;

public class Client {
    private int idNumber;
    private String FirstName;
    private String LastName;
    private int Age;
    private Card newCard;//Composite has-a

    //public Client(){}

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

//    public void setNewCard(Card newCard) {
//
//        this.newCard = newCard;
//    }

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

//    public void clientPrompt(){
//        System.out.println("Enter Id # : ");
//        setIdNumber(scan.nextInt());
//        System.out.println("First Name : ");
//        setFirstName(scan.next());
//        System.out.println("Last Name : ");
//        setLastName(scan.next());
//        System.out.println("Age : ");
//        setAge(scan.nextInt());
//        System.out.println("Enter card details below : == \n");
//        System.out.println("Enter Card # : ");
//        newCard.setCardNumber(scan.nextInt());
//        System.out.println("Enter PIN # : ");
//        newCard.setPin(scan.nextInt());
//        System.out.println("Enter Balance : $");
//        newCard.setBalance(scan.nextDouble());
//        System.out.println("Enter Status : ");
//        newCard.setStatus(scan.nextBoolean());
//
//    }

    public void Display(){
        System.out.println("ID # : " + getIdNumber() + "\nFirst Name : " + getFirstName() +
                "\nLast Name : " + getLastName() + "\nAge : " + getAge() + "\nCard Info : \n" + newCard.Display());
    }
}
