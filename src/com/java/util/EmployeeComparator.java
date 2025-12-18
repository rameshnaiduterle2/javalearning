package com.java.util;

import com.java.Employee;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getId() > e2.getId()) {
            return 1;
        }else if(e1.getId()  == e2.getId() ) {
            return 0;
        }else {
            return -1;
        }
    }
}
