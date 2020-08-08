package com.example.passwordmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText password1,password2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password1=findViewById(R.id.password1_id);
        password2=findViewById(R.id.password2_id);

        textView=findViewById(R.id.text_id);

        password2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String p=password1.getText().toString().trim();
                String p2=password2.getText().toString().trim();

                if (p.equals(p2)){
                    password2.setTextColor(Color.GREEN);
                }else {
                    password2.setTextColor(Color.RED);
                }
            }
        });
    }
}
