package studio.android.statworld;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner myspinner = (Spinner) findViewById(R.id.spinner);
        Spinner2 myspinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner3 myspinner3 = (Spinner) findViewById(R.id.spinner3);
    }

}
