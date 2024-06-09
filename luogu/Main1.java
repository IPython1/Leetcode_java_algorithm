package luogu;

import java.util.Scanner;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/6/4 12:27
 * @Description:
 **/
public class Main1 {
    static int res=0;
    public static int judge(int n){
        if(n%2==0){
            //可以分两份
            return n/2;
        }else {
            res++;
            return (n-1)/2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true){
            n=judge(n);
            if(n==1){
                break;
            }
        }
        res++;
        System.out.println(res);
    }
}
//1+1+1+1+1

