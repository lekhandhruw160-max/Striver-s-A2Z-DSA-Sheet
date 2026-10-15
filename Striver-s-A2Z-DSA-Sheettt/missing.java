public class missing {
    public static void main(String args[]){

        int[] nums = {3,0,1};


        // int answer = elementFinder(nums);
        //  System.out.println(element(nums));

        // System.out.println(answer);

        // int n = nums.length;
        // int[] array = new int[n];
        // System.out.println(array.length);

    }

    public static int elementFinder(int[] nums){

        int n = nums.length;
        int[] array = new int[n+1];

        n = Integer.MIN_VALUE;
        

    

        for(int i = 0; i < nums.length; i++){

            int num = nums[i];
            array[num] = 1;

        }

        for(int i = 0; i < array.length; i++){

            if(array[i] == 0)return i;

        }
        return -1;
    }

    //  2 : = ye wala thoda optimize hai 

    static int element(int[] nums) {

        int sum = 0;

        for(int i = 1; i <= nums.length; i++){
            sum = sum + i;
        }
        for(int i = 0; i < nums.length; i++){
            sum -= nums[i];
        }
        
        return sum;

    }
    
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: Array ko sort karo
        Arrays.sort(nums);
        
        // Step 2: Ek-ek karke element fix karo
        for (int i = 0; i < nums.length - 2; i++) {
            // Duplicate 'i' values ko skip karo
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Step 3: Two pointers initialize karo
            int left = i + 1;
            int right = nums.length - 1;
            
            // Step 4: Two pointer search
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Duplicate 'left' values ko skip karo
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Duplicate 'right' values ko skip karo
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Sum badhana hai toh left pointer aage badhao
                } else {
                    right--; // Sum ghataana hai toh right pointer peeche laao
                }
            }
        }
        
        return result;
    }
}


