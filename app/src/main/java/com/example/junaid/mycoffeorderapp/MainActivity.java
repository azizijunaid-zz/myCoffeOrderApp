package com.example.junaid.mycoffeorderapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity = 1;
    public void increment(View view){

        quantity ++;
        display(quantity);
    }

    public void decrement(View view){
        quantity--;
        if(quantity ==0){
            quantity = 1;
        }
        display(quantity);
    }


    private void display(int number){
        TextView quantityText = (TextView) findViewById(
                R.id.quantity_text);
        quantityText.setText("" + number);
    }

    private void displayPrice(int number){
        TextView priceText = (TextView) findViewById(
                R.id.price_text);
        priceText.setText("$ " + number);
    }


    public void submitOrder(View view){
        displayPrice(quantity * 25);
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
