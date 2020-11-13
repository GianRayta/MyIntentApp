package com.dicoding.androidfundamental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        btnMovewithdataActivity.setOnClickListener(this);
        btnMoveactivity.setOnClickListener(this);

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
        }
    }
}