import java.util.ArrayList;
import java.util.List;

public class pascalsII {

    // public static void main(String args[]){


    //     int Indexrow = 3;

    //     List<List<Integer>> n = paa(Indexrow);

    //     for(int i = 0; i < n.size(); i++){

    //         System.out.print(n.get(i));
    //     }
    // }

    // public static List<List<Integer>> paa(int Indexrow){

        // List<List<Integer>> n = new ArrayList<>();

        // if(Indexrow == 0){
        //     n.add(new ArrayList<>());
        //     n.get(Indexrow).add(1);
            
        //     return n;
        // }
        // else if(Indexrow == 1){
        //     n.add(new ArrayList<>());
        //     n.add(new ArrayList<>());

        //     n.get(0).add(1);


        //     // n.get(0).add(1);
        //     n.get(1).add(1);
        //     n.get(1).add(1);

        //     return n;
        // }


        // for(int i = 1; i <= Indexrow; i++){

        //     n.add(new ArrayList<>());
        // }

        // for(int i = 0; i < n.size(); i++){

        //     // n.get(i).add(0,1);
        //     // n.get(i).add(n.get(i).size()-1, 1);

        //     if(i == 0 && i == 1){

        //         for(int j = 1; j < n.get(i - 1).size(); j++){

        //             int num = n.get(i-1).get(j) + n.get(i-1).get(j-1);

        //             n.get(i).add(j, num);

        //         }

        //     }
           
        // }
        // return n;

        public static void main(String args[]){

        int nums = 3;

        List<Integer> n = new ArrayList<>();

        generate(nums);

        // System.out.println(n.get(nums));


        // for(int i = 0; i < n.size(); i++){


        //     if(i == nums){

        //         System.out.println(n.get(i));

        //     }
           
        // }


    }

    static void  generate(int nums){


        List<List<Integer>> n = new ArrayList<>();

        for(int i = 1; i <= nums+1; i++){

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

        System.out.println(n.get(nums));
        // return  ;

    

        
    }
}