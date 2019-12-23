package com.example.libraryportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity {
    Button button;
    EditText e1,e2,e3,e4,e5,e6;
    String s1,s2,s3,s4,s5,s6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        button=(Button)findViewById(R.id.BackHome);
        e1=(EditText)findViewById(R.id.studentname);
        e2=(EditText)findViewById(R.id.admission);
        e3=(EditText)findViewById(R.id.college);
        e4=(EditText)findViewById(R.id.rollno);
        e5=(EditText)findViewById(R.id.parentname);
        e6=(EditText)findViewById(R.id.mobile);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();
                s6=e6.getText().toString();

                Toast.makeText(getApplicationContext(),s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6,Toast.LENGTH_LONG).show();

                Intent intent=new Intent(getApplicationContext(),LogedIn.class);
                startActivity(intent);
            }
        });
    }
}
