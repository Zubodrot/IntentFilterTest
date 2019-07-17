package example.testprj.datetimeintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActivity extends AppCompatActivity {

    TextView tvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.date_activity_eu);
        setContentView(R.layout.activity_date);


        tvDate = findViewById(R.id.tv_date_placement);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String date = sdf.format(new Date(System.currentTimeMillis()));

        tvDate.setText(date);
    }


}
