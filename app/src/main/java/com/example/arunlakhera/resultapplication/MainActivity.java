package com.example.arunlakhera.resultapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView resultTextView = findViewById(R.id.textView_ReportCard);
        Button showButton = findViewById(R.id.show_Button);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ReportCard myReport = new ReportCard("Andrew",89,90,67,78,83,77);
                resultTextView.setText(R.string.myResult + "\n" + myReport);
            }
        });
    }
}
