package com.example.ishanpant.datepickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class DatePickAct extends AppCompatActivity {
 private DatePicker datePicker;
    private Button submitDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_pick);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        submitDate = (Button) findViewById(R.id.submitDate);
        submitDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String day = "Day = " + datePicker.getDayOfMonth();
                String month = "Month = " + (datePicker.getMonth() + 1);
                String year = "Year = " + datePicker.getYear();
                Toast.makeText(getApplicationContext(), day + "\n" + month + "\n" + year, Toast.LENGTH_LONG).show();
            }
        });
    }
}
