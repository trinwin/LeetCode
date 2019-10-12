package Cruise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {

    }
    public static String writeIn(List<String> ballot) {
        if (ballot.size() == 0) return "";
        else if (ballot.size() == 1) return ballot.get(0);

        Map<String, Integer> vote = new HashMap<String, Integer>();
        // Initialize Map with candidate name and number of vote
        for (int i = 0; i <= ballot.size(); i++) {
            if (vote.containsKey(ballot.get(i))) {
                vote.put(ballot.get(i), vote.get(ballot.get(i))+1);
            } else {
                vote.put(ballot.get(i), 1);
            }
        }

        //Find candidates with highest vote
        int highest = 0;
        for (Map.Entry<String, Integer> e : vote.entrySet()) {
            System.out.println("Key = " + e.getKey() + ", Value = " + e.getValue());
            if (e.getValue() > highest){
                highest = e.getValue();
            }
        }

        // Analyze candidates with highest vote
        List<String> list=new ArrayList<String>();
        for (Map.Entry<String, Integer> e : vote.entrySet()) {
            if (e.getValue() == highest){
                list.add(e.getKey());
            }
        }
        String winner = list.get(0);
        if (list.size() == 1) return list.get(0);
        else {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).compareToIgnoreCase(winner) > 0){
                    winner = list.get(i);
                }
            }
        }
        return winner;
    }
}
