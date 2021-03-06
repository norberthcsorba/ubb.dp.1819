package csorba.norberth.lab4.strategy;

import csorba.norberth.lab4.employees.Employee;

public class PushNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(Employee employee, String msg) {
        System.out.println(employee + " " + msg);
        System.out.println("Sent via PUSH NOTIFICATION");
    }
}
