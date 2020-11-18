package com.dicoding.androidfundamental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MoreForResultActivity extends AppCompatActivity implements  View.OnClickListener{

    private Button btnChoose;
    private RadioGroup rgNumber;

    public static final String EXTRA_SELECTED_VALUE = "extra_selected_value";
    public static final int  RESULT_CODE = 110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_for_result);

        btnChoose = findViewById(R.id.btn_choose);
        rgNumber = findViewById(R.id.rg_number);

        btnChoose.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        if (v.getId() == R.id.btn_choose) {
            if(rgNumber.getCheckedRadioButtonId() != 0 ) {
                int value = 0;
                switch (rgNumber.getCheckedRadioButtonId()) {
                    case R.id.rb_50:
                        int value1 = 20;
                        int value2 = 30;
                        value = value1 + value2;
                        System.out.println("masuk1");
                        break;
                    case R.id.rb_100:
                        value = 100;
                        System.out.println("masuk2");
                        break;
                    case R.id.rb_150:
                        value = 150;
                        System.out.println("masuk3");
                        break;
                    case R.id.rb_200:
                        value = 200;
                        System.out.println("masuk4");
                        break;
                }
                Intent getResult = new Intent();
                getResult.putExtra(EXTRA_SELECTED_VALUE,value);
                setResult(RESULT_CODE,getResult);
                finish();
            }
        }
    }
}