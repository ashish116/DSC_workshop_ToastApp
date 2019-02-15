package com.example.toastapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //count is set to 0 initially to calculate value

    int count= 0;

    //Button is java class
    //button is id given in activity_main.xml
    //Button button is done to declare that button(XML) is an object Button(java) class
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //JAVA and XML objects are binded
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                //increment count by +1 whenever button is clicked
                count += 1;

                //toast is in android studio provides a small popup
                //it takes three parameters
                //Context is used for mostly in load and access resources.
                //second parameter is msg to be toast
                //third parameter is length of the toast message
                Toast.makeText(getBaseContext(), "Toast "+ count + " Generated its done!" , Toast.LENGTH_SHORT ).show();
            }
        });



    }
}
