package com.example.viktorina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class AboutActivity extends AppCompatActivity {

    MaterialCardView developerCard, darkMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        developerCard=findViewById(R.id.developerCard);
        darkMode=findViewById(R.id.darkMode);

        developerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("");
                Intent like = new Intent(Intent.ACTION_VIEW,uri);
                like.setPackage("");

                try {
                    startActivity(like);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
                }
            }
        });
    }
}