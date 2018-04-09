package com.fittest4.fittest4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Page_4 extends AppCompatActivity {

    private Button btn12, btn23, btn34;
    TextView result,tell;
    EditText weight ,height;
    Button calculate;
    float bmi, num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4);

        btn12 = (Button) findViewById(R.id.freetrail);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Page_4.this, Page_5.class);
                startActivity(i);
            }
        });

        btn23 = (Button) findViewById(R.id.tac);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Page_4.this, Page_6.class);
                startActivity(i);
            }
        });

        btn34 = (Button) findViewById(R.id.payment);
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Page_4.this, Page_7.class);
                startActivity(i);
            }
        });
        tell = (TextView)findViewById(R.id.tell);
        result = (TextView)findViewById(R.id.result1);
        weight = (EditText)findViewById(R.id.Weight);
        height = (EditText)findViewById(R.id.Height);
        calculate = (Button)findViewById(R.id.calci);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v){

                        num1 = Float.parseFloat(weight.getText().toString());
                        num2 = Float.parseFloat(height.getText().toString());
                        bmi = (num1)/(num2*num2);
                        result.setText(""+bmi);

                        if(bmi < 18.5)
                            tell.setText(String.valueOf("Under Weight"));
                        else if(bmi >= 18.5 && bmi<29.5)
                            tell.setText(String.valueOf("Healthy Weight"));
                        else if (bmi >=29.5)
                            tell.setText(String.valueOf("Over Weight"));
                        else  tell.setText(String.valueOf(" "));

            }
        });

    }
}
