package dcp.strings.easy;

public class test {

    public static void main(String[] args) {
        int a = 987;
        int  c = 0;
        int b;
        while(a!=0){
            b = a%10;
            c = c*10 + b;
            a = a/10;
        }
        if(a==c){

            System.out.println("yess");
        }
    }

    static void pal(int x){


    }
}
