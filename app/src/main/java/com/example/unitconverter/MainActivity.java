package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_textView, result_textView;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_textView = findViewById(R.id.welcome_textView);
        result_textView = findViewById(R.id.result_textView);
        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kilos_entered = Double.parseDouble(editText.getText().toString());
                double pounds_returned =  convertToPound(kilos_entered);

                result_textView.setText(""+ pounds_returned + " lb");
            }
        });
    }

    public double convertToPound(double kilos){
        return kilos * 2.20462;
    }
}