package com.example.aplikasipetani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity{

    private Button mBtnLiatPrediksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnLiatPrediksi = findViewById(R.id.bt_liat_prediksi);

        mBtnLiatPrediksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), GraphPrediksiActivity.class);
                startActivity(intent);
            }
        });

        FirebaseMessaging.getInstance().subscribeToTopic("petani");

    }
}