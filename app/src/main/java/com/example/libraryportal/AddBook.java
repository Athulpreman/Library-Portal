package com.example.libraryportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddBook extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2,e3,e4;
    String s1,s2,s3,s4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        b1=(Button)findViewById(R.id.AddBook);
        b2=(Button)findViewById(R.id.BackToHome);
        e1=(EditText)findViewById(R.id.BookName);
        e2=(EditText)findViewById(R.id.Description);
        e3=(EditText)findViewById(R.id.Price);
        e4=(EditText)findViewById(R.id.Author);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(getApplicationContext(),LogedIn.class);
                startActivity(intent);
            }
        });
    }
}
