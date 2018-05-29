package com.example.phannam.numbershape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    class Number {
        int number;

        public boolean isSquare() {
            double SquareRoot = Math.sqrt(number);
            if (SquareRoot == Math.floor(SquareRoot)) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isTriangular() {
            int x = 1;
            int triangular = 1;
            while (triangular < number) {
                x++;
                triangular += x;
            }
            if (triangular == number) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void testNumber(View view) {
        Log.i("info", "button pressed");
        EditText editText = (EditText) findViewById(R.id.editText);
        Number number = new Number();
        number.number = Integer.parseInt(editText.getText().toString());
        System.out.println(number.isSquare());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
