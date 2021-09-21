package com.example.glaidcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Faculty extends AppCompatActivity {
    Button Faculty,backMain;
    WebView webFaculty;
    EditText editFaculty;
    int IDInt;
    String urlfaculty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        Faculty=findViewById(R.id.FacultyButtonSearch);
        backMain=findViewById(R.id.BackFaculty);
        editFaculty=findViewById(R.id.facultyEdit);
        webFaculty=findViewById(R.id.facultyWeb);
        Faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String glaid=editFaculty.getText().toString().trim();
                if(glaid.equals("")){
                    editFaculty.setError("Not a valid GLAID");
                }
                else {
                    //Want to know code? Contact me for code!!
                }
            }
        });
        backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Faculty.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });
    }
}
