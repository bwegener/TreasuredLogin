package edu.orangecoastcollege.cs273.treasuredloginbwegener;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class TreasureActivity extends AppCompatActivity {

    //DONE (1): Add Firebase member variables (auth and user)
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure);

        //DONE (2): Initialize Firebase authentication
        mAuth = FirebaseAuth.getInstance();

        //DONE (3): Initialize current user
        mUser = mAuth.getCurrentUser();

        TextView welcomeTextView = (TextView) findViewById(R.id.welcomeTextView);

        //DONE (4): Set the text view's text to "Welcome " + user's email address
        welcomeTextView.setText("Welcome " + mUser.getEmail());

    }


    // TODO (5): Create a public void handleSignOut(View v) that signs out of Firebase authentication,
    // TODO (5): finishes this activity and starts a new Intent back to the LoginActivity.
    public void handleSignOut(View v)
    {


        finish();
        Intent loginIntent = new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
    }
}