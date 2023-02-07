package cj;

/**
 * 学生 和老师的关系 ：
 *     可以通过  学生 找到对应的老师信息 
 * @author wuyafeng
 *
 */
public class Students {
    // 学生姓名
    public String sname;
    public int score;
    // 学生类中 定义 老师类型，表示 通过这个学生可以找到他的老师是谁 
    // 每一个自定义类都可以作为另一个类的属性 
    public Teacher teacher;
    /**
     * 学生信息
     */
    public void showStu() {
        System.out.println("学生信息："+ sname + ",分数："+score+",这个学生的老师信息："+teacher.tname);
    }

}
