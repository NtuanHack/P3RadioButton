package com.example.jhon.p3radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup rgGender = (RadioGroup) findViewById(R.id.rg_gender);
        Button btSubmit = (Button) findViewById(R.id.bt_submit);
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rgGender.getCheckedRadioButtonId();

                switch (id){
                    case R.id.rb_male :
                        Toast.makeText(MainActivity.this, " L Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_female :
                        Toast.makeText(MainActivity.this, "P Clicked " +((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
