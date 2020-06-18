package com.devnn.gradleplugindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.devnn.library1.Library1;

public class MainActivity extends AppCompatActivity {
    TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMsg = findViewById(R.id.msg);
        tvMsg.setText(Library1.hello());
        tvMsg.append("\n");
        tvMsg.append(Library1.call());
    }
}
