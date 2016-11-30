package com.rnapp_35_0;

import android.os.Bundle;
import android.widget.Toast;


import com.facebook.react.ReactActivity;
import com.salesforce.androidsdk.reactnative.ui.SalesforceReactActivity;


public class MainActivity extends SalesforceReactActivity {


    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    public boolean shouldAuthenticate() {
        return true;
    }

    @Override
    protected String getMainComponentName() {
        return "RNApp_35_0";
    }
}
