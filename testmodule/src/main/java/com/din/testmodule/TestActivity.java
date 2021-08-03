package com.din.testmodule;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.din.testmodule.dagger2test.person.Person;

import javax.inject.Inject;

public class TestActivity extends AppCompatActivity {

    @Inject
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

    }

    public void  initPer(){
        Toast.makeText(TestActivity.this,person.toString(),Toast.LENGTH_SHORT).show();
    }
}