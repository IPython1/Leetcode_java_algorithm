package day0416;

public class test {
    public static void main(String[] args) {
        //如果一个类没有显式编写构造器的话 那么系统会为这个类默认分配一个空构造器
        Person p1=new Person();
        p1.age=20;
        p1.name="dyj";
        System.out.println(p1.age);
        System.out.println(p1.name);
        //调用对象的方法
        p1.study();

    }
}
