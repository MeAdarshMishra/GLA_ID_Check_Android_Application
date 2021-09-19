package com.example.glaidcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button student,faculty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        student=findViewById(R.id.mainButtonStudent);
        faculty=findViewById(R.id.mainButtonFaculty);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent student = new Intent(MainActivity.this, Student.class);
                startActivity(student);
                finish();
            }
        });
        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent faculty = new Intent(MainActivity.this, Faculty.class);
                startActivity(faculty);
                finish();
            }
        });
    }
}