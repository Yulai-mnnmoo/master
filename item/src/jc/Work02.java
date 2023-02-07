package jc;

import java.util.Random;
import java.util.Scanner;

public class Work02 {
    public static void main(String [] args){
//        1、用户输入一个圆的半径，帮用户计算出这个圆的周长和面积。
//        System.out.println("请输入圆的半径：");
//        Scanner scanner=new Scanner(System.in);
//        int r=scanner.nextInt();
//        double pi=3.14;
//
//        System.out.println(2*r*pi);
//        System.out.println(pi*r*r);
        
//
//        2、让用户输出两个数字，然后程序判断两个数的大小，再输出较大的一个数。
//        System.out.println("请输入第一个比较的数字：");
//        Scanner sc1=new Scanner(System.in);
//        int a=sc1.nextInt();
//        System.out.println("请输入第二个比较的数字：");
//        Scanner sc2=new Scanner(System.in);
//        int b=sc2.nextInt();
//
//        if(a>=b){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
        
        
//
//        --3、随机两个100到1000之间的整数，再将这两个数从小到大输出。
        double c= Math.random()*100;
        double d=Math.random()*100;
        
        if (c>=d){
            System.out.println(d+" "+c);
        }else{
            System.out.println(c+" "+d);
        }
//
//        4、在控制台读取用户的信息：姓名、年龄、身高。 再输出他的详细信息。
//        System.out.println("请输入用户姓名：");
//        Scanner sc2=new Scanner(System.in);
//        String name=sc2.next();
//        System.out.println("请输入用户年龄：");
//        int age=sc2.nextInt();
//        System.out.println("请输入用户身高：");
//        double height=sc2.nextDouble();
//
//        System.out.println(name+"同学的年龄是"+age+",身高是"+height);
//
//        --5、用户输入一个整数，判断这个数是否是一个完全平方数，如果是则输出“恭喜”;
//        Math.sqart
//        System.out.println("请输入一个整数：");
//        Scanner sc3=new Scanner(System.in);
//        int e=sc3.nextInt();
//
////        System.out.println(Math.sqrt(12));
//        double f=Math.sqrt(e);
//        e=(int)f;
//        if(e-f==0){
//            System.out.println("恭喜！");
//        }else{
//            System.out.println("不是完全平方数！");
//        }
//
//        6、用户输入三角形的三边，程序计算出三角形的面积。
//        面积公式=√(s(s-a)(s-b)(s-c))    其中a、b、c为用户输入的三边，s为(a+b+c)/2
//        System.out.println("三角形的边1：");
//        Scanner sc4=new Scanner(System.in);
//        int aa=sc4.nextInt();
//        System.out.println("三角形的边2：");
//        int bb=sc4.nextInt();
//        System.out.println("三角形的边3：");
//        int cc=sc4.nextInt();
//        
//        double s=(aa+bb+cc)/2;
//
//        System.out.println(s);
//        double ss=(s*(s-aa)*(s-bb)*(s-cc));
//        System.out.println("三角形面积是："+ss);
//
//      ---7、用户输入一个整数，将这个整数自增，再输出自增后的数的平方及开根号。
//        System.out.println("请输入一个整数：");
//        Scanner sc5=new Scanner(System.in);
//        int g=sc5.nextInt();
//        
//        ++g;
//        System.out.println(g);
//        System.out.println(g*g+"---"+Math.sqrt(g));
//
//        8、用户输入一个年份，程序判断这个年份是否为闰年。
//        (闰年的计算规则，年份数字是4的倍数且不是100的倍数；或者年份是400的倍数)
//        System.out.println("请输入一个年份：");
//        Scanner sc6=new Scanner(System.in);
//        int year=sc6.nextInt();
//        
//        if ((year%4==0 && year%100!=0)||year%400==0){
//            System.out.println("是");
//        }else{
//            System.out.println("不是");
//        }
//
//        ---9、随机一个5到95之间的数，判断这个数的奇偶性，如果是奇数则输出这个数的开根号，
//        如果是偶数则输出这个数的平方；
//        再判断这个数是否是7的倍数，如果是7的倍数则输出这个数除以7的值，
//        如果不是7的倍数则输出这个数对7取模的值。
//        (int）(Math.random()*90+5)
        int h=(int)(Math.random()*90+5);

        System.out.println(h);
        if (h%2==0){
            System.out.println(h*h);
        }else{
            System.out.println(Math.sqrt(h));
        }
        
        if(h%7==0){
            System.out.println(h/7);
        }else{
            System.out.println(h%7);
        }
    }
}
