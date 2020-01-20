package jp.ac.uryukyu.ie.e195750;


public class Main {
    public static void main(String[] args){



        Game[] game = {
            new Game("現在の元号は？"),
            new Game("1 平成"),
            new Game("2 令和"),
            new Game("3 昭和"),

        };
        System.out.println(game[0]);
        System.out.println(game[1]);
        System.out.println(game[2]);
        System.out.println(game[3]);


        Game1 game1s = new Game1();

        Contorol contorol = new Contorol();






        /*for(int i=0; i<game.length; i++){
            System.out.println(game[i].toString());
        }**/
        contorol.start();
        contorol.answer();



    }


}
