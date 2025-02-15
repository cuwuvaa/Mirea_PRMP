package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DataActivity extends AppCompatActivity {
public static final String TAG = "DATA ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_data);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            Log.i(TAG,"created data activity");
            return insets;
        });

    }

    public void switchToMain(View view)
    {
        Log.i(TAG, "switched to main");
        Intent mainActivity = new Intent(this,MainActivity.class);
        mainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  //чтобы кнопка назад не работала (3практика)
        startActivity(mainActivity);
    }

    protected void onStart()
    {
        super.onStart();
        Log.v(TAG,"start!");
    }

    protected void onResume()
    {
        super.onResume();
        Log.v(TAG,"resume!");
        Bundle arguments = getIntent().getExtras();
        String name = arguments.getString("name");
        String group = arguments.getString("group");
        int age = arguments.getInt("age");
        int grade = arguments.getInt("grade");
        TextView data = findViewById(R.id.showinfo);
        if (arguments != null)
        {
            data.setText("ФИО: " + name + "\nГруппа: "+ group + "\nВозраст: " + age + "\nОценка: " + grade);
        }

    }
    protected void onPause()
    {
        super.onPause();
        Log.v(TAG,"pause!");
    }
    protected void onStop()
    {
        super.onStop();
        Log.v(TAG,"stop!");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.v(TAG,"destroy!");
    }
}
