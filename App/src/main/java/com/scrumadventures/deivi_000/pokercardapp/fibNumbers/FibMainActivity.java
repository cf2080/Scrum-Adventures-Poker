package com.scrumadventures.deivi_000.pokercardapp.fibNumbers;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.scrumadventures.deivi_000.pokercardapp.R;

public class FibMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fib_main);
        setupbackButton();
        setupValue0LaunchButton();
        setupValueHalfLaunchButton();
        setupValue1LaunchButton();
        setupValue2LaunchButton();
        setupValue3LaunchButton();
        setupValue5LaunchButton();
        setupValue8LaunchButton();
        setupValue13LaunchButton();
        setupValue21LaunchButton();
        setupValue34LaunchButton();
        setupValueInfinityLaunchButton();

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

    public static Intent makeFibMainIntent(Context fibMainContext){
        return new Intent(fibMainContext, FibMainActivity.class);
    }

    private void setupValue0LaunchButton(){
        ImageButton value0_Button = (ImageButton) findViewById(R.id.button1);
        value0_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value 0 Activity
                Intent value0Intent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue_0.makeNum0Intent(FibMainActivity.this);
                startActivity(value0Intent);
            }
        });
    }

    private void setupValueHalfLaunchButton(){
        ImageButton valueHalf_Button = (ImageButton) findViewById(R.id.button2);
        valueHalf_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value 0 Activity
                Intent valueHalfIntent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue_half.makeNumHalfIntent(FibMainActivity.this);
                startActivity(valueHalfIntent);
            }
        });
    }

    private void setupValue1LaunchButton() {
        ImageButton value1_Button = (ImageButton) findViewById(R.id.button3);
        value1_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value 0 Activity
                Intent value1Intent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue_1.makeNum1Intent(FibMainActivity.this);
                startActivity(value1Intent);
            }
        });
    }

    private void setupValue2LaunchButton() {
        ImageButton value2_Button = (ImageButton) findViewById(R.id.button4);
        value2_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value 2 Activity
                Intent value2Intent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue_2.makeNum2Intent(FibMainActivity.this);
                startActivity(value2Intent);
            }
        });
    }

    private void setupValue3LaunchButton() {
        ImageButton value3_Button = (ImageButton) findViewById(R.id.button5);
        value3_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value 3 Activity
                Intent value3Intent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue_3.makeNum3Intent(FibMainActivity.this);
                startActivity(value3Intent);
            }
        });
    }

    private void setupValue5LaunchButton() {
        ImageButton value5_Button = (ImageButton) findViewById(R.id.button6);
        value5_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value 5 Activity
                Intent value5Intent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue_5.makeNum5Intent(FibMainActivity.this);
                startActivity(value5Intent);
            }
        });
    }

    private void setupValue8LaunchButton() {
        ImageButton value8_Button = (ImageButton) findViewById(R.id.button7);
        value8_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value 8 Activity
                Intent value8Intent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue_8.makeNum8Intent(FibMainActivity.this);
                startActivity(value8Intent);
            }
        });
    }

    private void setupValue13LaunchButton() {
        ImageButton value13_Button = (ImageButton) findViewById(R.id.button8);
        value13_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value 13 Activity
                Intent value13Intent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue_13.makeNum13Intent(FibMainActivity.this);
                startActivity(value13Intent);
            }
        });
    }

    private void setupValue21LaunchButton() {
        ImageButton value21_Button = (ImageButton) findViewById(R.id.button9);
        value21_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value 21 Activity
                Intent value21Intent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue_21.makeNum21Intent(FibMainActivity.this);
                startActivity(value21Intent);
            }
        });
    }

    private void setupValue34LaunchButton() {
        ImageButton value34_Button = (ImageButton) findViewById(R.id.button10);
        value34_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value 34 Activity
                Intent value34Intent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue34.makeNum34Intent(FibMainActivity.this);
                startActivity(value34Intent);
            }
        });
    }

    private void setupValueInfinityLaunchButton() {
        ImageButton valueInf_Button = (ImageButton) findViewById(R.id.button11);
        valueInf_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch Value Infintity Activity
                Intent valueInfIntent = com.scrumadventures.deivi_000.pokercardapp.fibNumbers.NumValue_Infinity.makeNumInfinityIntent(FibMainActivity.this);
                startActivity(valueInfIntent);
            }
        });
    }

}