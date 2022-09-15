package com.demoandroidmodules;

import androidx.annotation.NonNull;

import android.graphics.Color;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class CustomText extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    CustomText(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @ReactMethod
    public void show(){
        Toast.makeText(reactContext, "-~- Hi, I am Android -~-", Toast.LENGTH_LONG).show();
    }

    @NonNull
    @Override
    public String getName() {
        return "CustomTextExample";
    }

    public TextView createViewInstance(ThemedReactContext context){
        TextView textView = new TextView(context);
        textView.setTextIsSelectable(true);
        return textView;
    }

    @ReactProp(name = "text")
    public void setTextView(TextView textView, String color) {
        System.out.println(textView);
        System.out.println(color);
        textView.setTextColor(Color.parseColor(color));
    }
}
