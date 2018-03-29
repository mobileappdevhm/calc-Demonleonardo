package com.example.leonardo.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button1,button2,button3,button4,button5;
Button button6,button7,button8,button9,button0;
Button buttonADD,buttonSUB,buttonMUL,buttonDIV,buttonEQU,buttonCLEAN;
TextView RESULT;
TextView Title;
double var1,var2;
boolean Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =  findViewById(R.id.buttonOne);
        button2 =  findViewById(R.id.buttonTwo);
        button3 =  findViewById(R.id.buttonThree);
        button4 =  findViewById(R.id.buttonFour);
        button5 =  findViewById(R.id.buttonFive);
        button6 =  findViewById(R.id.buttonSix);
        button7 =  findViewById(R.id.buttonSeven);
        button8 =  findViewById(R.id.buttonEight);
        button9 =  findViewById(R.id.buttonNine);
        button0 =  findViewById(R.id.buttonZero);
        buttonADD =  findViewById(R.id.buttonAdd);
        buttonSUB =  findViewById(R.id.buttonSub);
        buttonMUL =  findViewById(R.id.buttonMul);
        buttonDIV =  findViewById(R.id.buttonDiv);
        buttonEQU =  findViewById(R.id.buttonEqu);
        buttonCLEAN = findViewById(R.id.buttonClear);

        RESULT =  findViewById(R.id.Result);

        Title = findViewById(R.id.Title);

        button1.setOnClickListener ( new View.OnClickListener()
        {
         public void onClick(View v)
         {
             RESULT.setText(RESULT.getText()+"1");
             Title.setText("Processing");
         }
        });
        button2.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RESULT.setText(RESULT.getText()+"2");
                Title.setText("Processing");
            }
        });
        button3.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RESULT.setText(RESULT.getText()+"3");
                Title.setText("Processing");
            }
        });
        button4.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RESULT.setText(RESULT.getText()+"4");
                Title.setText("Processing");
            }
        });
        button5.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RESULT.setText(RESULT.getText()+"5");
                Title.setText("Processing");
            }
        });
        button6.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RESULT.setText(RESULT.getText()+"6");
                Title.setText("Processing");
            }
        });
        button7.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RESULT.setText(RESULT.getText()+"7");
                Title.setText("Processing");
            }
        });
        button8.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RESULT.setText(RESULT.getText()+"8");
                Title.setText("Processing");
            }
        });
        button9.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RESULT.setText(RESULT.getText()+"9");
                Title.setText("Processing");
            }
        });
        button0.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RESULT.setText(RESULT.getText()+"0");
                Title.setText("Processing");
            }
        });
        buttonADD.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                var1 = Double.parseDouble(RESULT.getText()+"");
                Add = true;
                RESULT.setText(null);
                Title.setText("Processing");
            }
        });
        buttonSUB.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                var1 = Double.parseDouble(RESULT.getText()+"");
                Sub = true;
                RESULT.setText(null);
                Title.setText("Processing");
            }
        });
        buttonMUL.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                var1 = Double.parseDouble(RESULT.getText()+"");
                Mul = true;
                RESULT.setText(null);
                Title.setText("Processing");
            }
        });
        buttonDIV.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                var1 = Double.parseDouble(RESULT.getText()+"");
                Div = true;
                RESULT.setText(null);
                Title.setText("Processing");
            }
        });
        buttonEQU.setOnClickListener ( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                var2 = Double.parseDouble(RESULT.getText()+"");
                if(Add == true)
                {
                    RESULT.setText(var1+var2+"");
                    Add = false;
                    Title.setText("Finish");
                }
                if(Sub == true)
                {
                    RESULT.setText(var1-var2+"");
                    Sub = false;
                    Title.setText("Finish");
                }
                if(Mul == true)
                {
                    RESULT.setText(var1*var2+"");
                    Mul = false;
                    Title.setText("Finish");

                }
                if(Div == true)
                {
                    RESULT.setText(var1/var2+"");
                    Div = false;
                    Title.setText("Finish");
                }
            }
        });
        buttonCLEAN.setOnClickListener (
                new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RESULT.setText(null);
                Title.setText("Welcome");
            }
        });
    }
}
