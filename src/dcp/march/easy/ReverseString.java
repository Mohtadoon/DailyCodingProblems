package dcp.march.easy;

public class ReverseString {

    public static void main(String[] args) {

        String test = "HelloWorld";
        reverse(test,0);
    }

    public static void reverse(String s, int index){

        if(s !=null && index >= s.length()){
            return;
        }
        reverse(s, index + 1);
        System.out.print(s.charAt(index));
    }
}
