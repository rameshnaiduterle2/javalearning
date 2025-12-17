package com.java.util;

import com.java.Employee;

import java.util.*;

public class TestLinkedList {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(10);
        employee.setName("Rajesj");
        employee.setAge(30);
        employee.setSalary(50000);

        Employee emp1 = new Employee();
        emp1.setId(5);
        emp1.setName("Ashok");
        emp1.setAge(25);
        emp1.setSalary(25000);

        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("Bhanu");
        emp2.setAge(31);
        emp2.setSalary(30000);

        Employee emp3 = new Employee();
        emp3.setId(7);
        emp3.setName("Chandra");
        emp3.setAge(35);
        emp3.setSalary(70000);

//        Set<Employee> set = new HashSet<>();
//        set.add(employee);
//        set.add(emp1);
//        set.add(emp2);
//        set.add(emp3);
//        Set<Employee> sortedSet = new TreeSet(set);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        Collections.sort(employees);

        for (Employee e : employees) {
            System.out.println(e.toString());
        }

    }



    public void test() {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(50);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(9);
        hashSet.add(16);
        hashSet.add(35);
        hashSet.add(25);
        System.out.println("HashSet :" );

        for (Integer i : hashSet) {
            System.out.println(i);
        }

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(50);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(9);
        linkedHashSet.add(16);
        linkedHashSet.add(35);
        linkedHashSet.add(25);
        System.out.println("linkedHashSet :" );

        for (Integer i : linkedHashSet) {
            System.out.println(i);
        }

        System.out.println("TreeSet :" );
        Set<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(10);
        set.add(20);
        set.add(9);
        set.add(16);
        set.add(35);
        set.add(25);
        for (Integer i : set) {
            System.out.println(i);
        }
    }




}
