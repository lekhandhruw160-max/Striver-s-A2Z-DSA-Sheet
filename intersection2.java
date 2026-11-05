import java.util.ArrayList;

public class intersection2 {


    public static void main(String agrs[]){


        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result =  intersectionTwo(nums1, nums2);

        for(int i : result){

            System.out.print(" " + i);
        }
    }


    public static int[] intersectionTwo(int[] nums1, int[] nums2){

        ArrayList<Integer> n = new ArrayList<>();

        int[] arr = new int[1001];



        for(int i = 0; i < nums1.length; i++) {

            arr[nums1[i]] += 1;
        }

        for(int i = 0; i < nums2.length; i++){

            if(arr[nums2[i]] > 0){

                n.add(nums2[i]);

                arr[nums2[i]] -= 1;
            }
        }

        int[] result = new int[n.size()];

        for(int i = 0; i < n.size(); i++){

            result[i] = n.get(i);

        }

        return result;


       
    }


}
