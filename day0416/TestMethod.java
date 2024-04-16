package day0416;

//方法重载：在同一个类中，方法名相同但是参数列表不同（参数类型 顺序 个数）的多个方法，构成了方法的重载
public class TestMethod {
    //构造函数
    public static int addNum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        int res=addNum(10,20);
        System.out.println(res);
    }
}
