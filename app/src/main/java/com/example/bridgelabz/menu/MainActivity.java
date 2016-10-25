package com.example.bridgelabz.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu23,menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.Item1:
Toast.makeText(MainActivity.this,"Item 1 is selected",Toast.LENGTH_SHORT).show();
return true;
            case R.id.Item2:
                Toast.makeText(MainActivity.this, "Item 2 is selected", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.Item3:
                Toast.makeText(MainActivity.this," Item 3 is selected",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.Item4:
                Toast.makeText(MainActivity.this," Item 4is selected",Toast.LENGTH_SHORT).show();
return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
