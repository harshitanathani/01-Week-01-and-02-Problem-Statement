import java.util.*;

class T{
    int id,amount;
    T(int i,int a){id=i;amount=a;}
}

public class problemstatement_09{

    static List<T> list=new ArrayList<>();

    static void twoSum(int target){

        HashMap<Integer,T> map=new HashMap<>();

        for(T t:list){
            int c=target-t.amount;

            if(map.containsKey(c)){
                System.out.println("Pair "+map.get(c).id+" "+t.id);
                return;
            }
            map.put(t.amount,t);
        }
    }

    public static void main(String[] args){

        list.add(new T(1,500));
        list.add(new T(2,300));
        list.add(new T(3,200));

        twoSum(500);
    }
}