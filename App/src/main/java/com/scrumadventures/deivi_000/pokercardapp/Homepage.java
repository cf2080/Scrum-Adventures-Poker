package com.scrumadventures.deivi_000.pokercardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.scrumadventures.deivi_000.pokercardapp.fibNumbers.FibMainActivity;
import com.scrumadventures.deivi_000.pokercardapp.tshirt.MainActivity;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        setupTshirtLaunchButton();
        setupFibNumbersLaunchButton();
        setupInfoLaunchButton();

        //Following three lines allows the logo picture to be shown in the top left corner of the title
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.sa_icon);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    private void setupTshirtLaunchButton(){
        ImageButton tshirtButton = (ImageButton) findViewById(R.id.button1);
        tshirtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Homepage.this, "You selected Extra Small", Toast.LENGTH_SHORT).show();
                Intent tshirtIntent = MainActivity.makeTshirtIntent(Homepage.this);
                startActivity(tshirtIntent);
            }
        });
    }

    private void setupFibNumbersLaunchButton(){
        ImageButton fibNumButton = (ImageButton) findViewById(R.id.button2);
        fibNumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity, "You selected Extra Small", Toast.LENGTH_SHORT).show();
                Intent fibNumIntent = FibMainActivity.makeFibMainIntent(Homepage.this);
                startActivity(fibNumIntent);
            }
        });
    }

    private void setupInfoLaunchButton(){
        ImageButton infoButton = (ImageButton) findViewById(R.id.About);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Homepage.this, "You selected Extra Small", Toast.LENGTH_SHORT).show();
                Intent infoIntent = com.scrumadventures.deivi_000.pokercardapp.Information.makeInfoIntent(Homepage.this);
                startActivity(infoIntent);
            }
        });
    }

}