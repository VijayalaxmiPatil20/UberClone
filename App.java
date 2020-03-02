package com.example.uberclone;

import android.app.Application;
import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kA5I5S4CfImiaR740RmHCQJEWAgLSmaU0GgIIVds")
                .clientKey("A385Bs3NuL6oYKK7pPkp8wUZxuS4lenKlBcVIXzP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
