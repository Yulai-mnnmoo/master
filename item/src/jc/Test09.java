package jc;

import java.util.Arrays;
import java.util.Scanner;

public class Test09 {
    public static void main(String [] args){
    //约瑟夫环问题   

    /**
     * 问题1： 如何表示41个人的生死状态    ，默认这些人都是  活着的 
     *
     * 问题2 ： 对于游戏什么时候结束？    
     *
     * ​	   定义一个总人数 41人，一直循环完游戏，直到游戏人数=1时 就结束 
     *
     * 问题3：什么情况下 游戏人数会减少 ？   
     *
     * ​            具备玩游戏的资格（当前下标为true ），且数数时  编号=3   ， 此时给当前人的值变更为false 
     *
     * 问题4：如何表示 数组中一遍游戏结束后又从头开始，这个表示一个 “环状”？
     */
//        System.out.println("请输入游戏的人数：");
//        Scanner sc=new Scanner(System.in);
//        int l=sc.nextInt();
        boolean [] array =new boolean[41];
        int i=0; //数组下标
//        循环赋值 true :表示活着的人
        for (int j=0;j<array.length;j++){
            array[j]=true;
        }
        int count=array.length;
        int num=0;
        while (count>1){
            if(array[i]==true){
//                System.out.println("开始玩游戏");
                num++;
                if (num==3){
                    array[i]=false;
                    count--;
                    num=0;
                }
            }
            i++;
            if (i==array.length){
                i=0;
            }
        }
        System.out.println(Arrays.toString(array));
        
        for (int k=0;k<array.length;k++){
            if (array[k]==true){
                System.out.println("幸运位置是："+(k+1));
            }
        }

        //斐波拉契问题
        /**
         * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？  第12个月的兔子总数 
         * 
         * 斐波拉契数列--》实际上就是从第三个月开始  a[n]=a[n-1]+a[n-2]
         */
        int aa[]=new int[12];
        int  m1 =1;  // 第一个月
        int  m2=1;  //下一个月
        // 求 第n个月的兔子数 count
        int  count1=0;
        aa[0]=1;
        aa[1]=1;
        for(int m=3;m<=12;m++) {

            count1=m1+m2;
            m1=m2;
            m2=count1;
            aa[m-1]=count1;
        }
        System.out.println(Arrays.toString(aa));
        System.out.println("第12个月 的兔子数:"+count1);

        //递归问题 调用   
        /**
         * 方法的递归调用：  为了解决一些 循环的问题，方法自己调用自己  的过程
         */
        System.out.println("阶乘是："+f(3));;
        System.out.println("阶乘和是："+sum(3));
        
        
    }
    //递归问题  阶乘
    public static  int f(int n){
        if (n==1){
            return 1;
        }else{
            return f(n-1)*n;
        }
    }
    //递归问题  阶乘之和
    public static  int sum(int n){
        if (n==1){
            return 1;
        }else{
            return sum(n-1)+f(n);
        }
    }
}
