import java.util.ArrayList;

public class count {

    public static void main(String args[]){

        int n = 3;
        int x = 5; 
        
        int[][] logs = {{1,3},{2,6},{1,5}};

        int[] queries = {10,11};

        countServers(n, x, queries, logs);
    }

    public static void countServers(int n, int x, int[] queries, int[][] logs){

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < queries.length; i++){

            int num1 = queries[i] - x;
            int num2 = queries[i];

            int nums3 = 0;

            for(int j = 0; j < logs.length; j++){

                int index = logs[i].length - 1;


                if(logs[i][index] < num1 && logs[i][index] > num1){

                    nums3 += 1;


                }

            }
            arr.add(nums3);
        }

        System.out.println(arr);
    }
}