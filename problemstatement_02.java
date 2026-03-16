import java.util.*;

public class problemstatement_02 {

    static HashMap<String,Integer> stock=new HashMap<>();
    static LinkedHashMap<Integer,String> waiting=new LinkedHashMap<>();

    static void purchase(String product,int user){
        int s=stock.get(product);

        if(s>0){
            stock.put(product,s-1);
            System.out.println("Success, remaining "+(s-1));
        }
        else{
            waiting.put(user,product);
            System.out.println("Added to waiting list position "+waiting.size());
        }
    }

    public static void main(String[] args){
        stock.put("IPHONE15_256GB",2);

        purchase("IPHONE15_256GB",101);
        purchase("IPHONE15_256GB",102);
        purchase("IPHONE15_256GB",103);
    }
}