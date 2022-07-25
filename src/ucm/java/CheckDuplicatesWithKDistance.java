package ucm.java;

public class CheckDuplicatesWithKDistance {
    public static void main(String[] args) {

        int[] arr = new int[]{ 10, 5, 3, 4, 3, 5, 6 };
        int range = 2;


       if(checkDup(arr, range)){
           System.out.println("yes");
       }else{
           System.out.println("no");
       }

    }

    static boolean checkDup(int[] arr, int range){
        for(int  i = 0; i< arr.length; i++){



            int j = i+1;
            int k = range;

            while(k > 0 && j < arr.length){

                if(arr[i] == arr[j]){
                    return true;
                }
                j++;
                k--;

            }


        }
        return false;
    }



}
