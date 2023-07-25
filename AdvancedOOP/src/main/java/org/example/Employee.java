package org.example;

import javax.swing.plaf.DesktopPaneUI;

public class Employee {
    private String name;
    private Department department;
    private Shift shift;

    public Employee(String name, Department department, Shift shift) {
        this.name = name;
        this.department = department;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }
}

// ENUMS!!!

enum Department {
    INBOUND,
    ICQA,
    OUTBOUND,
    HR,
    OPS,
    IT,
    RTS
}

enum Shift {
    FRONT_END,
    DONUT,
    BACK_END,
    RT,
    FLEX
}


