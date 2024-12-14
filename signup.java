// Signup.JAVA
package com.example.signup;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import java.util.regex.Pattern;

public class Signup extends AppCompatActivity {
    EditText username, pwd;
    Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        pwd = (EditText) findViewById(R.id.password);
        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = username.getText().toString();
                String userpwd = pwd.getText().toString();
                if (email.matches("")) {
                    Toast.makeText(Signup.this, "Username cannot be empty", Toast.LENGTH_LONG).show();
                    return;
                }
                if (!isvalidPassword(userpwd)) {
                    Toast.makeText(Signup.this, "Invalid Password", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent intent = new Intent(Signup.this, Signin.class);
                intent.putExtra("email", email);
                intent.putExtra("userpwd", userpwd);
                startActivity(intent);
            }
        });
    }
    Pattern lowercase = Pattern.compile("^.*[a-z].*$");
    Pattern uppercase = Pattern.compile("^.*[A-Z].*$");
    Pattern number = Pattern.compile("^.*[0-9].*$");
    Pattern special = Pattern.compile("^.*[@#$%^&*(){},.;/].*$");

    private boolean isvalidPassword(String userpwd) {
        if (userpwd.length() < 8) {
         return false;
        }
       if(!lowercase.matcher(userpwd).matches()){
           return false;
       }
       if(!uppercase.matcher(userpwd).matches()){
           return false;
       }
       if(!number.matcher(userpwd).matches()){
           return false;
       }
       if(!special.matcher(userpwd).matches()){
           return false;
       }
        return true;
    }
}
// Signin.JAVA
package com.example.signup;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signin extends AppCompatActivity {
   EditText eusername, epwd;
    Button login;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        eusername = (EditText) findViewById(R.id.username);
        epwd = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);
        String regemail=getIntent().getStringExtra("email");
        String regpwd=getIntent().getStringExtra("userpwd");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newemail=eusername.getText().toString();
                String newpwd=epwd.getText().toString();
                if(regemail.equals(newemail) && regpwd.equals(newpwd)){
                    Toast.makeText(Signin.this, "Login Successful", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(Signin.this,Welcome.class);
                    startActivity(intent);
                    eusername.setText("");
                    epwd.setText("");
                }
                else{
                    count++;
                    Toast.makeText(Signin.this, "Login Failed "+count, Toast.LENGTH_LONG).show();
                    if(count==3)
                    {
                        login.setEnabled(false);
                        Toast.makeText(Signin.this, "Login Failed "+count, Toast.LENGTH_LONG).show();
                    }
                }
             }); 
}
}



// Welcome.JAVA
package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
}

