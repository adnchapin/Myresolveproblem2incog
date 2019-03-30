package com.example.myresolveproblem2incog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText valorA, valorB, valorC;
    TextView resultadox1, resultadox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorA = findViewById(R.id.valorA);
        valorB = findViewById(R.id.valorB);
        valorC = findViewById(R.id.valorC);

        resultadox1 = findViewById(R.id.resultadox1);
        resultadox2 = findViewById(R.id.resultadox2);
    }

    public void calcular(View view) {
        // validamos campos
        String a = valorA.getText().toString();
        String b = valorB.getText().toString();
        String c = valorC.getText().toString();

        if ( a.isEmpty() || b.isEmpty() || c.isEmpty() ){

        }else{
            double da = Double.parseDouble(a);
            double db = Double.parseDouble(b);
            double dc = Double.parseDouble(c);

            double x1 = (-db + Math.sqrt((db * db)- (4*da*dc))) / (2*da); // formula cuadratica para x1
            double x2 = (-db - Math.sqrt((db * db)- (4*da*dc))) / (2*da); // formula cuadratica para x2

            resultadox1.setText(""+x1);
            resultadox2.setText(""+x2);
        }
    }
}
