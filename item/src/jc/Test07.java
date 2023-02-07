package jc;

public class Test07 {
    public static void main(String [] args){
        method1();
        // 方法的返回值 需要对应的数据类型 接受（赋值）
        int sum = add();
        System.out.println(sum);
        System.out.println(add2());

        // 有参数
        int num1=4;
        int num2=2;
        double num3=5;
        divide(num1, num2);  // num1  num2 为方法的实参  实参和形参的数据类型必须一致 

        double num4 =6;
        double num5=5;
        double result = divide2(num4, num5);  // 一定要设置参数 
        System.out.println("返回值："+result);
    }
    /**
     * 无参无返回值
     */
    public static void method1() {
        System.out.println("无参无返回值 ");
    }
    /**
     * 无参有返回值
     * @return
     */
    public static int add() {
        int a=1;
        int b=2;
        double c=3.0;
        byte b2=4;
        return a+b2;
    }

    public static long add2() {
        int a=2;
        int c=3;
        System.out.println("会执行内容");
        return a+c; //  int会自动转成long 再返回
    }
    /**
     * 有参无返回值 
     * @param a   形参   a=4
     * @param b   形参   b=2
     */
    public static void divide(int a,int b) {
        double s = a/b;
        System.out.println("结果："+s);
    }
    /**
     * 有参有返回值 
     * @param a
     * @param b
     * @return
     */
    public static double divide2(double a,double b) {
        double s = a/b;
        return s;
    }
}
