package com.example.a3pract;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }
    public void FrameOn(View v)
    {
        EditText FirstName = findViewById(R.id.first_name);
        EditText SecondName = findViewById(R.id.second_name);
        EditText GroupName = findViewById(R.id.group_id);
        EditText Grade = findViewById(R.id.grade);
        if (FirstName.getText().toString().length() == 0 || SecondName.getText().toString().length() == 0 || GroupName.getText().toString().length() == 0 || Grade.getText().toString().length() == 0)
        {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Student myStudent = new Student(FirstName.getText().toString(),SecondName.getText().toString(),GroupName.getText().toString(),Integer.parseInt(Grade.getText().toString()));
            Intent FrameAct = new Intent(this, FrameActivity.class);
            FrameAct.putExtra("Student",myStudent);
            startActivity(FrameAct);
        }
    }
    public void LinearOn(View v)
    {
        EditText FirstName = findViewById(R.id.first_name);
        EditText SecondName = findViewById(R.id.second_name);
        EditText GroupName = findViewById(R.id.group_id);
        EditText Grade = findViewById(R.id.grade);
        if (FirstName.getText().toString().length() == 0 || SecondName.getText().toString().length() == 0 || GroupName.getText().toString().length() == 0 || Grade.getText().toString().length() == 0)
        {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Student myStudent = new Student(FirstName.getText().toString(),SecondName.getText().toString(),GroupName.getText().toString(),Integer.parseInt(Grade.getText().toString()));
            Intent LinearAct = new Intent(this, LinearActivity.class);
            LinearAct.putExtra("Student",myStudent);
            startActivity(LinearAct);
        }
    }
    public void RelativeOn(View v)
    {
        EditText FirstName = findViewById(R.id.first_name);
        EditText SecondName = findViewById(R.id.second_name);
        EditText GroupName = findViewById(R.id.group_id);
        EditText Grade = findViewById(R.id.grade);
        if (FirstName.getText().toString().length() == 0 || SecondName.getText().toString().length() == 0 || GroupName.getText().toString().length() == 0 || Grade.getText().toString().length() == 0)
        {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Student myStudent = new Student(FirstName.getText().toString(),SecondName.getText().toString(),GroupName.getText().toString(),Integer.parseInt(Grade.getText().toString()));
            Intent RelativeAct = new Intent(this, RelativeActivity.class);
            RelativeAct.putExtra("Student",myStudent);
            startActivity(RelativeAct);
        }
    }
    public void ConstraintOn(View v)
    {
        EditText FirstName = findViewById(R.id.first_name);
        EditText SecondName = findViewById(R.id.second_name);
        EditText GroupName = findViewById(R.id.group_id);
        EditText Grade = findViewById(R.id.grade);
        if (FirstName.getText().toString().length() == 0 || SecondName.getText().toString().length() == 0 || GroupName.getText().toString().length() == 0 || Grade.getText().toString().length() == 0)
        {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Student myStudent = new Student(FirstName.getText().toString(),SecondName.getText().toString(),GroupName.getText().toString(),Integer.parseInt(Grade.getText().toString()));
            Intent ConstraintAct = new Intent(this, ConstraintActivity.class);
            ConstraintAct.putExtra("Student",myStudent);
            startActivity(ConstraintAct);
        }
    }
}