package simple.android.scheduler;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.google.gdata.client.*;
//import com.google.gdata.client.contacts.*;
//import com.google.gdata.data.*;
//import com.google.gdata.data.contacts.*;
//import com.google.gdata.data.extensions.*;
//import com.google.gdata.util.*;
//import java.io.IOException;
//import java.net.URL;

public class InviteContacts extends AppCompatActivity {
//    // ...
//    ContactsService myService = new ContactsService("The Scheduler");
//    // Authorize the service object.
//// ...

    private Button loadContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_contacts);

        loadContacts = (Button) findViewById(R.id.loadContacts);
        loadContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadContacts();
//                View.OnClickListener);
            }
        });


    }

    private void loadContacts(){
        StringBuilder builder =  new StringBuilder();
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null
        , null, null);

        if (cursor.getCount()>0) {
            String id = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
            String name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
        };
    }
}
