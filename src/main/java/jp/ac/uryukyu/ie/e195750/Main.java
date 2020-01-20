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
            new Game("古代ローマの人が洗剤がわりに使っていたものは？"),
            new Game("1 ワイン"),
            new Game("2 砂"),
            new Game("3 おしっこ"),
            new Game("トイレでよく見かけるトイレットペーパーの三角折の意味はなんでしょう？"),
            new Game("1 幸運のおまじない"),
            new Game("2 「清掃完了しました」という合図"),
            new Game("3 紙を引き出しやすいように"),
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

        for(int i=8; i<12; i++){
            System.out.println(game[i]);
        }
        Quiz3 quiz3 = new Quiz3();
        quiz3.answer();

        for (int i=12; i<16; i++){
            System.out.println(game[i]);
        }
        Quiz4 quiz4 = new Quiz4();
        quiz4.answer();
    }
}
