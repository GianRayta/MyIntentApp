package com.dicoding.androidfundamental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MovewithObjectActivity extends AppCompatActivity {
    public static final String EXTRA_PERSON = "extra_person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movewith_object);

        TextView TvObject = findViewById(R.id.tv_objectdata);

        Person person = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : " + person.getName() + "\nAge : " + person.getAge() + "\nEmail : " + person.getEmail() + "\nCity : " + person.getCity("Jekardah");
        TvObject.setText(text);
    }
}