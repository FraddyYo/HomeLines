package com.company;

public class Main {

    public static void main(String[] args) {
        homework1();
        homework2();
        homework3();
        homewaork4();
    }

    public static void homework1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void homework2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);
    }

    public static void homework3() {
        String fullName = "Ivanov Ivan Ivanovich";
        String newFullName = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела — " + newFullName);
    }

    public static void homewaork4() {
        String fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + newFullName);
    }
}




