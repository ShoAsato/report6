package jp.ac.uryukyu.ie.e195750;

import java.util.Scanner;

/**
 * Gameクラス
 */
public  class Game {
    String question;

    /**
     *コンストラクタ
     * @param question　問題文
     */
    public Game(String question) {

        this.question = question;
    }

    /**
     *getterメソッドと同様
     * @return
     */

    public String toString() {

        return question;
    }


}

/**
 * 入力された数字を取り込む
 */

class Scan{
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();

}

/**
 *Scanを継承
 * Quiz1クラス
 */
class Quiz1 extends Scan{

    /**
     *正解か不正解かを判定するメソッド
     */

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

class Quiz2 extends Scan  {


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

class Quiz3 extends Scan{


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

class Quiz4 extends Scan{

    public void answer() {
        String ans = null;

        if (this.d == 1) {
            ans = "正解は2です";
            System.out.println(ans);
        }
        else if(this.d == 2){
            ans = "正解!";
            System.out.println(ans);
        }
        else if(this.d == 3){
            ans = "正解は2です";
            System.out.println(ans);
        }


    }

}

