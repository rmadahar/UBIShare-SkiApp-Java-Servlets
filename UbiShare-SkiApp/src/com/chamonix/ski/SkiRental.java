/** 
 * This is the SkiLiftDeal class which is called from the 
 * Menu class when the user clicks on the Ski Lift Deal button
 * which then starts a new activity.
 * */

package com.chamonix.ski;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


public class SkiRental extends Activity {
	
	WebView mWebView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
   
        // Adds Progrss bar Support
        this.getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.rentalprice); 
        getWindow().setFeatureInt(	Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON); 
        // Get Web view
        mWebView = (WebView) findViewById( R.id.webview ); 
        mWebView.getSettings().setJavaScriptEnabled(true);   
      
        // Load URL
        mWebView.loadUrl("http://192.168.10.1/UbiShare/Form.jsp");
        
        
        // Sets the Chrome Client, and defines the onProgressChanged
        // This makes the Progress bar be updated.
        final Activity MyActivity = this;
        mWebView.setWebChromeClient(new WebChromeClient() {
        	
        	/**
			 * OnProgressChanged makes the bar disapear 
			 * and then shows the activity 
			 * 
			 * @param WebView view, int progress
			 */  
            public void onProgressChanged(WebView view, int progress)   
            {
            	//Make the bar disappear after URL is loaded, and changes string to Loading...
            	MyActivity.setTitle("Loading...");
            	MyActivity.setProgress(progress * 100); //Make the bar disappear after URL is loaded

            	// Return the app name after finish loading
                if(progress == 100)
                	MyActivity.setTitle(R.string.app_name);
              }
            });

    }//End of Method onCreate      
    }

