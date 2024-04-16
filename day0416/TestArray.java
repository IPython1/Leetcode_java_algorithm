package day0416;

public class TestArray {
    public static int addnum(){

        return 0;
    }
    public static void main(String[] args) {
        //数组声明 并创建
        int[] arr=new int[4];//每个元素的默认值为0
        for(int i=0;i<4;i++){
            arr[i]=i+1;
        }
        //增强for循环
        for(int num:arr){
            System.out.println(num);
        }

    }
}
