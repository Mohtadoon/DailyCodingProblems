package dcp.interfacespractice;

import java.util.SortedMap;

public class BaseClassMain {

    public static void main(String[] args) {
        DefaultMethodTest defaultimpl = new DefaultImpl();
        System.out.println(defaultimpl.getDefault1());

        DefaultMethodTest ds = (String x) -> x;

        System.out.println(ds.test("hello world"));
    }
}
