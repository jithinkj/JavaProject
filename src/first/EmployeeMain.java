package first;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> obj=new ArrayList();
        Employee emp1 =new Employee("a",25000,"cse");
        Employee emp2 =new Employee("b",15000,"me");
        Employee emp3 =new Employee("c",35000,"eee");
        obj.add(emp1);
        obj.add(emp2);
        obj.add(emp3);
//        for (Employee o:obj) {
//            System.out.println("Name: "+o.empName+" Salary: "+o.salary+" Dept: "+o.dept);
//        }
        Iterator i=obj.iterator();
        while (i.hasNext()){
            Employee n=(Employee) i.next();
            System.out.println("Name: "+n.empName+" Salary: "+n.salary+" Dept: "+n.dept);
//            if(n.empName=="a"){
//                obj.remove(n);
//            }
        }

    }
}
