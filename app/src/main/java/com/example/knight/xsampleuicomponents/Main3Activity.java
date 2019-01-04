package com.example.knight.xsampleuicomponents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textView4);
    }

    public void bOneClick(View view) {
        textView.setText("Button One clicked");
    }

    public void bTwoClick(View view) {
        textView.setText("Button two clicked");
    }

    public void getName(View view) {
        EditText editText= findViewById(R.id.editText8);
        Intent intent = new Intent(this,Main4Activity.class);
        intent.putExtra("STDName",editText.getText().toString());
        startActivity(intent);
    }
}
