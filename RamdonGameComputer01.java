package game;

import java.util.Random;

public class RamdonGameComputer01 {
    /*
     * 二分法求随机数
     */
    public static void main(String[] args) {
        int n = 10000000;//范围

        Random r = new Random();
        int aimNum = r.nextInt(n) + 1;//自定一个目标
        System.out.println("目标是:" + aimNum);
        System.out.println("========");

        int guessNum = n / 2;
        int count = 1;

        int minLimt = 0;
        int maxLimt = n;

        while (count < 200) {
            if (guessNum > aimNum) {
                System.out.println("第" + count + "次:" + guessNum + ",比目标大");
                maxLimt = guessNum-1;
                guessNum = (minLimt + maxLimt) / 2;
                count++;
                System.out.println("目标范围是:" + minLimt + "到" + maxLimt);
                System.out.println("================");

            } else if (guessNum < aimNum) {
                System.out.println("第" + count + "次:" + guessNum + ",比目标小");
                minLimt = guessNum+1;
                guessNum = (minLimt + maxLimt) / 2;
                count++;

                System.out.println("目标范围是:" + minLimt + "到" + maxLimt);
                System.out.println("================");

            } else {
                System.out.println("此时的数字为:" + guessNum + ",共用" + count + "次");
                break;
            }

        }
    }
}
