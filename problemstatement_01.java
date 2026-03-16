import java.util.*;

public class problemstatement_01 {

    static HashMap<String,Integer> users = new HashMap<>();
    static HashMap<String,Integer> attempts = new HashMap<>();

    static boolean checkAvailability(String username){
        attempts.put(username, attempts.getOrDefault(username,0)+1);
        return !users.containsKey(username);
    }

    static void suggest(String username){
        for(int i=1;i<=3;i++){
            String s=username+i;
            if(!users.containsKey(s)) System.out.println(s);
        }
    }

    static void mostAttempted(){
        String name="";
        int max=0;
        for(String k:attempts.keySet()){
            if(attempts.get(k)>max){
                max=attempts.get(k);
                name=k;
            }
        }
        System.out.println("Most attempted: "+name);
    }

    public static void main(String[] args){
        users.put("harshita_nathani",1);
        users.put("admin",2);

        System.out.println(checkAvailability("harshita_nathani"));
        suggest("harshita_nathani");

        System.out.println(checkAvailability("jane_smith"));
        mostAttempted();
    }
}