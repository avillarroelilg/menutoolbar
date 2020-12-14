package com.example.meutoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Toolbar mytoolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytoolbar=findViewById(R.id.my_toolbar);
        setSupportActionBar(mytoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_shop:
                Toast.makeText(this, "item shop selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_photo:
                Toast.makeText(this, "item photo selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_setings:
                Toast.makeText(this, "item setings selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_profile:
                Toast.makeText(this, "item profile selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this, "default selection", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);

        }
        //return super.onOptionsItemSelected(item);
    }
}