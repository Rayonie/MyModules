package sg.edu.rp.c346.id21045028.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    TextView tvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.tvCode);
        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        tvCode.setText("Module Code: " + code);

        tvName = findViewById(R.id.tvName);
        String name = intentReceived.getStringExtra("name");
        tvName.setText("Module Name: " + name);

        tvYear = findViewById(R.id.tvYear);
        int year = intentReceived.getIntExtra("year", 2000);
        tvYear.setText("Academic Year: " + year);

        tvSem = findViewById(R.id.tvSem);
        int sem = intentReceived.getIntExtra("sem", 2000);
        tvSem.setText("Semester: " + sem);

        tvCredit = findViewById(R.id.tvCredit);
        int credit = intentReceived.getIntExtra("credit", 2000);
        tvCredit.setText("Module Credit: " + credit);

        tvVenue = findViewById(R.id.tvVenue);
        char ven1 = intentReceived.getCharExtra("ven1", 'Z');
        int ven2 = intentReceived.getIntExtra("ven2", 99);
        char ven3 = intentReceived.getCharExtra("ven3", 'Z');
        tvVenue.setText("Venue: " + ven1 + ven2 + ven3 );

        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}