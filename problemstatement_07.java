import java.util.*;

public class problemstatement_07{

    static HashMap<String,Integer> queries=new HashMap<>();

    static void add(String q){
        queries.put(q,queries.getOrDefault(q,0)+1);
    }

    static void search(String p){
        for(String q:queries.keySet()){
            if(q.startsWith(p))
                System.out.println(q+" "+queries.get(q));
        }
    }

    public static void main(String[] args){
        add("java tutorial");
        add("java tutorial");
        add("javascript");
        add("java download");

        search("jav");
    }
}