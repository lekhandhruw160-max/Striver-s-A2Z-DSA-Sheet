import java.util.ArrayList;
import java.util.List;

public  class threeSum {

    public static void main(String args[]){

        int[] nums = {-1,0,1,2,-1,-4};

        threesum(nums);
    }

    public static void threesum(int[] nums){

        List<List<Integer>> n = new ArrayList<>();
        int index = 0;

        for(int i = 0; i < nums.length-2; i++){

            for(int j = i+1; j < nums.length; j++){

                for(int x = j+1; x < nums.length; x++){

                    int sum = nums[i] + nums[j] + nums[x];

                    if( sum == 0){

                        n.add(new ArrayList<>());

                        n.get(index).add(0, nums[i]);
                        n.get(index).add(1,nums[j]);
                        n.get(index).add(2,nums[x]);

                        index++;
                    }
                }
            }
        }

        n.get(0).add(0, 5);

        for(int i = 0; i < n.size(); i++){

            for(int j = i+1; j < n.size(); j++){

                if(n.equals(i) == n.equals(j)){

                    System.out.println("true");
                }
            }
        }

        // System.out.println(n);

        
        
    }
}