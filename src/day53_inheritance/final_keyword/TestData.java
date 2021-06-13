package day53_inheritance.final_keyword;

/**
 * TestData class that have a list of constants
 * Values of below variables cannot be changed anywhere
 */
public final class TestData {
    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "password123";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;
}
//public class child extends TestData { CANNOT INHERIT FROM FINAL CLASS
    //
//}
