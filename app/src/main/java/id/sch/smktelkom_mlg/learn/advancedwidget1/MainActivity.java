package id.sch.smktelkom_mlg.learn.advancedwidget1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llMain = (LinearLayout) findViewById(R.id.linearLayoutMain);
        EditText etNama = new EditText(this);
        llMain.addView(etNama);
    }
}
