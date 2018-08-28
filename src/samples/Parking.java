package samples;

import java.util.ArrayList;

public class Parking {
    int type;
    String slotnum;
    int time;

    public Parking(int type, String slotnum, int time) {
        this.type = type;
        this.slotnum = slotnum;
        this.time = time;
    }
    public static void addVehicle(ArrayList<Parking> p, Parking obj){
        if(p.size()<3){
            p.add(obj);
            System.out.println("After Adding");
            display(p);
        }
        else {
            System.out.println("All slots are occupied!");
        }
    }
    public static void display(ArrayList<Parking> p){
        System.out.println("---------------------------");
        for (Parking obj:p) {
            System.out.print(obj.slotnum+" | ");
        }
        System.out.println("\n---------------------------");
    }
    public static void remove(ArrayList<Parking> p,String num){
        for (Parking a:p) {
            if(a.slotnum.equals(num)){
                System.out.println("Amount= "+a.time*10 +"Rs.");
              p.remove(a)  ;
              break;
            }
        }
    }
}
