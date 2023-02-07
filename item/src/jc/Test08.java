package jc;

import java.util.Arrays;

public class Test08 {
    public static void main(String [] args){
        // 数组的定义      数据是引用数据类型 ，它的实际内存在堆中，
        // 通过栈内存的变量age 指向该内存地址
        int [] age = new int[3];
        String array [] = new String[3];

        System.out.println(age);
        System.out.println(array);
        // 赋值
        age[0]=22;
        age[1]=23;
        age[2]=20;
        //age[3]=22;

        // 数组的长度
        System.out.println(age.length);
        // 访问数据 ，循环 
        System.out.println("访问第一个数组元素:"+age[0]);
        // 访问所有元素

        for(int i=0 ;i<age.length ;i ++) {
            System.out.println("每一个数组元素:"+age[i]);
        }

        // 创建10个长度的数组 ， 给数组赋值 100以内的数 
        int arrays [] = new int[10];
        for(int i =0 ;i < arrays.length ; i++) {
            arrays[i]=(int)(Math.random()*100);
        }

        // 连续输出数据的内容
        System.out.println(Arrays.toString(arrays));

        // 对于引用数据类型 可以通过 foreach 循环输出内容   jdk1.5以后
        //  for(数组类型    变量名  :  数组名){
        //           变量名表示数组的每一个元素
        // }
        for(int a : arrays) {
            System.out.println("变量值："+a);
        }

        int [] a = {1,2,3};   //  源数组
        // a数组的地址 赋值给b数组 
		 int [] b = a;
		 System.out.println(a);
		 System.out.println(b);
//		 // 他们访问的是同一块内存
//		 System.out.println(a[0]);
//		 System.out.println(b[0]);
//		 a[0]=5;
//		 System.out.println(b[0]);
        
//        int [] b = new int[a.length];// 目标数组

        for(int i=0;i<a.length;i++) {
            b[i]=a[i];
        }

        System.out.println(Arrays.toString(b));
//        System.out.println(a);
//        System.out.println(b);
    }
}
