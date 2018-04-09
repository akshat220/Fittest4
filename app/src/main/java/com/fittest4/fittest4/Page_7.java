package com.fittest4.fittest4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page_7 extends AppCompatActivity {

    private Button btn, btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_7);

        btn = (Button) findViewById(R.id.pay1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Page_7.this, Page_8.class);
                startActivity(i);
            }
        });

        btn1 = (Button) findViewById(R.id.pay2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Page_7.this, Page_8.class);
                startActivity(i);
            }
        });
    }
}
