package com.example.a3pract;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_constraint);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Student student = (Student) getIntent().getSerializableExtra("Student");
        TextView First = findViewById(R.id.lin_fname);
        TextView Second = findViewById(R.id.lin_sname);
        TextView Group = findViewById(R.id.lin_group);
        TextView Grade = findViewById(R.id.lin_grade);
        First.setText(student.getFirst_name().toString());
        Second.setText(student.getSecond_name().toString());
        Group.setText(student.getGroup().toString());
        Grade.setText(Integer.toString(student.getGrade()));
    }

    public void goBack(View view)
    {
        Intent mainAct = new Intent(this, MainActivity.class);
        mainAct.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);    //чтобы кнопка назад не перебрасывала обратно
        startActivity(mainAct);
    }
}