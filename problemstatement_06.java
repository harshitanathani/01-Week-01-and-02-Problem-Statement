import java.util.*;

class Bucket{
    int tokens=5;
}

public class problemstatement_06{

    static HashMap<String,Bucket> map=new HashMap<>();

    static void check(String id){
        map.putIfAbsent(id,new Bucket());
        Bucket b=map.get(id);

        if(b.tokens>0){
            b.tokens--;
            System.out.println("Allowed "+b.tokens+" left");
        }
        else{
            System.out.println("Denied");
        }
    }

    public static void main(String[] args){
        check("abc123");
        check("abc123");
        check("abc123");
        check("abc123");
        check("abc123");
        check("abc123");
    }
}