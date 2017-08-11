package com.everythingforward.dormmarket.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.everythingforward.dormmarket.R;
import com.everythingforward.dormmarket.presenters.UserProfileActivityPresenter;

public class UserProfileActivity extends AppCompatActivity {

    UserProfileActivityPresenter presenter;

    TextView welcomeMessageTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        presenter = new UserProfileActivityPresenter();


    }
}
