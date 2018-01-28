package simple.android.scheduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Settings extends AppCompatActivity {
    Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        logoutButton=(Button)findViewById(R.id.logoutButton);
    }

    public void onClickLogOut(View v) {
        Button logoutButton = (Button) v;
        Intent i = new Intent(Settings.this, Title.class);
        startActivity(i);
    }
}