package com.deepsam.browserintent;

import android.app.SearchManager;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void searchIt(View view){
        EditText editText=(EditText) findViewById(R.id.editText);

        Intent intent=new Intent(Intent.ACTION_WEB_SEARCH);
        String search = editText.getText().toString();
        intent.putExtra(SearchManager.QUERY,search);
        startActivity(intent);
    }
}
