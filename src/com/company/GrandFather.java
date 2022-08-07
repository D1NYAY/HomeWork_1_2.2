package com.company;

public class GrandFather {
        public EnumCan getEnumCan() {
                return enumCan;
        }

        public GrandFather(EnumCan enumCan) {
                this.enumCan = enumCan;
        }

        private EnumCan enumCan;
        private int age;

        public int getAge() {
                return age;
        }

        public String getName() {
                return name;
        }

        public GrandFather(int age, String name) {
                this.age = age;
                this.name = name;
        }

        private String name;

        public int age(){
                return age;
        }
        public String name(){
                return name;
        }

        public String getInfo() {
return "age = " + age +
        "\nname = " + name +
        "\ncan = " + EnumCan.DRIVE;
        }

}
