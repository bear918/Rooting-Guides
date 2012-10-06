package root.world.guide.free.remzi.cavdar.open.remzicavdar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;
import org.apache.cordova.*;

public class MainActivity extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about: super.loadUrl("file:///android_asset/www/about.html");
        }
        switch (item.getItemId()) {
            case R.id.close: finish ();
        }
        switch (item.getItemId()) {
            case R.id.index: super.loadUrl("file:///android_asset/www/index.html");
        }
        switch (item.getItemId()) {
            case R.id.refresh: Toast.makeText(this, "activity has been restarted", Toast.LENGTH_SHORT).show();
            break;
        }
        return true;
    }
}