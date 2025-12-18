package com.java.util;

import com.java.Employee;

import java.util.*;

public class TestLinkedList {

    public static void main(String[] args) {
       hashMap();
    }

    private static void hashMap() {


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Venkat");
        map.put(2, "Rajesh");
        map.put(3, "Rajesh");
        map.put(4, "abc");


        // iteration:
            // we have to convert to set. (entrySet or keySet)
            // then this set has to iterated.

        //using keyset:
            //keySet holds all keys in a map gives as Set

        Set<Integer> keySet =   map.keySet();
        for (Integer key: keySet) {
                String value = map.get(key);
                System.out.println(value);
        }

        //EntrySet:
            //Entry means combination of key and value. each key and value coverting into a set called Entry set.

        System.out.println("Using EntrySet");
        Set<Map.Entry<Integer, String>> entrySet =  map.entrySet();
        for (Map.Entry<Integer, String> entry :entrySet) {
            System.out.println("key: " + entry.getKey() + " Value :" + entry.getValue());

        }


    }


    public static void day2(){
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

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        Collections.sort(employees, new EmployeeComparator());

        System.out.println(employees.size());
//        employee.compareTo(emp1);

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
