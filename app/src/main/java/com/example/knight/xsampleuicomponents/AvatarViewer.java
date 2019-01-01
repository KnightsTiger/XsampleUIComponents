package com.example.knight.xsampleuicomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import agency.tango.android.avatarview.IImageLoader;
import agency.tango.android.avatarview.loader.PicassoLoader;
import me.fahmisdk6.avatarview.AvatarView;



public class AvatarViewer extends AppCompatActivity {
    AvatarView avatarView;
    IImageLoader imageLoader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar_viewer);
        avatarView = (AvatarView) findViewById(R.id.avatar_view_example);


    }
}
