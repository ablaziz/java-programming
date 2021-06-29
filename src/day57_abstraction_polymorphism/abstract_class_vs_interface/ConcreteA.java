package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA,InterfaceB{
    @Override
    public void absMethodA() {

    }

    @Override
    public void methodB() {
        System.out.println("MethodB overridden version is called");
    }
    //@Override static method are hidden
    public static void staticMethodC() {
        System.out.println("StaticMethodC version is called");
    }

    @Override
    public void methodD(int num) {
        System.out.println("absMethodD overridden version is called " + num);
    }
}
