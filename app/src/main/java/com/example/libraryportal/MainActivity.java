package com.example.libraryportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    String s1,s2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.username);
        e2=(EditText)findViewById(R.id.password);
        b=(Button)findViewById(R.id.loginBtn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s1=e1.getText().toString().trim();
                s2=e2.getText().toString().trim();

                if ((s1.equals("admin"))&&(s2.equals("12345")))
                {
                    Intent intent=new Intent(getApplicationContext(),LogedIn.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(getApplicationContext(),"Error...!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
