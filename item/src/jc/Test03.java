package jc;

public class Test03 {
    public static void main(String[] args){
        // 不同数据类型间的计算   会出现什么问题呢？
        int a=10;
        long l =100;
        int b =(int)( a+l );//  不同数据类型之间的计算 需要准许高低类型的转换 
        //  int =long  不等于
        long ll =a+l;

        System.out.println(b);
        System.out.println(ll);

        byte b1 =100;
        byte b2 =120;
        int s =  b1+b2;   //  将 byte 类型 赋值给 int 
        short s2 =(short)(b1+b2);  //在计算时 数值型默认先转成int

        short s3=100;
        // s3=s3+1;  // 不通过

        // s3+=1;  // 编译可通过   自带强转    s3= （short） s3+1

        System.out.println(1/2);  // 0  

        double d=1.25;
        int num =(int)d;
        System.out.println(num);

        System.out.println(1/3*1.0+1/5+1/7);

        int x=1,y=2;
        System.out.println(x+y+x/y*2.0+4/5);



    }
}
