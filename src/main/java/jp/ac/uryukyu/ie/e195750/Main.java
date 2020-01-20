package jp.ac.uryukyu.ie.e195750;


public class Main {
    public static void main(String[] args){



        Game[] game = {
            new Game("オーストラリアの首都はどこでしょうか？"),
            new Game("1 キャンベラ"),
            new Game("2 シドニー"),
            new Game("3 ブリスベン"),
            new Game("キリンの１日の市民時間は？"),
            new Game("1 20時間"),
            new Game("2 8時間"),
            new Game("3 20分"),

        };

        for(int i=0; i<4;i++) {
            System.out.println(game[i]);
        }



        Quiz1 quiz1 = new Quiz1();
        quiz1.answer();

        for(int i=4; i<8; i++) {
            System.out.println(game[i]);
        }
        Quiz2 quiz2 = new Quiz2();
        quiz2.answer();



    }


}
