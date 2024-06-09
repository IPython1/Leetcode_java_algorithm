package luogu;

import java.util.Scanner;

/**
 * @Author:杰杰睡不醒
 * @Date:（当前日期）
 * @Description: 读取四个整数并计算表达式的值
 **/
public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);  //
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println(a + b + 2 * c + 3 * d);

    }
}