package com.company;

public class Son {
    private int age;
    private String name;

    public Son(int age, String name, EnumCan enumCan) {
        this.age = age;
        this.name = name;
        this.enumCan = enumCan;
    }

    private EnumCan enumCan;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public EnumCan getEnumCan() {
        return enumCan;
    }
    public String getInfo() {
        return "age = " + age +
                "\nname = " + name +
                "\ncan = " + enumCan;
    }


    }

