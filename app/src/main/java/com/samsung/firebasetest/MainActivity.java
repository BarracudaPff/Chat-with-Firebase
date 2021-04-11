package com.samsung.firebasetest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.firebasetest.adapters.ChatAdapter;
import com.samsung.firebasetest.models.User;

public class MainActivity extends AppCompatActivity {
//-MY-ZzskDzSl8u9TAp1o
//-MY-b2WMlniJ33tC6JTo
//-MY-b6bPMx-LYr9Z9obZ
//-MY-buX-LxQy2jftfwLz
//-MY-e7eua2qGvKNDKvef
//-MY-g3tsaBu4ZbyZExwW
//-MY-jhFjdtb8Llc0i9zX
//-MY-jifKFd2XHQdY5yVE
//-MY-jl21I_s0JiAxSH5k
    String currentUser = "-MY-jl21I_s0JiAxSH5k";

    ChatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerViewChat = findViewById(R.id.chatList);
        recyclerViewChat.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setReverseLayout(true);
        recyclerViewChat.setLayoutManager(manager);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}