package cj;

public class Test02 {
    public static void main(String [] args){
        Teacher tc=new Teacher();
        tc.tname="张三";
        tc.sex="男";
        
        tc.showTeacher();
        
        Students su=new Students();
        su.sname="李四";
        su.score=85;
        su.teacher=tc;

        System.out.println(su.teacher.tname);

        Students stu2 = new Students();
        stu2.sname ="文奥奇";
        stu2.score=92;
        stu2.teacher = tc;

        System.out.println("这个学生的老师："+stu2.teacher.tname);

        System.out.println("将老师和学生 分别打印");
        System.out.println(tc);
        System.out.println(su);
        System.out.println(stu2);
        System.out.println(su.teacher);
        System.out.println(stu2.teacher);
    }
}
