package jc;

public class Work05 {
    public static void main(String [] args){
// 1、完成课堂案例   并整理笔记   
// 2、写程序计算1/3+ 2/5 + 3/7 + 4/9 + 5/11 + 6/13 + 7/15 ... 100/201
        System.out.println(sum(100));
//
// 3、有数字： 1、2、6、24、120、720、...求第n个数字
        System.out.println(f(6));
//
// 4、有数字： 1、2、5、12、29、70、169、...求第n个数字。
        System.out.println(f1(7));
//
// 5、完成五子棋 游戏开发
        boolean array[][] =new boolean[15][15];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                array[i][j]=false;
            }
        }
//
// 6、定义一个函数，函数有一个整型参数n，
//  如果参数n为偶数时，调用函数求1/2+1/4+...+1/n,
//  如果参数n为奇数时，调用函数1/1+1/3+...+1/n
        System.out.println(f2(4));
    }
    public static double sum(int n){
        double s=0;
        if (n==1){
            s=(double) 1/3;
        }else{
            s=sum(n-1)+(double) n/(2*n+1);
        }
        return s;
    }
    public static int f(int n){
        int s=0;
        if (n==1){
            s=1;
        }else{
            s=f(n-1)*n;
        }
        return s;
    }
    public static int f1(int n){
        int s=0;
        if (n==1){
            s=1;
        }else if(n==2){
            s=2;
        }
        else {
            s=f1(n-1)*2+f1(n-2);
        }
        return s;
    }
    public static double f2(int n){
        double s=0;
        if (n==1){
            s=(double)1;
        }else if(n==2){
            s=(double)1/2;
        }else{
            if (n%2==0){
                s=f2(n-2)+(double)1/n;
            }else{
                s=f2(n-2)+(double)1/n;
            }
        }
        return s;
    }
}
