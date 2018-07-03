package com.example.smartdroidesign.buttonclickapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button button;
    private TextView textView;

    private int numTimesClick = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput  = findViewById(R.id.editText);
        button =findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numTimesClick = numTimesClick + 1;
                    String result = "The button got tapped " + numTimesClick + " time";
                    if (numTimesClick != 1) {
                        result += "s";
                    }
                    result += "\n";
                    textView.append(result);
                }
        };
        button.setOnClickListener(ourOnClickListener);
    }

}
