package com.everythingforward.dormmarket.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.everythingforward.dormmarket.R;
import com.everythingforward.dormmarket.presenters.UserProfileActivityPresenter;
import com.parse.ParseUser;
import com.vstechlab.easyfonts.EasyFonts;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserProfileActivity extends AppCompatActivity {

    UserProfileActivityPresenter presenter;

    @BindView(R.id.welcome_message) TextView welcomeMessageTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        ButterKnife.bind(this);
        presenter = new UserProfileActivityPresenter();

        welcomeMessageTV.setTypeface(EasyFonts.walkwaySemiBold(UserProfileActivity.this));
        welcomeMessageTV.setText(presenter.getUserName(ParseUser.getCurrentUser()));



    }
}
