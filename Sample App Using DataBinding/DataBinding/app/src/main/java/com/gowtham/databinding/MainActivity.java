package com.gowtham.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gowtham.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(activityMainBinding.getRoot());

        activityMainBinding.setMyVariable("Hello World");

        User mUser = new User();
        mUser.setName("Gauthy");
        mUser.setAge(24);
        mUser.setActive(true);
        mUser.setImageUrl("https://picsum.photos/id/238/200");
        activityMainBinding.setUser(mUser);

        activityMainBinding.button.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
        });

    }
}