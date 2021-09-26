package com.example.glaidcheck;
Created by MeAdarshMishra
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Student extends AppCompatActivity {
    Button Student,backMain;
    WebView webStudent;
    EditText editStudent;
    String rollNumber;
    int rollInt;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Student=findViewById(R.id.SudentButtonSearch);
        backMain=findViewById(R.id.BackStudent);
        editStudent=findViewById(R.id.studentEdit);
        webStudent=findViewById(R.id.studentWeb);
        Student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollNumber=editStudent.getText().toString().trim();
                if(rollNumber.equals("")){
                    editStudent.setError("Not a valid RollNumber");
                }
                else {
                   // Want to know code? Contact - MeAdarshMishra!!!
                }
            }
        });
        backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Student.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });
    }
}
