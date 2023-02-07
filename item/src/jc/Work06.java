package jc;

import java.util.Scanner;

public class Work06 {
    public static void main(String[] args) throws InterruptedException {
        //1、先打印五子棋盘  
        //定义一个20*20的二维数组
        String [][] qipan = new String[20][20];
        for(int i=0;i<qipan.length;i++) {
            for(int j=0;j<qipan[i].length;j++) {
                qipan[i][j]="+ ";
                System.out.print(qipan[i][j]);
            }
            System.out.println();
        }

        //2、玩家和电脑分别落入棋子  （玩家，电脑 ）    一直不停的落棋子
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请玩家（● ）落入棋子：先输入行，再输入列");
            int hang = sc.nextInt();
            int lie = sc.nextInt();
            //判断玩家输入的棋子 是否在棋盘上 1-20是棋盘的位置
            if(hang>20 || hang<=0 || lie>20 || lie<=0) {
                System.out.println("玩家落入的棋子必须在1-20行之间");
                continue;
            }
            //玩家落入的位置也不能是已落入的棋子
            if(qipan[hang-1][lie-1]=="● " || qipan[hang-1][lie-1]=="○ ") {
                System.out.println("您落入的棋子已经被占用，不能重复放棋子 ");
                continue;
            }

            //  使用 ● 替代棋盘中的行 列 
            showQipan(qipan, hang, lie, "● ");

            //电脑落入棋子 
            System.out.println("请电脑落入棋子，电脑自动判断落入行和列");
            Thread.sleep(2000);


            //判断 不能覆盖黑棋
            while(true) {
                //生产随机数  
                int  hang2 =(int)(Math.random()*20+1);
                int lie2= (int)(Math.random()*20+1);
                if(qipan[hang2-1][lie2-1]=="● " || qipan[hang2-1][lie2-1]=="○ ") {// 这个位置已经有棋子
                    continue;
                }else {
                    //显示棋盘 
                    showQipan(qipan, hang2, lie2, "○ ");
                    break;
                }
            }

            //判断 输赢
            boolean f = judge(qipan);
            if(f) {
                System.out.println("游戏结束");
                break;
            }

        }

        // 3 每次落完棋子，都需要判定对方是否输赢  ，直到有一方赢了

    }
    /**
     * 显示棋盘 
     * @param qipan   数组
     * @param hang  第几行
     * @param lie   第几列
     * @param type  表示玩家或电脑输入的内容  “● ”    “○ ”
     */
    public static void showQipan(String [][] qipan,int hang ,int lie,String type) {
        qipan[hang-1][lie-1]=type;

        for(int i=0;i<qipan.length;i++) {
            for(int j=0;j<qipan[i].length;j++) {
                System.out.print(qipan[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * 判断输赢
     */
    public static boolean judge(String [][] qipan) {
        boolean flag = false;
        for(int i=0;i<qipan.length;i++) {
            for(int j =0;j<qipan[i].length;j++) {
                // 右边横向
                if(j<16 && qipan[i][j]==qipan[i][j+1] && qipan[i][j]==qipan[i][j+2] && qipan[i][j]==qipan[i][j+3]
                        && qipan[i][j]==qipan[i][j+4]) {
                    if(qipan[i][j]=="● ") {
                        System.out.println("黑棋赢了");
                        flag=true;
                    }else if(qipan[i][j]=="○ ") {
                        System.out.println("白棋赢了");
                        flag=true;
                    }
                    break;
                }else if(i<16 && qipan[i][j]==qipan[i+1][j] && qipan[i][j]==qipan[i+2][j] && qipan[i][j]==qipan[i+3][j]
                        && qipan[i][j]==qipan[i+4][j])  {  // 竖着的 下一半 
                    if(qipan[i][j]=="● ") {
                        System.out.println("黑棋赢了");
                        flag=true;
                    }else if(qipan[i][j]=="○ ") {
                        System.out.println("白棋赢了");
                        flag=true;
                    }
                    break;
                }else if(i<16 && j<16 && qipan[i][j]==qipan[i+1][j+1] && qipan[i][j]==qipan[i+2][j+2] && qipan[i][j]==qipan[i+3][j+3]
                        && qipan[i][j]==qipan[i+4][j+4]) { // 斜着的下一半
                    if(qipan[i][j]=="● ") {
                        System.out.println("黑棋赢了");
                        flag=true;
                    }else if(qipan[i][j]=="○ ") {
                        System.out.println("白棋赢了");
                        flag=true;
                    }
                    break;
                }
            }

        }

        return flag;
    }
    
}
