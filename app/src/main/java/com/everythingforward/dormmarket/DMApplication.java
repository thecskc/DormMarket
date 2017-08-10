package com.everythingforward.dormmarket;

import android.app.Application;

import com.everythingforward.dormmarket.utils.ParseUtility;
import com.parse.Parse;
import com.parse.ParseConfig;

/**
 * Created by santh on 8/9/2017.
 */

public class DMApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.Configuration configuration = new Parse.Configuration.Builder(this)
                .applicationId(ParseUtility.PARSE_APP_ID)
                .server(ParseUtility.PARSE_SERVER_URL)
                .build();

        Parse.initialize(configuration);
    }
}
