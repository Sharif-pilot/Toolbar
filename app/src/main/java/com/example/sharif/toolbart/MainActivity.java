package com.example.sharif.toolbart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.cart:
                Toast.makeText(getApplicationContext(),"Cart",Toast.LENGTH_LONG).show();
                break;
            case R.id.search:
                Toast.makeText(getApplicationContext(),"Search",Toast.LENGTH_LONG).show();
                finish();
            case android.R.id.home:
                Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show();
                finish();
        }
        return true;
    }

}
