import java.util.*;

public class problemstatement_04{

    static List<String> ngrams(String t,int n){
        String[] w=t.split(" ");
        List<String> list=new ArrayList<>();

        for(int i=0;i<=w.length-n;i++){
            String g="";
            for(int j=0;j<n;j++) g+=w[i+j]+" ";
            list.add(g.trim());
        }
        return list;
    }

    public static void main(String[] args){

        String doc1="this is a sample essay about data structures";
        String doc2="this is a sample essay about data structures";

        List<String> a=ngrams(doc1,3);
        List<String> b=ngrams(doc2,3);

        int match=0;

        for(String s:b){
            if(a.contains(s)) match++;
        }

        double sim=(match*100.0)/b.size();

        System.out.println("Similarity "+sim+"%");
    }
}