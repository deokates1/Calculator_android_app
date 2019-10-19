package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    // create reference variable for all buttons and edit text view.
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8,
            btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_equal,
            btn_dec, btn_clear;

    EditText edit1;

    // create two float variable.
    float value1, value2;

    boolean add, sub, mul, div ;

    //map xml file variable to reference variable.
    private void UIViews ()
    {
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_Add = findViewById(R.id.btn_Add);
        btn_Sub = findViewById(R.id.btn_Sub);
        btn_Mul = findViewById(R.id.btn_Mul);
        btn_Div = findViewById(R.id.btn_Div);
        btn_dec = findViewById(R.id.btn_dec);
        btn_clear = findViewById(R.id.btn_clear);
        btn_equal = findViewById(R.id.btn_equal);

        edit1 = findViewById(R.id.edit1);
    }

    //override a onCreate() method
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call method to map variable.
        UIViews();

        // set onClickListener on all buttons
        btn_0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText()+ "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText()+ "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText()+ "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText()+ "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText()+ "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText()+ "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText()+ "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText()+ "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText()+ "9");
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(edit1.getText()+ ".");
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edit1.setText(null);
                value1 = Float.NaN;
                value2 = Float.NaN;
            }
        });



        btn_Add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(edit1 == null)
                    {
                        edit1.setText(" ");
                    }
                else
                    {
                       value1 = Float.parseFloat(edit1.getText()+ "");
                       add = true;
                       edit1.setText(null);
                    }

            }
        });


        btn_Sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                value1 = Float.parseFloat(edit1.getText()+ "");
                sub = true;
                edit1.setText(null);
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                value1 = Float.parseFloat(edit1.getText()+ "");
                mul = true;
                edit1.setText(null);
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                value1 = Float.parseFloat(edit1.getText()+ "");
                div = true;
                edit1.setText(null);
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                value2 = Float.parseFloat(edit1.getText() + "");

               //logic to do arithmetic operation.
               if(add == true)
               {
                   float result= value1+ value2;
                   edit1.setText(value1 +" + "+ value2 + " = " + result);
                   add = false;
               }

                if(sub == true)
                {
                    float result = value1 - value2;
                    edit1.setText(value1 +" - "+ value2 + " = " + result);
                    sub = false;
                }

                if(mul == true)
                {
                    float result = value1 * value2;
                    edit1.setText(value1 +" * "+ value2 + " = " + result);
                    mul = false;
                }

                if(div == true)
                {
                    if (value2 == 0)
                    {
                        edit1.setText(value1 +" / "+ value2 + " = " +"Error");
                    }
                    else
                    {
                        float result = value1 / value2;
                        edit1.setText(value1 +" / "+ value2 + " = " + result);
                    }

                    div = false;
                }

            }
        });

    }


}
