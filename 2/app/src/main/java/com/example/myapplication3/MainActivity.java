package com.example.myapplication3;



import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private static final String TAG = "App";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent dataActivity = new Intent(this, DataActivity.class);

        Button send = findViewById(R.id.SUBMIT);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameText = findViewById(R.id.FIO);
                EditText groupText = findViewById(R.id.GROUP);
                EditText ageText = findViewById(R.id.AGE);
                EditText gradeText = findViewById(R.id.GRADE);
                String name = nameText.getText().toString();
                String group = groupText.getText().toString();
                if (name.length() == 0 || group.length() == 0 || ageText.getText().toString().length() == 0 || gradeText.getText().toString().length() == 0)
                {
                    Log.e(TAG,"empty");
                    Toast.makeText(getApplicationContext(), "Недостаточно данных", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int age = Integer.parseInt(ageText.getText().toString());
                    int grade = Integer.parseInt(gradeText.getText().toString());
                    Log.i(TAG, "switched to data");
                    dataActivity.removeExtra("name");
                    dataActivity.removeExtra("group");
                    dataActivity.removeExtra("age");
                    dataActivity.removeExtra("grade");
                    dataActivity.putExtra("name", name);
                    dataActivity.putExtra("group", group);
                    dataActivity.putExtra("age", age);
                    dataActivity.putExtra("grade", grade);
                    startActivity(dataActivity);
                }

            }
        });
    }
    protected void onStart()
    {
        super.onStart();
        Log.e(TAG,"error on start");
        Log.w(TAG,"warning on start");
        Log.i(TAG,"info on start");
        Log.d(TAG,"debug on start");
        Log.v(TAG,"verbose on start");
    }
}