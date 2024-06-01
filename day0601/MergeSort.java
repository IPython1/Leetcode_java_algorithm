package day0601;

import java.util.Scanner;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/6/1 17:29
 * @Description:归并排序 时间复杂度O(nlogn) 稳定的 原序列值相同，排序后相对位置不发生改变，即是稳定的
 * 1.确定分界点 mid=l+r>>1 分界点为位置
 * 2.递归排序 left right
 * 3.两个有序序列进行归并 1 3 5 7 9 两个指针分别指向两个序列的第一个元素，进行比较，谁最小拿出来并且指针右移
 * ······2 4 5 8 10
 * 1 2 3 4 5 5 7 8 9 10
 **/

public class MergeSort {
    public static int N=100;
    public static int[] tmp = new int[N];
    public static void merge_sort(int[] q,int l,int r) {
        //递归终止情况 区间里元素个数是1个或没有时 l:0 r:n-1
        if(l>=r) return;
        int mid =l+r>>1;
        //递归处理左右两边
        merge_sort(q,l,mid);
        merge_sort(q,mid+1,r);
        //合并 k表示当前tmp中已经合并了个数了 i指向左半边的起点，j指向右半边的起点
        int k=0,i=l,j=mid+1;

        while(i<=mid && j<=r) {
            if(q[i]<=q[j]) tmp[k++] = q[i++];
            else tmp[k++] = q[j++];
        }
        //可能左半边或者右半边没有循环完  再次进行判断
        while(i<=mid) tmp[k++] = q[i++];
        while(j<=r) tmp[k++] = q[j++];
        //复制回原数组
        for ( i=l,j=0;i<=r;i++,j++) q[i]=tmp[j];
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int q[]=new int[n];
        for(int i=0;i<n;i++)
            q[i]=sc.nextInt();
        merge_sort(q,0,n-1);
        for(int i=0;i<n;i++)
            System.out.printf("%d ",q[i]);
    }
}
