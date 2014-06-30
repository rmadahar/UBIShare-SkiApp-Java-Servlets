/** 
 * This is the Menu class which sets the layout of the buttons
 * Each data type can then be called within each button.
 * */

package com.chamonix.ski;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Store weatherinfo.xml in button, set OnClickListener
		Button Weather = (Button) findViewById(R.id.weatherinfo);
		Weather.setOnClickListener(new OnClickListener() {

			/**
			 * Implemented method - onClick. When user clicks start
			 * Weather.class Starts activity
			 * 
			 * @param View v
			 */
			public void onClick(View v) {
				Intent WeatherIntent = new Intent(Menu.this, Weather.class);
				startActivity(WeatherIntent);
			}
		});

		// Store skiliftprice.xml in button, set OnClickListener
		Button SkiLift = (Button) findViewById(R.id.skiliftprice);
		SkiLift.setOnClickListener(new OnClickListener() {

			/**
			 * Implemented method - onClick. When user clicks start
			 * SkiLiftDeal.class Starts activity
			 * 
			 * @param View v
			 */
			public void onClick(View v) {
				Intent SkiLiftIntent = new Intent(Menu.this, SkiLiftDeal.class);
				startActivity(SkiLiftIntent);
			}
		});

		// Store rentalprice.xml in button, set OnClickListener
		Button SkiRent = (Button) findViewById(R.id.rentalprice);
		SkiRent.setOnClickListener(new OnClickListener() {

			/**
			 * Implemented method - onClick. When user clicks start
			 * SkiRental.class Starts activity
			 * 
			 * @param View v
			 */
			public void onClick(View v) {
				Intent RentIntent = new Intent(Menu.this, SkiRental.class);
				startActivity(RentIntent);
			}
		});

		// Store map.xml in button, set OnClickListener
		Button Map = (Button) findViewById(R.id.map);
		Map.setOnClickListener(new OnClickListener() {

			/**
			 * Implemented method - onClick. When user clicks start Map.class
			 * Starts activity
			 * 
			 * @param View v
			 */
			public void onClick(View v) {
				Intent MapIntent = new Intent(Menu.this, Map.class);
				startActivity(MapIntent);
			}
		});
	}
}