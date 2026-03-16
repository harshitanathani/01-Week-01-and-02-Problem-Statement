import java.util.*;

public class problemstatement_10 {

    static LinkedHashMap<String, String> L1 = new LinkedHashMap<>(10000, 0.75f, true);
    static HashMap<String, String> L2 = new HashMap<>();
    static HashMap<String, String> L3 = new HashMap<>();

    static int l1Hits = 0;
    static int l2Hits = 0;
    static int l3Hits = 0;

    static void getVideo(String videoId) {

        if (L1.containsKey(videoId)) {
            l1Hits++;
            System.out.println("L1 Cache HIT");
            return;
        }

        if (L2.containsKey(videoId)) {
            l2Hits++;
            System.out.println("L1 MISS → L2 HIT");
            L1.put(videoId, L2.get(videoId));
            return;
        }

        if (L3.containsKey(videoId)) {
            l3Hits++;
            System.out.println("L1 MISS → L2 MISS → L3 HIT");
            L2.put(videoId, L3.get(videoId));
            return;
        }

        System.out.println("Video not found");
    }

    static void showStats() {
        int total = l1Hits + l2Hits + l3Hits;

        System.out.println("L1 Hits: " + l1Hits);
        System.out.println("L2 Hits: " + l2Hits);
        System.out.println("L3 Hits: " + l3Hits);

        double hitRate = ((l1Hits + l2Hits) * 100.0) / total;
        System.out.println("Overall Hit Rate: " + hitRate + "%");
    }

    public static void main(String[] args) {

        L3.put("video_123", "Movie A");
        L3.put("video_456", "Movie B");
        L3.put("video_999", "Movie C");

        getVideo("video_123");
        getVideo("video_123");
        getVideo("video_123");
        getVideo("video_999");

        showStats();
    }
}