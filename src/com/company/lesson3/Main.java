package com.company.lesson3;

import com.company.lesson3.Company;
import com.company.lesson3.Person;

import java.util.ArrayList;

public class Main {

    //    public static void main(String[] args) {
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Andy");
//        list.add("Nastya");
//        list.add("Lesya");
//
//
//	// write your code here
//    }
    public static void main(String[] args) {
        Test test = new Test();
        ArrayList<Person> employees = test.persons();

        Company company = test.myCompany();

//        for (Person employee: company.getEmployees()) {
//            if (employee.getFirstName().equals("Alex")){
//                System.out.println(employee.getLastName());
//            }
//        }
        Person employee = company.findEmloyeeByFirstname("Oleh");
        if (employee != null) {
            System.out.println(employee.getLastName());
        } else {
            System.out.println("Not found");
        }
    }
}
