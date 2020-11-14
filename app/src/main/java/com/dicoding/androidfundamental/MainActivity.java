package com.dicoding.androidfundamental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveactivity = findViewById(R.id.PindahActivity);
        Button btnMovewithdataActivity = findViewById(R.id.PindahActivitywData);
        Button btnMovewithObjectActivity = findViewById(R.id.PindahActivitywObjek);
        Button btnDialNUmber = findViewById(R.id.btn_dial_number);

        btnMovewithObjectActivity.setOnClickListener(this);
        btnMovewithdataActivity.setOnClickListener(this);
        btnMoveactivity.setOnClickListener(this);
        btnDialNUmber.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.PindahActivity:
                Intent moveintent = new Intent(MainActivity.this,MoveActivity.class);
                startActivity(moveintent);
                break;
            case R.id.PindahActivitywData:
                Intent movedataintent = new Intent(MainActivity.this,MoveWithDataActivity.class);
                movedataintent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Dicoding Boy");
                movedataintent.putExtra(MoveWithDataActivity.EXTRA_AGE,5);
                startActivity(movedataintent);
                break;
            case R.id.PindahActivitywObjek:
                Person person = new Person();
                person.setName("Gian");
                person.setAge(20);
                person.setEmail("ajdhadj@yahui.com");
                person.setCity("Jekardah");
                Intent moveobject = new Intent(MainActivity.this,MovewithObjectActivity.class);
                moveobject.putExtra(MovewithObjectActivity.EXTRA_PERSON,person);
                startActivity(moveobject);
                break;
            case R.id.btn_dial_number:
                String number = "08123654321";
                Intent dialnumber = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+number));
                startActivity(dialnumber);
                break;

        }
    }
}