package com.dicoding.androidfundamental;

public class Person {
    private String name;
    private int age;
    private String email;
    private String city;

    public Person() {

    } // constructor ini diperlukan jika ada custom constructor contoh public Person (String name) {this.name = name; }

    /*public Person (String name) {
        if (name != "Gian") {
            name = "bukan Gian";
        }
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getEmail () {
        return email;
    }

    public void  setEmail (String email) {
        this.email = email;
    }

    public String getCity () {
        return city;
    }

    public void setCity (String city) {
        this.city = city;
    }

}
