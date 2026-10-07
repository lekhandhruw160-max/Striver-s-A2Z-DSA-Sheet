public class missing {
    public static void main(String args[]){

        int[] nums = {3,0,1};


        int answer = elementFinder(nums);

        System.out.println(answer);

        // int n = nums.length;
        // int[] array = new int[n];
        // System.out.println(array.length);

    }

    public static int elementFinder(int[] nums){

        int n = nums.length;
        int[] array = new int[n+1];

        for(int i = 0; i < nums.length; i++){

            int num = nums[i];
            array[num] = 1;

        }

        for(int i = 0; i < array.length; i++){

            if(array[i] == 0)return i;

        }
        return -1;
    }
}