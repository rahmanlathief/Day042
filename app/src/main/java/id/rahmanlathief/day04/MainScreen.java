package id.rahmanlathief.day04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainScreen extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        final EditText uname = (EditText) findViewById(R.id.username);
        final EditText pass = (EditText) findViewById(R.id.password);
        Button btn = (Button) findViewById(R.id.login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreen.this, secondScreen.class);
                intent.putExtra("username", uname.getText().toString());
                intent.putExtra("password", pass.getText().toString());
                startActivity(intent);
            }
        });

    }

}
