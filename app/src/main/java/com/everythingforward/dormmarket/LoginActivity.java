package com.everythingforward.dormmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.parse.ParseUser;
import com.parse.ui.ParseLoginBuilder;

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
            }
            else
            {
                currentUser.logOut();

            }
        }



    }
}
