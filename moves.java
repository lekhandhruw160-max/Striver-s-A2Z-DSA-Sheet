public class moves {

    public static void main(String args[]){


        int[] nums = {1,2,3};

        movesFinder(nums);

    }

    public static void movesFinder (int[] nums){


        int count = 0;

        while (count != nums.length) {


        
            int maxV = nums[0];
            int maxI = 0;
            for(int i = 1; i < nums.length; i++){

                if(nums[i] > maxV){
                    maxV = nums[i];
                    maxI = i;
                }
            }

            for(int i = 0; i < nums.length; i++){

                if(i == maxI){
                }
                else {
                    nums[i] += 1;
                }
                
            }

            count = 1;
            maxV = nums[0];

            for(int i = 1; i < nums.length; i++){

                if( nums[i] == maxV){
                    count++;
                }
            }

            if(count == nums.length){
                System.out.print(count);
            }
            return;

        }
    }
}