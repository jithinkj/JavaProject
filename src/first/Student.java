package first;

public class Student {
    int rollno;
    String name;

    Student(int r, String n){
        rollno=r;
        name=n;
    }
    void Display(){
        System.out.println("Roll number ="+rollno+"  Name ="+name);
    }
    public static void main(String[] args) {
        Student s= new Student(10,"jithin");
        s.Display();
    }
}
