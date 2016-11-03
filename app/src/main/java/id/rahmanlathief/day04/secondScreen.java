package id.rahmanlathief.day04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Intent i = getIntent();
        String username = i.getStringExtra("username");
        String userpass = i.getStringExtra("password");
        TextView res = (TextView) findViewById(R.id.resultShow);

        res.setText(username+","+userpass);

    }
}
