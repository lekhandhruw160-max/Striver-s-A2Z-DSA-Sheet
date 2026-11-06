import java.util.ArrayList;

public class count {

    public static void main(String args[]){

        int n = 3;
        int x = 2; 
        
        int[][] logs = {{2,4},{2,1},{1,2}, {3,1}};


        // for(int i = 0; i < logs.length; i++){

        //     System.out.print(logs[i][logs[i].length - 1]);
        // }

        int[] queries = {3,4};

        int[] result  = countServers(n, x, queries, logs);

        for(int i : result){
            System.out.println(i);
        }
    }

    public static int[] countServers(int n, int x, int[] queries, int[][] logs){

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < queries.length; i++){

            int num1 = queries[i] - x;
            int num2 = queries[i];

            int nums3 = 0;

            for(int j = 0; j < logs.length; j++){

                int index = logs[j].length - 1;


                if(logs[j][index] < num1 || logs[j][index] > num2){

                    nums3 += 1;
                }

            }

            arr.add(nums3);
        }

        int[] result = new int[arr.size()];

        for(int i = 0; i < arr.size(); i++){

            result[i] = arr.get(i);
        }

        return result;
      
    }
}