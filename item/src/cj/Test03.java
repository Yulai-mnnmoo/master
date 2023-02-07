package cj;

public class Test03 {
    public  static void main(String [] args){
        People  p = new People();
        p.pname="王麻子";
        //  因为Dog 对象的存在依赖 people对象 
        Dog dog = new Dog(p);
        System.out.println(dog.people.pname);
    }
}
