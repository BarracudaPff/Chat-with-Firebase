package com.samsung.firebasetest.services;

import com.firebase.ui.database.ClassSnapshotParser;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.samsung.firebasetest.models.Message;

public class ChatService {
    public static FirebaseRecyclerOptions<Message> initOptionsForAdapter() {
        Query msgQuery = FirebaseDatabase.getInstance().getReference()
                .child("messages")
                .child("rooms")
                .child("room-uid-1")
                .child("chat");
        ClassSnapshotParser<Message> parser = new ClassSnapshotParser(Message.class);

        return new FirebaseRecyclerOptions.Builder<Message>()
                .setQuery(msgQuery, parser)
                .build();
    }
}
