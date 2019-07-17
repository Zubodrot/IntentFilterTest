package example.testprj.datetimeintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button buttonDate;
    Button buttonTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDate = findViewById(R.id.b_date);
        buttonTime = findViewById(R.id.b_time);


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.b_date:
                        Intent itDate = new Intent("android.intent.activity.showdate");
                        startActivity(itDate);
                        break;
                    case R.id.b_time:
                        Intent itTime = new Intent("android.intent.activity.showtime");
                        startActivity(itTime);
                        break;
                }
            }
        };

        buttonTime.setOnClickListener(onClickListener);
        buttonDate.setOnClickListener(onClickListener);


    }
}
