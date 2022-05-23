package sg.edu.rp.c346.id21045028.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC346 = findViewById(R.id.tvModuleC346);
        tvC349 = findViewById(R.id.tvModuleC349);


        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C346");
                intent.putExtra("name","Android Programming");
                intent.putExtra("ven1", 'W');
                intent.putExtra("ven2", 66);
                intent.putExtra("ven3", 'M');
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 1);
                intent.putExtra("credit",4);
                startActivity(intent);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C349");
                intent.putExtra("name","iPad Programming");
                intent.putExtra("ven1", 'E');
                intent.putExtra("ven2", 62);
                intent.putExtra("ven3", 'K');
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 2);
                intent.putExtra("credit",2);
                startActivity(intent);
            }
        });


    }
}