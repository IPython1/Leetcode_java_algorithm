package day0420;
import java.util.*;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/4/20 16:50
 * @Description:对数组实现快速排序算法，手写+调用collections中的sort函数
 **/
public class test {

    //手写java的快速排序
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void quick_sort(int a[],int l,int r){
        if(l>=r) return;
        int i=l-1,j=r+1;
        int x=a[l+r>>1];
        while(i<j){
            do i++;while(a[i]<x);
            do j--;while(a[j]>x);
            if (i<j) swap(a,i,j);
        }
        //对左右部分继续进行递归排序
        quick_sort(a,l,j);
        quick_sort(a,j+1,r);
    }
    public static void main(String[] args) {
//        int[] a={5,4,3,2,1};
//        int l=0,r=a.length-1;
////        quick_sort(a,l,r);
//        for (int i=l;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        Integer[] array = {5, 4, 3, 2, 1};


        // 将数组转换为列表
        List<Integer> list = Arrays.asList(array);

        // 使用 Collections.sort() 方法对列表进行排序
        Collections.sort(list);

        // 输出排序后的结果
        for (int num : list) {
            System.out.print(num + " ");
        }

    }
}
