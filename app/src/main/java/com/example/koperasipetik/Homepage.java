package com.example.koperasipetik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homepage);

        (Button) btnInput = findViewById(R.id.btnInput);
        (Button) btnHistory = findViewById(R.id.btnHistory);
    }
}
