package Affirm;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        List<String> tran = new ArrayList<String>();

        tran.add("1289,Creation,120000,2019-05-18 05:30:00");
        tran.add("1289,Load,60000,2019-05-18 05:31:00");
        tran.add("510,Creation,120000,2019-05-18 02:30:00");
        tran.add("510,Load,50000,2019-05-18 02:31:00");
        tran.add("361,Purchase,100000,2019-05-18 06:32:00");
        tran.add("361,Load,90000,2019-05-18 06:33:00");
        tran.add("1289,Purchase,150000,2019-05-18 05:32:00");
        tran.add("1289,Load,140000,2019-05-18 02:30:00");


        amounts_to_return_users(tran);
    }
    public static List<String> amounts_to_return_users(List<String> transaction_activities) {

        // create and purchase - only 1/card
        // load $ before purchase (check timestamp) - add multiple
        // return purchase - get refund (timestamp after purchase) - return multiple
        //return amount <= purchase
        // amount - cents
        // time format
        // transaction: card #, type, amount, timestamp

        // RULES
        // * Purchase: deduct affirm fund before user cash and then return user leftover cash to user
        // * Return: return affirm fund before user cash and then return user leftover cash to user

        // REPORT CARD:
        // NOT - info to cal amount to return or amount = 0

        // NOTICE
        // activities NOT in ORDER

        // Create - keep track of fund

        // create a map to store and process transactions
        Map<String, int []> map = new HashMap<String, int[]>();
        // Key - string - card #, value - List of Integer to store Affirm fund, user cash purchase amount and return amount

        // create a list to store return info
        List<String> returnInfo = new ArrayList<String>();

        // 1289,Creation,120000,2019-05-18 05:30:00

        for (int i = 0; i < transaction_activities.size(); i++){
            // Process input
            String tran = transaction_activities.get(i);

            String cardNum = tran.substring(0, tran.indexOf(","));
            String type = tran.substring(tran.indexOf(cardNum)+ cardNum.length() + 1, tran.indexOf(",", tran.indexOf(",") + 1));
            String amount = tran.substring(tran.indexOf(type)+ type.length() + 1, tran.lastIndexOf(","));
            String date = tran.substring(tran.lastIndexOf(",") + 1);
            System.out.println(cardNum + " - " + type + " - " + amount + " - " + date);

            int amountNum = Integer.parseInt(amount);
            int[] money = new int[4];


            // Add card number to map
            if (!map.containsKey(cardNum)) {
                if (type.equalsIgnoreCase("creation")){
                    money[0] = amountNum; // Affirm fund
                } else if (type.equalsIgnoreCase("load")){
                    money[1] += amountNum; // user cash
                } else if (type.equalsIgnoreCase("purchase")){
                    money[2] += amountNum * -1; // user purchase
                }
                map.put(cardNum, money);
            } else {
                if (type.equalsIgnoreCase("creation")){
                    map.get(cardNum)[0] = amountNum;
                } else if (type.equalsIgnoreCase("load")){
                    map.get(cardNum)[1] += amountNum;
                } else if (type.equalsIgnoreCase("purchase")){
                    map.get(cardNum)[2] += amountNum;
//                    int leftover = map.get(cardNum)[2] - map.get(cardNum)[0];
//                    int returnSum = 0;
//                    if (leftover > 0){
//                        returnSum = map.get(cardNum)[1] - leftover;
//                        map.get(cardNum)[3] = returnSum;
//                    }
                }
            }
        }

        for (Map.Entry<String, int[]> e : map.entrySet()) {
            System.out.print("\n~ Card # " + e.getKey() + " - ");

//            if (e.getValue()[1] > e.getValue()[])

            for (int i = 0; i < e.getValue().length; i++){
                System.out.print(e.getValue()[i]+ "  ");
            }
            System.out.println("");
        }

        return returnInfo;

    }

}
