package jc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Work04 {
    public static void main(String [] args){
//练习1：  定义一个10个长度的数组 ，随机生成100以内的数，找到这个数组的最大值，最小值以及他们所在的位置（下标），以及求这些元素的平均值。
        int [] array1=new int[10];
        for (int i=0;i<array1.length;i++){
            array1[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(array1));
        int max=0;
        int ma=0;
        int min=0;
        int mi=0;
        for (int i=0;i<array1.length;i++){
            if (i==0){
                max=array1[0];
                min=array1[0];
                ma=0;
                mi=0;
            }else {
                if (max<array1[i]){
                    max=array1[i];
                    ma=i;
                }
                if (min>array1[i]){
                    min=array1[i];
                    mi=i;
                }
                
            }
            
        }
        System.out.println("最大值是："+max+"，最大下标是："+ma);
        System.out.println("最小值是："+min+"，最小下标是："+mi);

        int sum=0;
        for (int i:array1
             ) {
            sum+=i;
        }
        System.out.println("平均值："+sum/array1.length);
        
        
//
//练习2：有一个数组，数组的元素 一般都是成对出现的，但其中有一个是例外 ，例如 {2，3，4，，4，5，3， 2}，其中5是个例外，要求找到这个数并显示它的下标
        int [] array2={2,3,4,4,5,7,5,3,2};
        for (int i=0;i<array2.length;i++){
            int t=0;
            int m=0;
            int n=0;
            for (int j=0;j<array2.length;j++){
                
                if (array2[i]==array2[j]&&i!=j){
                    t++;
                }
                m=array2[i];
                n=i;
                
            }
            if (t==0){
                System.out.println("这个数为："+m+",下标是："+n);
            }
            
        }
        
//  作业3：   定义一个数组，删除一个指定下标的元素，并输出结果
        System.out.println("请输入想要删除的数组下标：");
        int nn []={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        int mm=sc.nextInt();
        
        int [] array4=delete(nn,mm);

        System.out.println(Arrays.toString(array4));
        
        
//
//  作业4：  1.将一个数组中值=0的项去掉,将不为0的值存入一个新的数组,比如:
//int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
//生成的新数组为:
//int b[]={1,3,4,5,6,6,5,4,7,6,7,5}
//
        int [] a={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int []b=new int[a.length+1];
        int k=0;
        for (int i=0;i<a.length;i++){
            if(a[i]!=0){
                b[k]=a[i];
                k++;
            }
            
        }
        System.out.println(Arrays.toString(b));
//
//
// 作业5、有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
//  如有数组{23,25,36,  67,77,79,89}，然后有数组50来插入在数组中组成一个新的数组
//
//
        int array5 []={23,25,36,67,77,79,89};
        int array6 [] = new int[array5.length+1];
        int f=0;
        for (int i=0;i<array5.length;i++){
            if(array5[i]<50){
                array6[i]=array5[i];
                f++;
             }
             if (array5[i]>=50){
                 if(f!=0){
                     array6[i]=50;
                 }
                 f=0;
                 array6[i+1]=array5[i];
             }
        }
        System.out.println(Arrays.toString(array6));
//
// 作业6、定义一个有10个空间的整型数组，数组中的每个位置存放8-98之间的随机偶数，  （（Math。randon*45）+4 ）*2
//   输出这个数组中的每个数，再排序，排序后再输出。
        int array7 [] =new int[10];
        for (int i=0;i<array7.length;i++){
            array7[i]=(int)((Math.random()*45)+4)*2;
        }
        System.out.println(Arrays.toString(array7));
        
        int temp=0;
        for (int i=0;i<array7.length;i++){
            for (int j=array7.length-1;j>i;j--){
                if (array7[i]>array7[j]){
                    temp=array7[j];
                    array7[j]=array7[i];
                    array7[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array7));
        
//
// 作业7、有数组{12,5,87,97,1,45,71,112,50,80}，将数组的前一半保存到新数组a中，将
//   后一半保存到新数组b中       
        int [] array8={12,5,87,97,1,45,71,112,50,80};
        int a1 []=new int[array8.length/2];
        int b1 [] =new int[array8.length/2];
        
        for (int i=0;i<array8.length/2;i++){
            a1[i]=array8[i];
        }
        for (int j=0;j<array8.length/2;j++){
            b1[j]=array8[j+array8.length/2];
        }

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));
    }
    
    public static int[] delete(int[] array,int index){
        if (index>array.length-1){
            System.out.println("输入下标不能超出数组的范围");
            return array;
        }
        int array1 [] =new int[array.length-1];
        for (int i=0;i<array.length;i++){
            if (i<index){
                array1[i]=array[i];
            }
            if (i>index){
                array1[i-1]=array[i];
            }
        }
        array=array1;
        
        return array;
    }
}
