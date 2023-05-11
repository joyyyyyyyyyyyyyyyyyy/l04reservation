package sg.edu.rp.c346.id22022096.l04reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText mobile;
    EditText paxno;
    DatePicker datepicker;
    TimePicker timepicker;
    ToggleButton smoking;
    Button submit;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editname);
        mobile = findViewById(R.id.editmobile);
        paxno = findViewById(R.id.editpaxno);
        datepicker = findViewById(R.id.datepicker);
        timepicker = findViewById(R.id.timepicker);
        smoking = findViewById(R.id.toggleButton);
        submit = findViewById(R.id.btnsubmit);
        reset = findViewById(R.id.btnreset);
        
        submit.setOnClickListener(v -> {
            String msg = String.format("You have successfully booked a reservation!\n Name; %s\n Contact Number: %s\n " +
                    "Total Pax No: %s\n Seating Area: %s\n Date: %s\n Time %s",
                    name, mobile, paxno, smoking, datepicker, timepicker);
            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
        });

        reset.setOnClickListener(view -> {

            name.getText().clear();
            mobile.getText().clear();
            paxno.getText().clear();

            datepicker.updateDate(2020,6,1);
            timepicker.setHour(7);
            timepicker.setMinute(30);

        });



    }
}