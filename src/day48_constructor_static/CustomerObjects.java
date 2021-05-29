package day48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1.toString());//print with default value
        customer1.setId(1);
        customer1.setName("Aziz");
        System.out.println(customer1);//sme result if print customer1.to string.

        Customer customer2 = new Customer("Mike",2); //create object and assign value in same statement
        Customer customer3 = new Customer("Nour",2567);
        System.out.println(customer2);
        System.out.println(customer3);

        // array of customers
        Customer[] todayCustomers ={customer1,customer2,customer3,new Customer("niada",198)};

        //arrayList of customer object

        List<Customer> todayCustomerList = new ArrayList<>();
        todayCustomerList.add(customer1);
        todayCustomerList.add(customer2);
        todayCustomerList.add(customer3);
        todayCustomerList.add(new Customer("Bob",2354));
        todayCustomerList.add(new Customer("papa",5489));
        todayCustomerList.add(new Customer("sara", 9876));

        //print info of first customer object in array and arrayList
        System.out.println(todayCustomers[0].toString());
        System.out.println(todayCustomerList.get(0).toString());

        System.out.println(todayCustomerList);
        for(int i =0; i<todayCustomerList.size(); i++){
            System.out.println(todayCustomerList.get(i));
        }
        for(Customer eachCustomer : todayCustomerList){
            System.out.println(eachCustomer);

        }
        // Print only customers names
        System.out.println("------Customer names------");
        for(Customer eachCustomer : todayCustomerList){
            System.out.println(eachCustomer.getName());

        }


    }
}
