package com.example.domek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button polub;
    private TextView polubienia;
    private Button usun;
    public int polubienie = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        polub = findViewById(R.id.polub);
        polubienia = findViewById(R.id.polubienia);
        usun = findViewById(R.id.usun);
        polub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        polubienie+=2137;
                        polubienia.setText(String.valueOf(polubienie) + "polubień");
                    }
                }
        );
        usun.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(polubienie > 0){
                            polubienie-=2137;
                            polubienia.setText(String.valueOf(polubienie) + "polubień");
                        }
                        else{
                            polubienia.setText("0 polubień");
                        }
                    }
                }
        );

    }


}