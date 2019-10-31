package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0, b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8 , b9 , bb , bm , ba , bd , bs , bp , be ;
    EditText text;
    Double var1 , var2;
    boolean add , sub , div , mul ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById (R.id.Button0);
        b1 = (Button) findViewById (R.id.Button1);
        b2 = (Button) findViewById (R.id.Button2);
        b3 = (Button) findViewById (R.id.Button3);
        b4 = (Button) findViewById (R.id.Button4);
        b5 = (Button) findViewById (R.id.Button5);
        b6 = (Button) findViewById (R.id.Button6);
        b7 = (Button) findViewById (R.id.Button7);
        b8 = (Button) findViewById (R.id.Button8);
        b9 = (Button) findViewById (R.id.Button9);
        bb = (Button) findViewById (R.id.BackSpace);
        bm = (Button) findViewById (R.id.ButtonM);
        ba = (Button) findViewById (R.id.ButtonA);
        bd = (Button) findViewById (R.id.ButtonD);
        bs = (Button) findViewById (R.id.ButtonS);
        bp = (Button) findViewById (R.id.ButtonP);
        be = (Button) findViewById (R.id.ButtonE);

        text = (EditText) findViewById (R.id.PutValues) ;

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"9");
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+".");
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(text.getText()+"");
                add=true;
                text.setText(null);
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(text.getText()+"");
                sub=true;
                text.setText(null);
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(text.getText()+"");
                mul=true;
                text.setText(null);

            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(text.getText()+"");
                div=true;
                text.setText(null);
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(text.getText()+"");

                if (div==true)
                {
                    text.setText(var1/var2+"");
                    div=false;
                }

                if (mul==true)
                {
                    text.setText(var1*var2+"");
                    mul=false;
                }

                if (add==true)
                {
                    text.setText(var1+var2+"");
                    add=false;
                }

                if (sub==true)
                {
                    text.setText(var1-var2+"");
                    sub=false;
                }

            }
        });

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                if (str.length() >= 1) {
                    str = str.substring(0, str.length() - 1);
                    text.setText(str);
                } else if (str.length() <= 1) {
                    text.setText(null);
                }
            }
        });

    }
}
