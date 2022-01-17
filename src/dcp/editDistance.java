package dcp;

import static java.lang.Math.*;

public class editDistance {
    static String s1="elephant";
    static String s2="elephantiasis";


    public static void main(String[] args) {

        int count=abs(s1.length()-s2.length());
        int maxLength=max(s1.length(),s2.length());

        for(int i=0;i<maxLength;i++)
        {
            if(i<min(s2.length(),s1.length())   &&  s1.charAt(i)!=s2.charAt(i) )
            {
                count++;
            }

        }
        System.out.println(count);



    }





}
