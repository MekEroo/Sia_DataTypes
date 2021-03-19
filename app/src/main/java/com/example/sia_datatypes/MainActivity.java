package com.example.sia_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display = findViewById(R.id.txtDisplay);
        TextView status = findViewById(R.id.txtDisplay);

        String firstName = "John Mark ";
        char middleinitial = 'U';
        String lastName = "Sia";
        int age = 19;
        float dreamTVLGrade = 94.0f;
        double myMoney = 999999999.88;
        boolean amIMarried = false;

        display.setText("My name is "+ firstName+ " "+ String.valueOf(middleinitial)+ " "+ lastName+ " and I am "+ age + " years old." +
                "\nI have ₱"+ String.valueOf(myMoney)+ " in my wallet right now." +
                "\nMy dream grade in TVL is "+ String.valueOf(dreamTVLGrade));

        if(amIMarried == false) {
            status.setText("I am not maried.");
        } else {
            status.setText("I am married.");
        }
    }
}