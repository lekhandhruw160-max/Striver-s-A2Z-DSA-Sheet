import java.util.ArrayList;
import java.util.List;

public class pascals {

    public static void main(String args[]){

        int nums = 5;

        List<List<Integer>> n = new ArrayList<>();

        n = generate(nums);

        for(int i = 0; i < n.size(); i++){

            System.out.println(n.get(i));
        }


    }

    static List<List<Integer>>  generate(int nums){


        List<List<Integer>> n = new ArrayList<>();

        for(int i = 1; i <= nums; i++){

            n.add(new ArrayList<>());
        }


        for(int i = 0; i < n.size(); i++){

           
            if(i == 0){
                n.get(i).add(0, 1);

            }
            else {

                n.get(i).add(0, 1);
                n.get(i).add(n.get(i).size()-1, 1);
            }

            if(i != 0 && i != 1){

                for(int j = 1; j < n.get(i - 1).size(); j++){

                    int num = n.get(i - 1).get(j) + n.get(i - 1).get(j-1);
                    
                    n.get(i).add(j, num);
                }
            }
        }
        return n ;

    }
}