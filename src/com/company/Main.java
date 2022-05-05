package com.company;

public class Main {

    public static void main(String[] args) {
        //--------------------------------------------------------
        String firstName = "Мёхаил ";
        String secondName = "Зубёнко ";
        String lastName = "Петровёч ";
        String fullName = secondName + firstName + lastName;
        System.out.format("ФИО сотрудника - %s\n" , fullName);
        //--------------------------------------------------------
        fullName = secondName.toUpperCase()+ firstName.toUpperCase() + lastName.toUpperCase();
        System.out.format("Данные ФИО сотрудника для заполнения отчета - %s\n" , fullName);
        //--------------------------------------------------------
        fullName = secondName.replace('ё', 'е')+ firstName.replace('ё', 'е') + lastName.replace('ё', 'е');
        System.out.format("Данные ФИО сотрудника для заполнения отчета - %s\n" , fullName);
        //--------------------------------------------------------
    }
}
