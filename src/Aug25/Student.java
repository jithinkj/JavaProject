package Aug25;

import java.lang.reflect.Method;

public class Student {
    @College(name = "SH college",location = "tevara")
    public void getInfo(){}
    @College(name = "abc college",location = "abc")
    public void getDetails(){}
    public static void main(String[] args) {
        try {
            Method m=Student.class.getMethod("getDetails");
            College collegeAnnocation=(College)m.getAnnotation(College.class);
            if (collegeAnnocation !=null){
                System.out.println("Name: "+collegeAnnocation.name());
                System.out.println("location: "+collegeAnnocation.location());
                System.out.println("--------------------------");
            }
        }
        catch (NoSuchMethodException e){
            System.out.println(e);
        }
    }
}
