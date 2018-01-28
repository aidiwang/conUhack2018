package simple.android.scheduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main extends AppCompatActivity {
    Button create;
    Button view;
    Button invite;
    ImageButton settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create=(Button)findViewById(R.id.create);
        view=(Button)findViewById(R.id.view);
        invite=(Button)findViewById(R.id.invite);
        settings=(ImageButton)findViewById(R.id.settings);
    }

    public void onClick(View v) {
        Button create = (Button) v;
        Intent i = new Intent(Main.this, InviteContacts.class);
        startActivity(i);
    }

    public void onClick2(View v) {
        Button view = (Button) v;
        Intent i = new Intent(Main.this, ViewEvents.class);
        startActivity(i);

    }

    public void onClick3(View v) {
        Button invite = (Button) v;
        Intent i = new Intent(Main.this, Invitations.class);
        startActivity(i);
    }

    public void onClickSettings(View v) {
        ImageButton settings = (ImageButton) v;
        Intent i = new Intent(Main.this, Settings.class);
        startActivity(i);
    }

}
