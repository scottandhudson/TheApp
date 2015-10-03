package com.example.parker.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {


    ListView list;
    String[] itemname ={
            "Facebook",
            "Instagram",
            "Twitter",
            "LinkedIn",
            "Google+"
    };

    Integer[] imgid={
            R.drawable.facebook,
            R.drawable.google,
            R.drawable.instagram,
            R.drawable.linkedin,
            R.drawable.twitter
    };


    ArrayList<String> listItems = new ArrayList<String>();
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView profilePicture = (ImageView)findViewById(R.id.imageView);



        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.MyListView);
        list.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
