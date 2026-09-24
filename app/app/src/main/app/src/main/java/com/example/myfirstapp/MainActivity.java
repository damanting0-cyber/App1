package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(40, 40, 40, 40);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("My First App");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);

        Button button = new Button(this);
        button.setText("눌러보세요");

        button.setOnClickListener(v -> {
            layout.setBackgroundColor(Color.rgb(230, 240, 255));
            title.setText("버튼을 눌렀어요!");
        });

        layout.addView(title);
        layout.addView(button);

        setContentView(layout);
    }
}
