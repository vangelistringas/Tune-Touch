package com.ptixiakipolitis.tampouras;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.ptixiakipolitis.tampouras.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button PlayButton;
    Button WikiButton;
    Button CreditsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlayButton = (Button)findViewById(R.id.PlayButton);
        PlayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPlayActivity();
            }
        });

        WikiButton = (Button)findViewById(R.id.WikiButton);
        WikiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openWikiActivity();
            }
        });

        CreditsButton = (Button)findViewById(R.id.CreditsButton);
        CreditsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openCreditsActivity();
            }
        });
    }

    public void openPlayActivity(){
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);
    }

    public void openWikiActivity(){
        Intent intent = new Intent(this, Wiki.class);
        startActivity(intent);
    }

    public void openCreditsActivity(){
        Intent intent = new Intent(this, Credits.class);
        startActivity(intent);
    }
}