package edu.dtcc.sean.microwave;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(this);

        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(this);

        Button buttonStop = (Button) findViewById(R.id.buttonStop);
        buttonStop.setOnClickListener(this);
    }

    public void button1(View view)
    {
        TextView textView = (TextView) findViewById(R.id.timerDisplay);
    }

    @Override
    public void onClick(View v)
    {
        int id = v.getId();
        TextView textView = (TextView) findViewById(R.id.timerDisplay);

        //String time = textView.getText().toString();
        //long counter = Long.valueOf(textView.getText().toString());

        switch (id)
        {
            case R.id.button1:
                //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //startActivity(intent);
                textView.append("1");
                break;
            case R.id.button2:
                textView.append("2");
                break;
            case R.id.button3:
                textView.append("3");
                break;
            case R.id.button4:
                textView.append("4");
                break;
            case R.id.button5:
                textView.append("5");
                break;
            case R.id.button6:
                textView.append("6");
                break;
            case R.id.button7:
                textView.append("7");
                break;
            case R.id.button8:
                textView.append("8");
                break;
            case R.id.button9:
                textView.append("9");
                break;
            case R.id.button10:
                textView.append("9");
                break;
            case R.id.buttonStart:
                // DO COUNTDOWN
                /**CountDownTimer Count = new CountDownTimer(10000, 1000)
                {
                    public void onTick(long millisUntilFinished)
                    {
                        int seconds = (int) ((millisUntilFinished / 1000));
                        textView.setText("seconds " + seconds);
                    }
                    public void onFinish()
                    {
                        textView.setText("DONE");
                    }
                };
                Count.start();
                break;
                 */
            case R.id.buttonStop:
                // STOP COUNTDOWN
                textView.setText("");
                break;
        } // end switch statement
    }
}
