package model;

public class Tester {
  public static void main(String[] args) {
    Customer customer = new Customer("first", "second", "j@domain.com");
    System.out.println(customer); // should match format for toString() override in class model.Customer
    Customer customer2 = new Customer("first", "second", "email"); // should throw IllegalArgumentException
  }
}