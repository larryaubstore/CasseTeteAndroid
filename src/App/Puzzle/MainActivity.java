package App.Puzzle;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


				WebView mainWebView = (WebView) findViewById(R.id.mainWebView);
				WebSettings webSettings = mainWebView.getSettings();
				webSettings.setJavaScriptEnabled(true);
				webSettings.setRenderPriority(RenderPriority.HIGH);
				webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);


        mainWebView.loadUrl("file:///android_asset/index.php.html");

    }
}
