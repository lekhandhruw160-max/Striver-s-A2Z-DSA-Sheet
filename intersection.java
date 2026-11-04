// import java.lang.reflect.Array;
// import java.util.ArrayList;

// public class intersection {

//     public static void main(String args[]){

//         int[] nums1 = {1, 2, 2, 3, 3, 3};

//         int[] nums2 = {2, 3, 3, 4, 5, 7};

//         int[] nums3 =  inter(nums1, nums2);


//         for(int i = 0; i < nums3.length; i++){

//             System.out.print(" "+ nums3[i]);
//         }



//     }

//     public static int[] inter(int[] nums1, int[] nums2){

//         ArrayList<Integer> n = new ArrayList<>();


//         for(int i = 0; i < nums1.length; i++){

//             for(int j = 0; j < nums2.length; j++){

//                 if(nums1[i] == nums2[j]){

//                     if(!n.contains(nums1[i])){

//                         n.add(nums1[i]);
                        
//                     }
//                 }
//             }
//         }






//         // int i = 0; 
//         // int j = 0;

//         // while(i < nums1.length && j < nums2.length){

//         //     if(nums1[i] == nums2[j]){

//         //         n.add(nums1[i]);
//         //         i++;
//         //         j++;

//         //     }
//         //     else if(nums1[i] < nums2[j]){

//         //         i++;
//         //     }
//         //     else {
//         //         j++;
//         //     }
//         // }


//         int[] result = new int[n.size()];

//         for(int k = 0; k < n.size(); k++){

//             result[k] = n.get(k);
//         }

//         return result;

        

//     }
// }

import java.util.ArrayList;
import java.util.List;

public class intersection {

    public static void main(String args[]){

        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};

        intersectionn(nums);



    }

    public   intersectionn(int[][] nums){

        int[] n = new int[1001];

        for(int i = 0; i < nums.length; i++){

            for(int j = 0; j < nums[i].length; j++){

                if(n[nums[i][j]] == i){

                    n[nums[i][j]] += 1;
                }
            }
        }

        for(int i = 0; i < n.length; i++){

            if(n[i] == nums.length){
                System.out.println(i);
            }
           
        }

    }
}