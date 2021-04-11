package com.samsung.firebasetest.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.samsung.firebasetest.R;
import com.samsung.firebasetest.models.Message;

public class ChatAdapter extends FirebaseRecyclerAdapter<Message, ChatAdapter.MessageViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public ChatAdapter(@NonNull FirebaseRecyclerOptions<Message> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MessageViewHolder holder, int position, @NonNull Message model) {
        holder.bind(model);
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_message, parent, false);
        return new MessageViewHolder(view);
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder {
        View logoView;
        TextView messageView;
        TextView timestampView;

        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            logoView = itemView.findViewById(R.id.viewLogo);
            messageView = itemView.findViewById(R.id.textViewMessage);
            timestampView = itemView.findViewById(R.id.textViewTimeStamp);
        }

        public void bind(Message message) {
            logoView.setBackgroundColor(message.generateColor());
            messageView.setText(message.text);
            timestampView.setText(message.from);
        }
    }
}
