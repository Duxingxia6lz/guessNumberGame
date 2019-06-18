package game;

import java.util.Random;
import java.util.Scanner;

public class Demo01RandomGame {
    /*
     猜数字小游戏. 最多只能猜5次.如何实现.
    **/
    public static void main(String[] args) {
        Random r = new Random();
        int aimNum = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            System.out.println("请输入猜测的数字:");
            int guessNum = sc.nextInt();
            if (i == 5) {
                System.out.println("次数已用完,GameOver!");
                break;
            } else {
                System.out.println("您还有"+(5-i)+"次机会");
                if (guessNum > aimNum) {
                    System.out.println("猜大了");
                } else if (guessNum < aimNum) {
                    System.out.println("猜小了");
                } else {
                    System.out.println("祝贺你,猜中了,目标是" + aimNum);
                    break;
                }
            }
        }

    }
}
