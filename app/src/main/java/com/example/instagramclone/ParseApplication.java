package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Zx2mMaljp7qn1RBYmlAZcr0riiERBcZimO9cVhsL")
                .clientKey("AM3mi5NAkcxpGCcTGtrvArJdQxT7NQ9czHzZ0Sep")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
