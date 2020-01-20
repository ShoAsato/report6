package jp.ac.uryukyu.ie.e195750;


import java.util.Scanner;

public  class Game {
    String question;

    public Game(String question) {

        this.question = question;
    }

    public String toString() {

        return question;
    }


}


class Quiz1 {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();


    public void answer() {
        String ans = null;

        if (this.d == 1) {
            ans = "正解！";
            System.out.println(ans);
        }
        else if(this.d == 2){
            ans = "正解は2です";
            System.out.println(ans);
        }
        else if(this.d == 3){
            ans = "正解は3です";
            System.out.println(ans);
            }


        }

    }

class Quiz2 {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();


    public void answer() {
        String ans = null;

        if (this.d == 1) {
            ans = "正解は3です";
            System.out.println(ans);
        }
        else if(this.d == 2){
            ans = "正解は3です";
            System.out.println(ans);
        }
        else if(this.d == 3){
            ans = "正解！";
            System.out.println(ans);
        }


    }

}

