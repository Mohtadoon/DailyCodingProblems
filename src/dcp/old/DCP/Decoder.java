package dcp.old.DCP;

public class Decoder{

    public static void main(String[] args) {

        String test="11111";

        DecoderHelper t1=new DecoderHelper();
        System.out.println(t1.solution(test));
    }

}

class DecoderHelper {

    public int solution(String s){
        return numberDecoder(s.toCharArray(), s.length());
    }

    private int numberDecoder(char[] str, int length){
        if(length == 0 || length == 1){
            return 1;
        }

        int count = 0;

        if(str[length-1] > '0'){
            count = numberDecoder(str, length-1);
        }

        if (str[length - 2] == '1' ||
                (str[length - 2] == '2' && str[length - 1] < '7')) {
            count += numberDecoder(str, length - 2);
        }

        return count;
    }
}

