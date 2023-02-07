package cj;

/**
 * 宠物狗  类
 */
public class Dog {
    public String dogName;
    // 表示 这个宠物对象所属的主人 时谁
    public People people;
    // 定义类与类的依赖关系 
    public  Dog(People p) {
        people = p;
    }
}
