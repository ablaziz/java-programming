package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Stretch the dough and put toppings then bake it");
    }

    @Override
    public void serve() {
        System.out.println("Served in a box");
    }
}
