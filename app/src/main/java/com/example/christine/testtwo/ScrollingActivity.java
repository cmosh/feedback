package com.example.christine.testtwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ScrollingActivity extends AppCompatActivity {

    RadioButton rbtnFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.btnStronglyDisagree:
                if (checked)
                    Toast.makeText(ScrollingActivity.this, "Strongly Disagree", Toast.LENGTH_LONG).show();
                    break;
            case R.id.btnDisagree:
                if (checked)
                    Toast.makeText(ScrollingActivity.this, "Disagree", Toast.LENGTH_LONG).show();
                    break;case R.id.btnNeutral:
                if (checked)
                    Toast.makeText(ScrollingActivity.this, "Neutral", Toast.LENGTH_LONG).show();
                    break;case R.id.btnAgree:
                if (checked)
                    Toast.makeText(ScrollingActivity.this, "Agree", Toast.LENGTH_LONG).show();
                    break;case R.id.btnStronglyAgree:
                if (checked)
                    Toast.makeText(ScrollingActivity.this, "Strongly Agree", Toast.LENGTH_LONG).show();
                    break;
        }
    }
    public void onComplete(View view){
        Intent intent = new Intent(this,UnitOne.class );
        startActivity(intent);

    }
}
