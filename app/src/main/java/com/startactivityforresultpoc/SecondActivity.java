package com.startactivityforresultpoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText mEtMessage;
    private Button mBtnSendBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mEtMessage = (EditText) findViewById(R.id.et_second_activity);
        mBtnSendBack = (Button) findViewById(R.id.btn_send_back);
        mBtnSendBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = mEtMessage.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("MESSAGE", s);
                setResult(2, intent);
                finish();

            }
        });
    }
}
