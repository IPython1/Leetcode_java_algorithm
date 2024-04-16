package day0416;
//快捷键alt+insert 快速添加构造器 -》constructer
public class Person {
    String name;
    int age;
    double height;

    public void study(){
        System.out.println("dyj最帅！！！");
    }
    //显式 编写构造器
    public Person(){//无参构造

    }
    //有参构造
    //构造器的参数名字，如果和属性名字重名，就会发生就近原则
    //如果重名仍要给属性赋值的话 就要在想要表达属性变量前加上this.来修饰
    public Person(int age,String name,double height){
        this.age=age;
        this.name=name;
        this.height=height;
    }

}
