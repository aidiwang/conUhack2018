package simple.android.scheduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Create extends AppCompatActivity {
    Button cancelButton;
//    EditText editTextEvent = (EditText)findViewById(R.id.editTextEvent);
//    String inputText = editTextEvent.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        cancelButton=(Button)findViewById(R.id.cancelButton);

    }

    public void onClickCancel(View v) {
        Button cancelButton = (Button) v;
        Intent i = new Intent(Create.this, Main.class);
        startActivity(i);
    }

    public void onClickCreate(View v) {
        Button createButton = (Button) v;
        Intent i = new Intent(Create.this, InviteContacts.class);
        startActivity(i);
    }


}
