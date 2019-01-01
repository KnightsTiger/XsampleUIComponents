package com.example.knight.xsampleuicomponents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Email address validation

        //Phone number validation
        EditText editText = findViewById(R.id.editText4);
        String phoneNumber  = editText.getText().toString();
        if(PhoneNumberUtils.isGlobalPhoneNumber(phoneNumber)){
            Toast.makeText(this,"ok",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"error",Toast.LENGTH_SHORT).show();
        }

        final EditText editText1 = findViewById(R.id.editText);
        final Button button = findViewById(R.id.button);

        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(editText1.getText().toString().isEmpty()){
                    button.setEnabled(true);
                }
            }
        });
    }

    public void go(View view) {
        startActivity(new Intent(this,ButtonActivities.class));
    }
}
