package edu.dtcc.sean.microwave;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    CountDownTimer timer; // global CountDownTimer

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remove status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /** Button OnClick listeners */
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

    @Override
    public void onClick(View v)
    {
        int id = v.getId();
        final TextView textView = (TextView) findViewById(R.id.timerDisplay);

        // create variable to hold TextView input
        String myTime = (textView.getText().toString());

        try
        {
            // Converts myTime variable to integer to be used for countdown
            final int countdownMillis = Integer.parseInt(myTime) * 1000;

            // Timer for checking if popcorn is burnt
            final int timerBurnt = Integer.parseInt(myTime);

            // Timer that counts down user's entered time in seconds
            timer = new CountDownTimer(countdownMillis, 1000)
            {
                public void onTick(long millisUntilFinished)
                {
                    // Counts down user time
                    int seconds = (int) ((millisUntilFinished));
                    textView.setText("" + seconds / 1000);
                }
                public void onFinish()
                {
                    // Set image when timer is finished
                    ImageView imageView = (ImageView) findViewById(R.id.popcornDisplay);
                    if (timerBurnt > 230)
                        // Burned popcorn
                        imageView.setImageResource(R.drawable.burntpopcorn);
                    else
                        // Properly cooked popcorn
                        imageView.setImageResource(R.drawable.poppedpopcorn);

                    // Time has ended, display a message
                    Toast.makeText(getApplicationContext(), "Food is ready!", Toast.LENGTH_LONG).show();
                    textView.setText("0");
                }
            };
        }
        catch (Exception e)
        {
            // Do nothing
        }

        /** Button Presses */
        switch (id)
        {
            case R.id.button1:
                if (textView.getText().equals("0"))
                    textView.setText("1");
                else
                    textView.append("1");
                //textView.setText("1");
                break;
            case R.id.button2:
                if (textView.getText().equals("0"))
                    textView.setText("2");
                else
                    textView.append("2");
                break;
            case R.id.button3:
                if (textView.getText().equals("0"))
                    textView.setText("3");
                else
                    textView.append("3");
                break;
            case R.id.button4:
                if (textView.getText().equals("0"))
                    textView.setText("4");
                else
                    textView.append("4");
                break;
            case R.id.button5:
                if (textView.getText().equals("0"))
                    textView.setText("5");
                else
                    textView.append("5");
                break;
            case R.id.button6:
                if (textView.getText().equals("0"))
                    textView.setText("6");
                else
                    textView.append("6");
                break;
            case R.id.button7:
                if (textView.getText().equals("0"))
                    textView.setText("7");
                else
                    textView.append("7");
                break;
            case R.id.button8:
                if (textView.getText().equals("0"))
                    textView.setText("8");
                else
                    textView.append("8");
                break;
            case R.id.button9:
                if (textView.getText().equals("0"))
                    textView.setText("9");
                else
                    textView.append("9");
                break;
            case R.id.button10:
                if (textView.getText().equals("0"))
                    textView.setText("0");
                else
                    textView.append("0");
                break;
            case R.id.buttonStart:
                timer.start(); // DO COUNTDOWN
                break;
            case R.id.buttonStop:
                /** NOT IMPLEMENTED */
                timer.cancel(); // Doesn't work?
                textView.setText("");
        } // end switch statement
    }
}