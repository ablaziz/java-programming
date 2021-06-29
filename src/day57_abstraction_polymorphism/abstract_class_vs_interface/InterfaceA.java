package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {
    public static final String TYPE = "Interface";
    double MAX_COUNT = 500; // this is a public static final


    public abstract void methodD(int num);

    public static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str " + str);
    }
    public default void defaultMethodF() {
        System.out.println("defaultMethodF is called");
    }
}
