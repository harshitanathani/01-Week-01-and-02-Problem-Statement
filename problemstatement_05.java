import java.util.*;

public class problemstatement_05{

    static HashMap<String,Integer> pageViews=new HashMap<>();
    static HashMap<String,Set<String>> unique=new HashMap<>();
    static HashMap<String,Integer> sources=new HashMap<>();

    static void event(String url,String user,String source){
        pageViews.put(url,pageViews.getOrDefault(url,0)+1);

        unique.putIfAbsent(url,new HashSet<>());
        unique.get(url).add(user);

        sources.put(source,sources.getOrDefault(source,0)+1);
    }

    static void dashboard(){
        for(String url:pageViews.keySet()){
            System.out.println(url+" "+pageViews.get(url)+" views "+unique.get(url).size()+" unique");
        }
    }

    public static void main(String[] args){
        event("/news","u1","google");
        event("/news","u2","facebook");
        event("/sports","u3","google");

        dashboard();
    }
}