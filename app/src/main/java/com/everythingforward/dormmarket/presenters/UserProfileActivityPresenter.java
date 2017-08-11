package com.everythingforward.dormmarket.presenters;

import com.everythingforward.dormmarket.utils.ParseUtility;
import com.parse.ParseUser;

import java.util.HashMap;

/**
 * Created by santh on 8/10/2017.
 */

public class UserProfileActivityPresenter {
    public String getUserName(ParseUser parseUser)
    {
        String name = null;
        if(parseUser!=null)
        {
            name = parseUser.getString(ParseUtility.User.name);
        }

        return name;


    }


}
