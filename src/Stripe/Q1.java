package Stripe;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {

        List<String> tran = new ArrayList<String>();

        tran.add("CREATE id=14$amount=800&currency=USD");
//        tran.add("1289,Load,60000,2019-05-18 05:31:00");
//        tran.add("510,Creation,120000,2019-05-18 02:30:00");
//        tran.add("510,Load,50000,2019-05-18 02:31:00");
        calculate_total_owed(tran);
    }
    public static int calculate_total_owed(List<String> actions) {
        // create -> finalize -> paid (cannot go backward)
        // only calculate amount in USD
        int own = 0, amountNum = 0;
        String id = "", amount = "", input = "";
        Map<String, Integer> map = new HashMap<String, Integer>(); // Key = id, value = amount owned

        // Check if input is valid
        if (actions.size() == 0) return own;

        for (int i = 0; i < actions.size(); i++){
            input = actions.get(i).trim();
            char action = input.charAt(0);
            if (input.indexOf("id") == -1) return own;

            if (action == 'C' || action == 'F'){
                if (input.indexOf("amount") == -1 || input.indexOf("currency") == -1){
                    return own;
                }

                id = input.substring(input.indexOf("=") + 1, input.indexOf("&"));
                amount = input.substring(input.indexOf("=", input.indexOf("=") + 1) + 1, input.indexOf("&", input.indexOf("&") +1));
                amountNum = Integer.parseInt(amount);

                if (!map.containsKey(id) && action == 'C'){
                    map.put(id, amountNum);
                }
            } else if (action == 'P') {
                id = input.substring(input.indexOf("=") + 1);
            }

            if (map.containsKey(id)){
                if (input.indexOf("USD") != -1 || action == 'P'){
                    switch (action){
                        case 'C':
                            break;
                        case 'F':
                            if (map.get(id) > 0) // not paid/finalized invoice
                                map.put(id, amountNum*(-1)); // Use negative num to make sure invoice has been finalized
                            break;
                        case 'P':
                            if (map.get(id) < 0) // finalized invoice
                                map.put(id, 0);
                            break;
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            own += Math.abs(e.getValue());
        }
        return own;
    }
}
