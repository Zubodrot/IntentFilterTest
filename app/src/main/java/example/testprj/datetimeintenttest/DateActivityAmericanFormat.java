package example.testprj.datetimeintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActivityAmericanFormat extends AppCompatActivity {

    TextView tvDate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.date_activity_na);
        setContentView(R.layout.activity_date_american_format);

        tvDate2 = findViewById(R.id.tv_date2_placement);

        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");
        String date = sdf.format(new Date(System.currentTimeMillis()));

        tvDate2.setText(date);
    }
}
