package second;

public class Faculty extends Department
{
    int facId;
    String name;

    public Faculty(int deptId, String deptName,int facId, String name )
    {
        super(deptId,deptName); //  we need to add this because we inherited super class which has parameterised constructor.
        this.facId = facId;
        this.name = name;
    }
public void printDetails(){
    System.out.println("Dept Id:"+super.deptId+",Dept Name:"+super.deptName+",Fac Id:"+facId+",Fac Name:"+name);
}
    public static void main(String[] args) {
        Faculty f= new Faculty(01,"CSE",1,"Jithin");
        f.printDetails();
    }
}
