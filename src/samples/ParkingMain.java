package samples;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingMain {
    public static void main(String[] args) {
        Parking p1=new Parking(2,"101",2);
        Parking p2=new Parking(2,"102",4);
        Parking p3=new Parking(2,"103",6);
        Parking p4=new Parking(2,"104",7);
        ArrayList<Parking> parking2=new ArrayList();
        Parking.addVehicle(parking2,p1);
        Parking.addVehicle(parking2,p2);
        Parking.addVehicle(parking2,p3);
        Parking.addVehicle(parking2,p4);
        System.out.println("Enter slot to remove:");
        Scanner scan=new Scanner(System.in);
        String sno=scan.next();
        Parking.remove(parking2,sno);
        Parking.display(parking2);
        Parking.addVehicle(parking2,p4);

    }


}
