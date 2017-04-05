package me.syncify.libtestingproj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import me.syncify.lib1.MainActivity1;
import me.syncify.lib2.MainActivity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMe1(View view) {
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }
    public void clickMe2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
