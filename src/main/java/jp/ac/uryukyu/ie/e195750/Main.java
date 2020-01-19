package jp.ac.uryukyu.ie.e195750;


public class Main {
    public static void main(String[] args){

        Contorol contorol = new Contorol();
        contorol.start();

        Game[] game = {
            new Game("(1)　現在の元号は？"),
            new Game(""),

        };

        for(int i=0; i<game.length; i++){
            System.out.println(game[i].toString());
        }






    }
}
