package day0416;
//高内聚 低耦合
public class Girl_封装 {
    private int age;//只能在当前类进行访问
    String name;
    //给age提供一个赋值的方法
    //给age提供一个读取值的方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
