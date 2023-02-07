package jc;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args){
        // 算术运算符     +  
        int a=1;
        String str="abc";
        System.out.println(str+a);   //  + 表示一个连接符 

        int b=2;
        System.out.println(str+(a+b));

        System.out.println(a/2);  // 当除不尽 需要考虑结果的数据类型转换问题

        //	System.out.println(a/0);  // 除数不能位0 

        // ++  
        int i=0;
        i++;  // 将自身+1 
        System.out.println(i);

        int sum =i++; // 先将i的值赋值给 sum ，再自身+1 
        System.out.println(sum);
        System.out.println(i);
        //i=2 
        int sum2 =++i;  //i先自身+1   然后再将结果赋值给 sum2
        System.out.println(sum2);  // 
        System.out.println(i);

        sum=i--;  //  先将i的值赋值给sum ，再自身-1     =  3
        sum=--i;
        System.out.println(sum);

        int x=1;
        int y=1;
        sum=x++ + ++x +y-- - --y+(x++);  //1+3 + 1 -(-1)+ 3
        System.out.println(sum);// 9   9
        System.out.println(x);// 4   4
        System.out.println(y);// 1   -1

        //  比较运算符    ==  
        System.out.println(1==2);
        String s1="abc";
        String s2="abc";
        String s3=  new String("abc"); // 将对象 赋值给 s3     对象不等于常量值
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println(true == false);
        System.out.println(97=='a'); // 自动转成 int

        //	System.out.println('a'>='b'>='c');  // 不能连续比较 
        boolean  flag = s1==s3;
        System.out.println(flag);

        //  赋值运算符    +=   -=  *=  /=    %=
        int s=1;
        s+=3;  //  s=s+3

        short ss=1;
        ss+=1;
        //	ss=ss+1;


        int num1=100;
        //	num1/=0;
        num1%=2;  //  num1=num1%2 
        System.out.println(num1);
        
        i=2;
        
        i+=i-=i*=2+2;   // 优先级较低
        //  i=i+(i-=i*=2+2;)
        // i = i+(i=i-(i*=2+2))
        // i = i+(i=i-(i=i*4)

        // i=2+(2-(8))
        //

        System.out.println(i);// i=-4   -2  2  
        i=-4;
        int j=3;
        j+=j+=i*=i+j--+2+i++;

//		j=j+(j+=i*=i+j--+2+i++)
//      j=j+(j=j+(i*=i+j--+2+i++))		
//      j=j+(j+(i*(i+j--+2+i++)))
//      j=3+(3+(-4*(-4+3+2-4))
        // j=3+3+ 12
        //j=18

        
        System.out.println(i);
        System.out.println(j);



        //  逻辑运算符
        //  & :  x&y  x 、y 是布尔类型  x y都为true，结果为true
        System.out.println("=====");
        System.out.println(true&true);
        System.out.println(true&false);
        // |  ：  x|y   如果x y任意一个为true 则结果为true
        System.out.println(true|false);
        System.out.println(true|true);
        System.out.println(false|false);

        System.out.println(1>2 | 1+1>=2);//true 

        System.out.println(5&3);// 先将数字转成2进制    
        //101
        //011
        //001  --》十进制就是结果
        System.out.println(5|3);  //转成二进制后比较，有一个为1则结果为1 否则为0
        //111 -》十进制就是结果

        // &&  ： 短路与 ，两边只能是boolean，如果第一个条件为false ，则不再执行第二个提交
        System.out.println(true&&false);

        // & 与 && 的区别
        x=1;
//		System.out.println(x>3 && x++>0); // 后面x++>0 不会执行 
//		System.out.println(x);

        System.out.println(x>3 & x++>0); // 后面x++>0  会执行 
        System.out.println(x);

        // | 与 || 的区别   : 短路或
        a=1;
//		System.out.println(a>0 || a++<0); //  a++<0 不会执行 
//		System.out.println(a);

        //  |  两个条件都会执行的
        System.out.println(a>0 | a++<0); //  a++<0 会执行 
        System.out.println(a);


        System.out.println(!true);
        System.out.println(!(1+2>2));

        // ^  异或
        System.out.println("-----");
        System.out.println(true^false);  //要求两边的结果不一致
        System.out.println(false^true);
        System.out.println(true^true);
        System.out.println(false^false);

        System.out.println(3^5);// 011  101   110=6


        // 移位运算符     
        //  <<  左移  ： 将一个数乘以2的n次方倍  
        //  >>  右移：     将一个数除以2的n次方倍（需要考虑除不尽的情况）
        //  >>> 无符号右移：  和右移一样，不考虑符号问题。

        // 1 关于正整数的移位  
        System.out.println("000000");
        System.out.println(3<<3);  //3*2的3次方 

        System.out.println(3>>2); //3/4

        System.out.println(8>>2);// 8/4

        System.out.println(100>>3);//100/8    1100   200>>8  => 25

        System.out.println(100>>>3);  //  不改变符号，结果一定是一个正数

        // 2 关于负数的移位 
        //  左移位
        System.out.println(-3<<3);//  -3*2的3次方 

        //  右移位
        System.out.println("11111");
        System.out.println(-100>>4); // -100/16= -6.XXX

        // 计算过程：  
        //   原码：
        //   反码
        //   补码：
        //   再移位
        //  再转成补码 
        /**
         * 我们
         */
        System.out.println(-100>>>4);

        System.out.println(-3>>>2);

        // 原码   10000000000 0011
        // 补码   11111...    1101
        //右移2位  00111...    1111    --> 转成十进制 

        //  三目运算符    表达式  ？ 结果1 ： 结果2 
        System.out.println(1>2?true:false);
        System.out.println(1>2?"大于":"不大于");  // 相当于一个判断语句

        //如果条件成立  输出 ？后面的部分   如果不成立的输出：后面的部分 

//        System.out.println("请输入一个数：(接受控制台输入)");
//        Scanner sc = new Scanner(System.in);  //  通过回车或空格 去接受内容
//        int num=sc.nextInt();  // num就是用户控制台输入的内容     
//        if(num>2) {
//            System.out.println("大于");
//        }else {
//            System.out.println("小于");
//        }

        //   运算符的优先级 
        //  最高  .  ()   {}  [] 

        //  ++  --

        a=1;


        a=-++a;  //   - a++   //  先++ 再取负
        System.out.println(a);
        // true
        System.out.println((true||true)&&false);  //  先算&&  再||
    }
}
