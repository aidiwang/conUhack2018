package simple.android.scheduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    Button create;
    Button view;
    Button invite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create=(Button)findViewById(R.id.create);
        view=(Button)findViewById(R.id.view);
        invite=(Button)findViewById(R.id.invite);
    }

    public void onClick(View v) {
        Button create = (Button) v;
        Intent i = new Intent(Main.this, Create.class);
        startActivity(i);

        Button view = (Button) v;
        Intent j = new Intent(Main.this, ViewEvents.class);
        startActivity(j);

        Button invite = (Button) v;
        Intent k = new Intent(Main.this, Invitations.class);
        startActivity(k);
    }
}
