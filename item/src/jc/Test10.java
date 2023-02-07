package jc;

import java.util.Arrays;
import java.util.Scanner;

public class Test10 {
    public static void main(String [] args){
        //二分查找  
        int a [] =new int[10];
        for (int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
        }
        //排序
        
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]) {
                    int temp=0;
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("请输入你想要查找的值：");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        
        int min=0;
        int max=a.length-1;
        int middle=0;
        
        while (true){
            middle=(min+max)/2;
            if (m>a[middle]){
                min=middle+1; 
            }else if(m<a[middle]){
                max=middle-1;
            }else{
                System.out.println("找到了，下标为："+middle);
                break;
            }
            
            if (min>max){
                System.out.println("对不起，没有找到");
                break;
            }
        }
        
        
        //二维数组  生产一个5*5的矩阵（数字在100以内），计算对角线之和  ，计算这个矩阵的最大值 ，最小值   
        int b [][] =new int[5][5];
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[0].length;j++){
                b[i][j]=(int)(Math.random()*100);
            }
        }
        int mmax=0;
        int mmin=0;
        int ssum=0;
        int co=0;
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[0].length;j++){
                if (i==0&&j==0){
                    mmin=b[0][0];
                    mmax=b[0][0];
                }
                if (b[i][j]>mmax){
                    mmax=b[i][j];
                }
                if (b[i][j]<mmin){
                    mmin=b[i][j];
                }
                System.out.print(b[i][j]+"\t");
                if (i==j || i+j==b.length-1){
                    ssum+=b[i][j];
                }
                co++;
                if (co%5==0){
                    System.out.println();
                }
            }
            
        }
        System.out.println("最大值："+mmax);
        System.out.println("最小值："+mmin);
        System.out.println("对角线之和："+ssum);
    }
}
