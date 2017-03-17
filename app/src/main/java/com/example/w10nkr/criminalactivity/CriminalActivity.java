package com.example.w10nkr.criminalactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CriminalActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*we need to add another fragment here
        I mean the CrimeFragment here, think about a HTML frame concept
        in which you can use a frame to put several HTML documents
        together inside a single HTML file
         */

        FragmentManager fm = getSupportFragmentManager();
        //look like frameset in HTML


        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        //get fragment by ID name

        if (fragment == null) //if there's no fragment object found
        {
            fragment = new CrimeFragment(); //create fragment objects
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
            //add the fragment object to the activity
        }
    }
}
