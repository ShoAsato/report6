package jp.ac.uryukyu.ie.e195750;


import java.util.Scanner;

public class Game {
    String question;


    public Game(String question) {
        this.question = question;
    }

    public String toString() {
        return question;
    }

    Scanner sc = new Scanner(System.in);
    int sntence = sc.nextInt();



}

class Contorol{
    public void start(){
        System.out.println("これからクイズをはじめます。");
    }
}



