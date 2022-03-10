package dcp.interfacespractice;

public interface DefaultMethodTest {
    default String getDefault() {
        return "In default method of interface";
    }

    default String getDefault1() {
        return "In default method 1 of interface";
    }

    String test(String parameter);
}
