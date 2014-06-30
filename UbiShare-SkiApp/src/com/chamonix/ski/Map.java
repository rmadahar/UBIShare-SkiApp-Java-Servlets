/** 
 * This is the Map class which holds the data for the map. 
 * The map is created using Img view. The URL is from 
 * Google Static Map service which creates your map based 
 * on URL parameters sent through a standard HTTP request 
 * and returns the map as an image*/

package com.chamonix.ski;

import java.io.InputStream;
import java.net.URL;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class Map extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// calling setContentView()
		setContentView(R.layout.map);// map.xml layout

		ImageView imgView = (ImageView) findViewById(R.id.ImageView01);// sets layout from map.xml
																		
		Drawable drawable = LoadImageFromWeb("http://maps.google.com"
				+ "/maps/api/staticmap?zoom=12&size=512x1000&maptype=roadmap&markers=color:blu"
				+ "e|label:S|45.882122,6.883278&markers=color:green|label:G|45.905539,6.953316&markers=color:red|color:"
				+ "red|label:C|45.922737,6.874695&sensor=false");// URL
		imgView.setImageDrawable(drawable);// object set in
	}

	/**
	 * Method LoadImageFromWeb gets the content from the URL and puts it into an
	 * InputStream. The is varaiable holds the content and stores this into the
	 * varaible d, the content is returned.
	 * 
	 * @param String url
	 */
	private Drawable LoadImageFromWeb(String url) {
		try {

			InputStream is = (InputStream) new URL(url).getContent();// gets content
																		
			Drawable d = Drawable.createFromStream(is, "src name");// stores content from stream
							
			return d;// returns content
		} catch (Exception e) {
			System.out.println("Exc=" + e);// catches exceptions
			return null;
		}
	}

}
