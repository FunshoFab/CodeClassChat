package com.funsooyenuga.codeclasschat;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<Message> {

    public MessageAdapter(Context context, int layoutResource, List<Message> messages) {
        super(context, layoutResource, messages);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
        }

        TextView messageBody = (TextView) view.findViewById(R.id.messageTextView);
        TextView username = (TextView) view.findViewById(R.id.usernameTextView);

        Message message = getItem(position);

        messageBody.setText(message.getMessageBody());
        username.setText(message.getUsername());

        return view;
    }
}
