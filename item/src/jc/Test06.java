package jc;

public class Test06 {
    public static void main(String [] args){
        for(int j=0;j<5;j++) {
            for(int i=0;i<5;i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // 执行顺序                                          内层循环
        // 外层循环 ： j=0   i=0   i=1  i=2  i=3  i=4   换行
        //    j=1   i=0   i=1  i=2  i=3  i=4
        //    j=2    i=0   i=1  i=2  i=3  i=4
        //    j=3     i=0   i=1  i=2  i=3  i=4
        //    j=4     i=0   i=1  i=2  i=3  i=4       j==5
        //   判断 5<5  不成立  

        // 外层循环控制行数   内层循环控制列数
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        // 找内存循环 和外层循环的关系  

        for(int i=0;i<5;i++) {
            for(int k=0;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("=======================");
        //  break 和 continue 遇到 嵌套循环时   如何处理 
//		block1:for(int i=1;i<=10;i++) {   // 跳出外层循环 
//			 
//			for(int j=1;j<=10;j++) {
//				if(j==5) {
//					break block1; // 跳出 内存循环 
//				}
//				System.out.print(i+"---"+j+"\t");
//			}
//			System.out.println();
//		}

        System.out.println("continue.........");
        for(int i=1;i<=10;i++) {
            for(int j=1;j<=10;j++) {
                if(j==5) {
                    continue;   // 默认对当前内层循环 有效 ，并继续执行内存循环的下一次 。
                }
                System.out.print(i+"---"+j+"\t");
            }
            System.out.println();
        }


        System.out.println("continue.........");
        outer:for(int i=1;i<=10;i++) {
            for(int j=1;j<=10;j++) {
                if(j==5) {
                    continue outer;   //  跳出outer所在的位置的循环 ，并执行 外层循环的下一次 
                }
                System.out.print(i+"---"+j+"\t");
            }
            System.out.println();
        }


    }
}
