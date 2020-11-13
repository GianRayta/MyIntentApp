package com.dicoding.androidfundamental;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
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

    protected Person(Parcel in) {
        name = in.readString();
        age = in.readInt();
        email = in.readString();
        city = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(email);
        dest.writeString(city);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

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

    public String getCity(String jekardah) {
        return city;
    }

    public void setCity (String city) {
        this.city = city;
    }

}
