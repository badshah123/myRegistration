package com.example.student.myregistration;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void onRegister(View view){
        name=(EditText)findViewById(R.id.nameInput);
        username=(EditText)findViewById(R.id.userInput);
        password=(EditText)findViewById(R.id.passInput);


        String name1 = name.getText().toString();
        String user1=username.getText().toString();
        String password1=password.getText().toString();
        AlertDialog alertDialog=new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Status");


        if(name1.equals("123")  && user1.equals("123")  && password1.equals("123")){
            alertDialog.setMessage("SUCCESS");
            Toast.makeText(this,"SUCCESS",Toast.LENGTH_LONG).show();
        }
        else{
            alertDialog.setMessage("FAILED");
            Toast.makeText(this,"FAILED",Toast.LENGTH_LONG).show();
        }

        alertDialog.show();

        Intent i=new Intent(this,Register.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}