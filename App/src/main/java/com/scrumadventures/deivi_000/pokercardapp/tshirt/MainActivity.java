package com.scrumadventures.deivi_000.pokercardapp.tshirt;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.scrumadventures.deivi_000.pokercardapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       setupbackButton();
        setupExtraSmallLaunchButton();
        setupSmallLaunchButton();
        setupMediumLaunchButton();
        setupLargeLaunchButton();
        setupExtraLargeLaunchButton();

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

    public static Intent makeTshirtIntent(Context tshirtContext){
        return new Intent(tshirtContext, MainActivity.class);
    }


    private void setupExtraSmallLaunchButton(){
        ImageButton extraSmallButton = (ImageButton) findViewById(R.id.extraSmallButton);
        extraSmallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch small activity
                Intent extraSmallIntent = ExtraSmallActivity.makeExtraSmallIntent(MainActivity.this);
                startActivity(extraSmallIntent);
            }
        });
    }

    private void setupSmallLaunchButton(){
        ImageButton smallButton = (ImageButton) findViewById(R.id.smallButton);
        smallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch small activity
                Intent smallIntent = SmallActivity.makeSmallIntent(MainActivity.this);
                startActivity(smallIntent);
            }
        });
    }

    private void setupMediumLaunchButton(){
        ImageButton mediumButton = (ImageButton) findViewById(R.id.mediumButton);
        mediumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch medium activity
                Intent mediumIntent = MediumActivity.makeMediumIntent(MainActivity.this);
                startActivity(mediumIntent);
            }
        });
    }

    private void setupLargeLaunchButton(){
        ImageButton largeButton = (ImageButton) findViewById(R.id.largeButton);
        largeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch large activity
                Intent largeIntent = LargeActivity.makeLargeIntent(MainActivity.this);
                startActivity(largeIntent);
            }
        });
    }

    private void setupExtraLargeLaunchButton(){
        ImageButton extraLargeButton = (ImageButton) findViewById(R.id.extraLargeButton);
        extraLargeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch extra large activity
                Intent extraLargeIntent = ExtraLargeActivity.makeExtraLargeIntent(MainActivity.this);
                startActivity(extraLargeIntent);
            }
        });
    }
}