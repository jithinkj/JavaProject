package third;

import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

public class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        TreeSet<Student> obj=new TreeSet<Student>();
        obj.add(new Student(1,"jkj",22));
        obj.add(new Student(24,"bfg",20));
        obj.add(new Student(3,"cdf",23));
        for (Student s:obj
             ) {
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if(rollno>o.rollno){
            return 1;
        }
        else if(rollno<o.rollno){
            return -1;
        }
        else{
            return 0;
        }
    }
}
