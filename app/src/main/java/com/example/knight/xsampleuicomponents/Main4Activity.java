package com.example.knight.xsampleuicomponents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView textView = findViewById(R.id.textView5);
        textView.setText( getIntent().getExtras().getString("STDName"));
    }

    public void getCall(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:715896589"));
        startActivity(intent);
    }

    public void getLocation(View view) {
        Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse("geo:78.55,78.55"));
        startActivity(intent);
    }

    public void openBrowser(View view) {
        Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    public void goToAlerts(View view) {
        startActivity(new Intent(this,Dialogs.class));
    }
}
