package com.everythingforward.dormmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.parse.FunctionCallback;
import com.parse.ParseCloud;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.ui.ParseLoginBuilder;

import bolts.Task;

public class LoginActivity extends AppCompatActivity {

    private static int LOGIN_REQUEST = 0;
    private ParseUser currentUser=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ParseLoginBuilder loginBuilder = new ParseLoginBuilder(LoginActivity.this);
        startActivityForResult(loginBuilder.build(), LOGIN_REQUEST);






    }

    @Override
    protected void onResume() {
        super.onResume();

        currentUser = ParseUser.getCurrentUser();
        if(currentUser!=null)
        {
            if(currentUser.getEmail().endsWith("nyu.edu")) {
                startActivity(new Intent(LoginActivity.this, MarketActivity.class));
                final String[] response = new String[1];
                ParseCloud.callFunctionInBackground("deleteUser", null, new FunctionCallback<String>() {


                    @Override
                    public void done(String object, ParseException e) {
                        response[0] = object;
                        Toast.makeText(LoginActivity.this, response[0], Toast.LENGTH_SHORT).show();

                    }
                });

            }
            else
            {
                currentUser.logOut();

            }
        }



    }
}
