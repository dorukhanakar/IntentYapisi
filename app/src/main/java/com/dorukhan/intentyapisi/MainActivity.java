package com.dorukhan.intentyapisi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    private EditText et1, et2;

    private TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void afterTextChanged(Editable editable) {

            checkFieldsForEmptyValues();
        }
    };

    void checkFieldsForEmptyValues() {
        Button b = (Button) findViewById(R.id.button1);

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();

        if (s1.equals("") || s2.equals("")) {
            b.setEnabled(false);
        } else {
            b.setEnabled(true);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editText2);
        et2 = (EditText) findViewById(R.id.editText3);


        et1.addTextChangedListener(mTextWatcher);
        et2.addTextChangedListener(mTextWatcher);


        checkFieldsForEmptyValues();

    }

    public void OnClick(View v) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("username", et1.getText().toString());
        startActivity(intent);

    }

}
