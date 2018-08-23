package com.scrumadventures.deivi_000.pokercardapp.fibNumbers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.scrumadventures.deivi_000.pokercardapp.R;

public class NumValue_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_value_2);
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

    public static Intent makeNum2Intent(Context num2Context){
        return new Intent(num2Context, NumValue_2.class);
    }

}
