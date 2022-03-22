package dcp.strings.easy;

public class StringReverse {


    public static void main(String[] args) {
        String x = "Hello";
        //System.out.println(reverse1(x));
        reverse2(x);
    }

    // O(n)
    static void reverse2(String x){
        for(int i = x.length()-1; i >=0; i--){
            System.out.print(x.charAt(i));
        }
    }

    //recurcively
    static void reverse(String x, int index){
      if(index == x.length()){
          return;
      }
      reverse(x, index+1);
      System.out.print(x.charAt(index));
    }

    //two pointer swapping
    static char[] reverse1(String x){
        char[] a = x.toCharArray();
        int i = 0;
        int j = a.length-1;

        while(i < j){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
}
