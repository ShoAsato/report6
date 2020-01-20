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
class Game1{

}



    class Contorol {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        void start(){
            System.out.println("これか");
        }


        public void answer() {
            String ans = null;

            if (this.d == 0) {
                ans = "seikai";
                System.out.println(ans);
            }





        }

    }

