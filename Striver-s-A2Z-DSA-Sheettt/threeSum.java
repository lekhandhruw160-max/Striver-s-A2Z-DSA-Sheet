import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public  class threeSum {

    public static void main(String args[]){

        int[] nums = {-1,0,1,2,-1,-4};

        threesum(nums);
    }

    public static void threesum(int[] nums){

        List<List<Integer>> n = new ArrayList<>();
      

        for(int i = 0; i < nums.length-2; i++){

            for(int j = i+1; j < nums.length; j++){

                for(int x = j+1; x < nums.length; x++){

                    int sum = nums[i] + nums[j] + nums[x];

                    if(sum == 0){

                        List<Integer> l = Arrays.asList(nums[i], nums[j] , nums[x]);

                        Collections.sort(l);

                        if(!n.contains(l)){
                            n.add(l);
                        }

                    }
                    

                    

                }
            }
        }


        for(int i = 0; i < n.size(); i++){

            System.out.println(n.get(i));
        }

      
        
        
    }
}