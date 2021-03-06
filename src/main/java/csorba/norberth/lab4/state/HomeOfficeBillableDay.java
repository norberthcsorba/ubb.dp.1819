package csorba.norberth.lab4.state;

import csorba.norberth.lab4.employees.Employee;

public class HomeOfficeBillableDay implements BillableDay {
    @Override
    public boolean isEmployeeWorking(Employee employee) {
        return true;
    }

    @Override
    public boolean isEmployeeInOffice(Employee employee) {
        return false;
    }

    @Override
    public double paycheckCoeff() {
        return 1;
    }
}
