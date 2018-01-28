package simple.android.scheduler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class CurrentEvent extends AppCompatActivity {
    EditText editTextEvent = (EditText) findViewById(R.id.editTextEvent);
    String inputText = editTextEvent.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_event);

        Toast.makeText(CurrentEvent.this, inputText, Toast.LENGTH_SHORT).show();


    }
}
