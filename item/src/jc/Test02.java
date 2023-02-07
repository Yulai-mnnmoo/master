package jc;

public class Test02 {
    public static void main(String[] args){
        // 定义变量 
        int age = 20;
        byte age2=22;
        age2=127;
        short s=128;

        age2++;
        System.out.println(age2);

        short s1=100,s2=200;
        int s3=s1+s2;// 对于 数值100 在计算时 默认优化成int类型
        System.out.println(s3);

        //	short  s4=s1+1;  // 对于 short的计算，先自动转成int 

        long l=100;

        float f=100.5f;  // 对于小数，自动位double 类型
        float ff = 100.5F;
        float fff =100;
        System.out.println(fff);

        double d=100.5D;
        double dd=100;
        System.out.println(dd);
    }
}
