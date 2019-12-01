package edu.learn.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void randomNumbergenerator(){
        Random r = new Random();
        randomNumber = r.nextInt(50);
    }


    public void clickFun(View view){
        EditText text = (EditText) findViewById(R.id.input);
        String userStr = text.getText().toString();
        int usrInput = Integer.parseInt(userStr);

        if (usrInput < randomNumber){
            Toast.makeText(this,"It is low, try little high!",Toast.LENGTH_SHORT).show();
        }
        else if(usrInput > randomNumber){
            Toast.makeText(this,"It is high, try little low!",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Bingo, You've guessed the right number!",Toast.LENGTH_LONG
            ).show();
        }
    }

    public void reset(View view){
        EditText text = (EditText) findViewById(R.id.input);
        text.getText().clear();
        randomNumbergenerator();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
