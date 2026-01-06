package com.java.util;

import com.java.Employee;

import java.util.*;

public class CollectionTestMain {

    public static void main(String[] args) {
        treeMap();
    }

    private static void treeMap() {
        System.out.println(Thread.currentThread().getName());
        Map<Integer, String> treeMap = new TreeMap<>(); // Ascending order
                //new TreeMap<>(Comparator.reverseOrder()); -- Descending order.
        treeMap.put(10, "A");
        treeMap.put(1, "B");;
        treeMap.put(6, "D");
        treeMap.put(3, "X");
        System.out.println(treeMap);

        Set<Integer> keys = treeMap.keySet();
        for (Integer key:keys ) {
            System.out.println(treeMap.get(key));
        }

    }

    private static void linkedHashMap() {
        Map<Employee, Integer> map = new HashMap<>();
        Employee e1 = new Employee();
        e1.setName("rajesh");
        e1.setId(1);
        e1.setSalary(10000);

        Employee e2 = new Employee();
        e2.setName("rajesh");
        e2.setId(1);
        e2.setSalary(10000);
        map.put( e1, 1);
        map.put( e2,2);
        map.put( null,null);
        System.out.println(map.size());

        Set<Employee> keySet =   map.keySet();
        System.out.println("KeySet" + keySet);
        for (Employee key: keySet) {
            Integer value = map.get(key);
            System.out.println(value);
        }

    }

    private static void hashMap() {


        Map<String, String> map = new HashMap<>();
        map.put("1", "Venkat");
        map.put("2", "Rajesh");
        map.put("3", "Rajesh");
        map.put("4", "abc");

//        String value =    map.get("1");

        // iteration:
            // we have to convert to set. (entrySet or keySet)
            // then this set has to iterated.

        //using keyset:
        //keySet holds all keys in a map gives as Set

        Set<String> keySet =   map.keySet();
        System.out.println("KeySet" + keySet);
        for (String key: keySet) {
                String value = map.get(key);
                System.out.println(value);
        }

        //EntrySet:
            //Entry means combination of key and value. each key and value coverting into a set called Entry set.

        System.out.println("Using EntrySet");
        Set<Map.Entry<String, String>> entrySet =  map.entrySet();
        for (Map.Entry<String, String> entry :entrySet) {
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
