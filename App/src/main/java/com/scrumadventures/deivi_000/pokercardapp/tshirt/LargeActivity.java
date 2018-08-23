package com.scrumadventures.deivi_000.pokercardapp.tshirt;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.scrumadventures.deivi_000.pokercardapp.R;

public class LargeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_large);
        setupbackButton();
        //Following three lines allows the logo picture to be shown in the top left corner of the title
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.sa_icon);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


    }
    private void setupbackButton() {
        Button back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //terminate and return to previous activity
                finish();
            }
        });
    }

    public static Intent makeLargeIntent(Context largeContext) {
        return new Intent(largeContext, LargeActivity.class);
    }
}

