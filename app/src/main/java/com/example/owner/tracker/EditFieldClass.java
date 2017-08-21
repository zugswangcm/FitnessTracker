package com.example.owner.tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditFieldClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracker_layout);
    }
    public void saveButtonClicked(View v) {
        String messageText = ((EditText)findViewById(R.id.reps)).getText().toString();
        //prevent user from entering nothing
        if(messageText.equals("")) {

        }
        else {
            Intent intent = new Intent();
            intent.putExtra(Intent_Constants.INTENT_MESSAGE_FIELD, messageText);
            setResult(Intent_Constants.INTENT_RESULT_CODE, intent);
            finish();
        }
    }
}
