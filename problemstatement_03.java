import java.util.*;

class DNSEntry{
    String ip;
    long expiry;
    DNSEntry(String ip,int ttl){
        this.ip=ip;
        expiry=System.currentTimeMillis()+ttl*1000;
    }
}

public class problemstatement_03{

    static HashMap<String,DNSEntry> cache=new HashMap<>();

    static void resolve(String domain){
        if(cache.containsKey(domain)){
            DNSEntry e=cache.get(domain);
            if(System.currentTimeMillis()<e.expiry){
                System.out.println("Cache HIT "+e.ip);
                return;
            }
        }
        String ip="172.217.14."+new Random().nextInt(255);
        cache.put(domain,new DNSEntry(ip,30));
        System.out.println("Cache MISS "+ip);
    }

    public static void main(String[] args){
        resolve("google.com");
        resolve("google.com");
    }
}