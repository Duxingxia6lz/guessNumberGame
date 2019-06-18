package game;

import java.util.Random;

public class RamdomGameComputer02 {
/*
* 让电脑自己猜自己出的数字.
* 随机数
* */

    public static void main(String[] args) {
        int n = 1000000;//取值长度100

        Random r = new Random();
        int aimNum = r.nextInt(n) + 1;//1-100
        System.out.println("目标是:" + aimNum);
        System.out.println("========");


        int guessNum = r.nextInt(n) + 1;
        int count = 1;
        int minLimt = 0;
        int maxLimt = n;

        while (count < 200) {
            if (guessNum > aimNum) {
                System.out.println("第" + count + "次:" + guessNum + ",比目标大");
                maxLimt = guessNum-1;
                guessNum =r.nextInt(maxLimt-minLimt+1) + minLimt;//在minNum和maxNum之间求一个随机数.
                count++;
                System.out.println("目标范围是:" + minLimt + "到" + maxLimt);
                System.out.println("范围大小"+(maxLimt-minLimt));
                System.out.println("================");

            } else if (guessNum < aimNum) {
                System.out.println("第" + count + "次:" + guessNum + ",比目标小");
                minLimt = guessNum+1;
                guessNum =r.nextInt(maxLimt-minLimt+1) + minLimt;//在minNum和maxNum之间求一个随机数.
                count++;

                System.out.println("目标范围是:" + minLimt + "到" + maxLimt);
                System.out.println("范围大小"+(maxLimt-minLimt));
                System.out.println("================");

            } else {
                System.out.println("此时的数字为:" + guessNum + ",共用" + count + "次");
                System.out.println("目标是:" + aimNum);
                break;
            }

        }

        System.out.println("机会用尽,GameOver!");
    }
}

