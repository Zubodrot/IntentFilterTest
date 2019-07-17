package example.testprj.datetimeintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeActivity extends AppCompatActivity {

    TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        tvTime = findViewById(R.id.tv_time_placement);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String date = sdf.format(new Date(System.currentTimeMillis()));

        tvTime.setText(date);

    }
}
