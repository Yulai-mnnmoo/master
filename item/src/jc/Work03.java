package jc;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Work03 {
    public static void method1() {
        for(int i=1;i<=5;i++) {
            // 先打印空格数 
            for(int k=1;k<=5-i;k++) {
                System.out.print("  ");
            }
            // 再打印* 个数
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //	System.out.println("菱形的下一半");
        for(int i=4;i>=1;i--) {
            // 先打印空格
            for(int j=1;j<=5-i;j++) {
                System.out.print("  ");
            }
            // 打印**
            for(int k=1;k<=2*i-1;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void getCanlandar(int year,int month){
        int count=0;
        System.out.println("一\t二\t三\t四\t五\t六\t日\t");
        // 获取这一年这个月的总天数
        int days =getDays(year, month);
        // 先打印空格 
        int k=days%7;
        //	System.out.println(k);
        for(int i=0;i<k;i++) {
            System.out.print(" \t");
        }
        count+=k;
        int thisDay=getYearDay(year, month);

        for(int i=1;i<=thisDay;i++) {
            System.out.print(i+"\t");
            count++;
            if(count%7==0) {
                System.out.println();
            }
        }
    }
    /**
     * 统计从1900年到这一年的这个月之前的所有天数 
     * @param year
     * @param month
     * @return
     */
    public static int getDays(int year ,int month) {
        int days=0;
        // 1、计算从1900到2019 1月1日 的总天数 
        for(int i=1900;i<year;i++) {
            if(i%400==0 || i%100!=0 && i%4==0) {
                days+=366;
            }else {
                days+=365;
            }

        }
        //	System.out.println("年---"+days);
        // 2、计算这一年1月 到 这个月的天数 
        for(int i=1;i<month;i++) {
            // 累加 这一年的每一个月的天数   43764  43805
            days+=getYearDay(year, i);
        }

        //System.out.println("days-----"+days);
        return days;
    }
    /**
     *  计算 一个月的天数 ；
     * @return
     */
    public static int getYearDay(int year, int month) {
        int monthDay=0;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthDay=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                monthDay=30;
                break;
            case 2:
                if(year%400==0 || year%100!=0 && year%4==0) {
                    monthDay=29;
                }else {
                    monthDay=28;
                }
                break;
        }
        return monthDay;
    }
    public static void main(String []args){
//        9 9 乘法表
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                    System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println("\n");
        }
/**
 * 1 输入一个 年   月， 打印这个月的万年历 
 *
 *例如输入 2019  12
 *
 *   一	二	三	四	五	六	日
 *                           1
 * 2    3   4   5   6   7   8
 * .。。。。
 * 30   31
 *
 * 1900年 1 月1日，对应的是 星期一
 * 
 *思路：1、需要找到 该月的第一天从哪个位置开始     2、 需要计算从1900年1月1好到 2019年 12月1日之间的总天数 
 */
//        method1();
        System.out.println("请输入年月：");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        int month=scanner.nextInt();

        //打印日历
        getCanlandar(year, month);

        System.out.println();
        
        
        
// 2、输出100到200之间9的倍数的数
        for (int i=100;i<=200;i++){
            if (i%9==0){
                System.out.print(i+"\t");
            }
        }
//
//3、输出50到150之间7的倍数的数，并统计一共有多少个。
        int count=0;
        for (int i=50;i<=150;i++){
            if (i%7==0){
                count++;
                System.out.print(i+"\t");
            }
        }
        System.out.println("...个数："+count);
//
//4、用户输入一个整数，然后程序计算出1到这个数的和。
//        System.out.println("请输入一个整数：");
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int sum=0;
//        
//        for (int i=0;i<=a;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//
////5、用户输入两个整数，然后程序计算出这两个数之间的和。
//        System.out.println("第一个整数：");
//        Scanner sc1=new Scanner(System.in);
//        int b=sc1.nextInt();
//        System.out.println("第二个整数：");
//        int c=sc1.nextInt();
//        int sum =0;
//        
//        if (b>c){
//            for (int i=c+1;i<b;i++){
//                sum+=i;
//            }
//        }else{
//            for (int i=b+1;i<c;i++){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
//6、题目描述：中文里，有回文诗句、对联，如：“灵山大佛，佛大山灵”",
//“客上天然居，居然天上客”等等，都是美妙的符合正念倒念都一样的回文句 
//；回文数则是有类似22、383、5445、12321，不论是从左向右顺读，
//还是从右向左倒读，结果都是一样的特征。请你编程测试输出10000—20000中的所有回文数。
        int count1=0;
        for (int i=10000;i<=20000;i++){
            if(i%10==i/10000 && (i%100)/10==(i/1000)%10){
                count1++;
                System.out.print(i+"\t");
            }
        }
        System.out.println("\n合计："+count1);
//
//7、一个整数，它加上100后是一个完全平方数，
//加上168又是一个完全平方数，请问该数是多少
        int s=0;
        int m=0;
        for (int i=0;i<1000;i++)       {
            s=(int)Math.sqrt(i+100);
            m=(int)Math.sqrt(i+168);
            if (s-(Math.sqrt(i+100))==0 && m-(Math.sqrt(i+168))==0){
                System.out.println(i);
            }
        }
//
//8、题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
//再落下，求它在 第10次落地时，共经过落下多少米？第10次反弹多高？
        double h=10;
        double sum=0;
        for (int i=1;i<=10;i++){
            sum+=h;
            h/=2;
        }
        System.out.println(sum+"-"+h);
//
//9、在你面前有一条长长的阶梯，如果你每步跨 2阶，
//  那么最后剩1阶，如果你每步跨3阶，那么最后剩2阶，
//  如果你每步跨5阶，那么最后剩4阶，如果你每步跨6阶，
//  那么最后剩5阶，只有当你每步跨7阶时，最后才正好走完，
//  一阶也不剩。请问这条阶梯至少有多少阶？
        int x=0;
//        do {
//            x++;
//            if(x%3==2 &&x%5==4 &&x%6==5&&x%7==0){
//                System.out.println(x);
//                break;
//            }
//        }while (true);
        
        while (true){
            x++;
            if(x%3==2 &&x%5==4 &&x%6==5&&x%7==0){
                System.out.println(x);
                break;
            }
        }
//
//10、编程求100~10000满足各位数字之和是5的所有数，以5个数字一行的形式输出。 
        int q=0;
        int w=0;
        int e=0;
        int r=0;
        int co=0;
        for (int i=100;i<10000;i++){
            if (i>1000){
                q=i/1000;
                w=i%1000/100;
                e=i%1000%100/10;
                r=i%10;
            }else{
                q=i/100;
                w=i%100/10;
                e=i%10;
            }
            if ((q+w+e+r) == 5){
                System.out.print(i+"\t");
                co++;
            }
            if (co==5){
                co=0;
                System.out.print("\n");
            }
            
        }
        
        
    }
}
