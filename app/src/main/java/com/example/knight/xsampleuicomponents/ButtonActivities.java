package com.example.knight.xsampleuicomponents;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ButtonActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_activities);
        CheckBox checkBox = findViewById(R.id.checkBox2);
        if(checkBox.isChecked())
            checkBox.setChecked(false);

        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    TextView textView = findViewById(R.id.textView2);
                    textView.setText("button on");
                }else {
                    TextView textView = findViewById(R.id.textView2);
                    textView.setText("button off");
                }
            }
        });

        Switch aSwitch = findViewById(R.id.switch1);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    TextView textView = findViewById(R.id.textView2);
                    textView.setText("Switch on");
                }else {
                    TextView textView = findViewById(R.id.textView2);
                    textView.setText("switch off");
                }
            }
        });
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.checkBox:
                if(checked)
                Toast.makeText(this,"Apple",Toast.LENGTH_SHORT).show();break;
            case R.id.checkBox2:
                if(checked)
                    Toast.makeText(this,"Orange",Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox3://something
                break;
        }
    }


    public void radioSelect(View view) {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton:
                        TextView textView = findViewById(R.id.textView2);
                        textView.setText("hoooodldl");
                        break;
                    case R.id.radioButton2:
                        TextView textView1 = findViewById(R.id.textView2);
                        textView1.setText("femail");
                        break;
                }
            }
        });
    }


    public void showSnak(View view) {
    Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("CLOSE", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                         TextView textView = findViewById(R.id.textView2);
                        textView.setText("Reday to close");
                    }
                })
            .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
            .show();

    }

    public void gotowpage(View view) {
        startActivity(new Intent(this,Widgets.class));
    }
}
