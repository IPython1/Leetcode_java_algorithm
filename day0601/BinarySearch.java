package day0601;

import java.util.*;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/5/30 12:23
 * @Description:java实现 二分查找
 **/
public class BinarySearch {
    public static  void main(String[] args) {
        //由于 char 类型在Java中是16位的Unicode字符，所以它可以自动转换（提升）为 int 类型。
        // 因此，'1'（即49）和 188 被当作整数相加，结果是 237
        System.out.println('1'+188);
        //字符串的拼接
        System.out.println("1"+188);
        System.out.println(188+"1");
        int a[]={1,2,3,4,5,6,7,8,9};
        //二分查找
        int l=0,r=a.length-1;
        int x=4;
        int mid = -999;
        while(l<r){
            mid=l+r>>1;
            if (a[mid]>=x) r=mid;
            else l=mid+1;
        }
        System.out.println(mid);
        //arrays工具类
        int[] arr = { 67, 12, 45, 68, 6 };
        //利用Arrays实现排序
        Arrays.sort(arr);
        //输出
        System.out.println(Arrays.toString(arr));
        


    }
}
