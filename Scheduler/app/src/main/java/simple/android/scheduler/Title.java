package simple.android.scheduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Title extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        button=(Button)findViewById(R.id.button);
        //button.setOnClickListener(new View.OnClickListener() {
            /*@Override
            public void onClick(View v) {
                Button button = (Button) v;
                Intent i = new Intent(Title.this, Login.class);
                startActivity(i);
            }*/
        //});
    }

    public void onClick(View v) {
        Button button = (Button) v;
        Intent i = new Intent(Title.this, Login.class);
        startActivity(i);
    }
}
