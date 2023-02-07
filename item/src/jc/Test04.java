package jc;

//变量
public class Test04 {
    public static void main(String[] args){
        //  定义变量
        int num=100;
        //	double d = 100.5;

        // 程序运行时  ，   由JVM(Java Virtrue Machine   Java虚拟机 )加载该类，并找到对应的main函数 
        // 在main函数中 从上往下执行   int num=100  ,JVM在栈内存中分配4个字节的空间 ，其初始值为100   
        //  对于基本数据类型，分配的空间放入JVM运行时栈内存

        // 常量 ：  在以上程序中，  100 、100.5 属于常量 ，存放在JVM运行时常量池
        int num2=100;

        // 常量: 其值不可改变的量 分为两类：  直接常量（100，100.5） 、 间接常量 (使用final修饰的常量)
        final int num3 =110;
        System.out.println(num3);
        num2 = num3+10;
        System.out.println(num2);

        //	num3=111;  // 常量的值不能改变

        //字符型    0-65535    每一个字符对应一个 ASIC码值 
        char c ='a';
        int n = c;
        System.out.println(n);   //  a  -》  97  
        char c2 ='A';
        System.out.println((int)c2);  // A   65
        char c3 = '0';
        System.out.println((int)c3);  // '0'   48  

        // 将一个int 转成字符 
        int n2=100;
        c2=(char)n2;
        System.out.println(c2);

        char a='\u0061';  //  表示一个unicode的开始部分
        System.out.println(a);  // 快捷键  syso alt+/ 自动补全 

        // 
        System.out.println("\t你好\n今天天气不错\r哈\b哈");

        System.out.println("\"");
        System.out.println("'");
        System.out.println("\\");
        System.out.println("\\\\");

        int score=90;
        score=0123;   // 0123 => 3*8的0次方  +2*8的1次方+ 1*8的2次方 
        System.out.println(score);
        /**
         * 多行注释
         */
        score=0X00EE;
        System.out.println(score);

        c2='李';
        System.out.println((int)c2);

    }
    
}
