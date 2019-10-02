package Plaid;

public class Q1 {
    public static void main(String[] args) {
        String [][] a = {
                {"0", "INSERT", "a"},
                {"1", "INSERT", "b"},
                {"1", "INSERT", "b"}
        };
        System.out.print(solution(a));
    }
    public static String solution(String [][] input){
        StringBuilder str = new StringBuilder();
        int numUndo = 0;
        for (int i = 0; i < input.length; i++){
            if (input[i][1].equals("INSERT")) {
                str.append(input[i][2]);
                System.out.println(str.toString());
            } else if (input[i][1].equals("DELETE")){
                if (str.length() > 0) {
                    str.delete(str.indexOf(input[i-1][2]), str.length()-1);
                }
            } else if (input[i][1].equals("UNDO")) {
                numUndo++;
                if (str.length() > 1){
                    if (input[i-numUndo][1].equals("INSERT")) {
                        if (str.length() > 0) {
                            str.delete(str.indexOf(input[i-numUndo][2]), str.length()-1);
                        }
                    } else if (input[i-numUndo][1].equals("DELETE")){
                        str.append(input[i-numUndo][2]);
                    }
                }
            } else if (input[i][1].equals("REDO")){
                if (input[i-1][1].equals("UNDO")){

                }
            }

        }
        return str.toString();
    }

}
