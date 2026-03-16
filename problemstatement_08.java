
class Spot{
    String plate;
}

public class problemstatement_08{

    static Spot[] table=new Spot[10];

    static int hash(String p){
        return Math.abs(p.hashCode())%10;
    }

    static void park(String p){
        int i=hash(p);

        while(table[i]!=null){
            i=(i+1)%10;
        }

        table[i]=new Spot();
        table[i].plate=p;

        System.out.println("Parked at "+i);
    }

    public static void main(String[] args){
        park("ABC1234");
        park("ABC1235");
        park("XYZ9999");
    }
}