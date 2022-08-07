package com.company;

public class Father extends GrandFather {
    private int age;
    private String name;
    private EnumCan enumCan;


    public Father(EnumCan enumCan, int age, String name, EnumCan enumCan1) {
        super(enumCan);
        this.age = age;
        this.name = name;
        this.enumCan = enumCan1;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public EnumCan getEnumCan() {
        return enumCan;
    }
}

