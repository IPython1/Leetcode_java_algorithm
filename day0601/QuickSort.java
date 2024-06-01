package day0601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/6/1 17:12
 * @Description:快速排序模板  不稳定 平均时间复杂度O(nlogn)
 **/
public class QuickSort {
    public static void quickSort(int[] q, int l, int r) {
        if (l >= r) return;
        int x = q[l+r>>1];

        //Define positions of two pointers
        int i = l - 1;
        int j = r + 1;

        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            //do Swap
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }

        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        String[] res = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(res[i]);
        }

        quickSort(arr, 0, num - 1);

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        br.close();
    }
}
