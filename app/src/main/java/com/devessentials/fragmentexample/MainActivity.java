package com.devessentials.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ToolbarFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onTextSizeChange(int fontSize, String text) {
        TextFragment textFragment = (TextFragment) getSupportFragmentManager()
                .findFragmentById(R.id.text_fragment);
        if (textFragment != null) {
            textFragment.changeTextProperties(fontSize, text);
        }
    }
}
