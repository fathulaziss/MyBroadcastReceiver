package com.example.mybroadcastreceiver;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SmsReceiverActivity extends AppCompatActivity {

    public static final String EXTRA_SMS_NO = "extra_sms_no";
    public static final String EXTRA_SMS_MESSAGE = "extra_sms_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_receiver);

        setTitle(getString(R.string.incoming_message));

        Button btnClose = findViewById(R.id.btn_close);
        TextView tvFrom = findViewById(R.id.tv_from);
        TextView tvMessage = findViewById(R.id.tv_message);

        btnClose.setOnClickListener(v -> finish());
        String senderNo = getIntent().getStringExtra(EXTRA_SMS_NO);
        String senderMessage = getIntent().getStringExtra(EXTRA_SMS_MESSAGE);
        tvFrom.setText(String.format("from : %s", senderNo));
        tvMessage.setText(senderMessage);
    }
}