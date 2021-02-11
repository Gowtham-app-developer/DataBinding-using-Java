package com.example.databinding_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.databinding_recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        UserRecyclerAdapter userRecyclerAdapter = new UserRecyclerAdapter(getUserList());
        activityMainBinding.recyclerView.setAdapter(userRecyclerAdapter);
        activityMainBinding.recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }

    private List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Android", 10, true, "https://1.bp.blogspot.com/-LgTa-xDiknI/X4EflN56boI/AAAAAAAAPuk/24YyKnqiGkwRS9-_9suPKkfsAwO4wHYEgCLcBGAsYHQ/s0/image9.png"));
        userList.add(new User("Flutter", 5, true, "https://1.bp.blogspot.com/-LgTa-xDiknI/X4EflN56boI/AAAAAAAAPuk/24YyKnqiGkwRS9-_9suPKkfsAwO4wHYEgCLcBGAsYHQ/s0/image9.png"));
        userList.add(new User("React", 8, false, "https://1.bp.blogspot.com/-LgTa-xDiknI/X4EflN56boI/AAAAAAAAPuk/24YyKnqiGkwRS9-_9suPKkfsAwO4wHYEgCLcBGAsYHQ/s0/image9.png"));
        userList.add(new User("NodeJS", 10, true, "https://1.bp.blogspot.com/-LgTa-xDiknI/X4EflN56boI/AAAAAAAAPuk/24YyKnqiGkwRS9-_9suPKkfsAwO4wHYEgCLcBGAsYHQ/s0/image9.png"));
        userList.add(new User("Core Java", 20, false, "https://1.bp.blogspot.com/-LgTa-xDiknI/X4EflN56boI/AAAAAAAAPuk/24YyKnqiGkwRS9-_9suPKkfsAwO4wHYEgCLcBGAsYHQ/s0/image9.png"));
        return userList;
    }
}
