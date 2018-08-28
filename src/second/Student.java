package second;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        Student s= new Student(1,"jithin");
        Student s2= new Student(2,"anju");

        int[] a={1,2,3};
        String ss[]={"abc","def"};
    Student sarray[]={s,s2};

        for (Student obj:sarray) {
            System.out.println(obj.name);
        }

    }

}
