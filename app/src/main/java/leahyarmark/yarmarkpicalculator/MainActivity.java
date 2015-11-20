package leahyarmark.yarmarkpicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView textView = (TextView) findViewById(R.id.calculate);
        //textView.setText("Calculating ...");

        TextView textView = (TextView) findViewById(R.id.pi);


        PiCalculationAsyncTask task = new PiCalculationAsyncTask(textView);
        task.execute();

        //this is the way we did it in java desktop.
        //does not work for android
        //PiCalculationThread thread = new PiCalculationThread(textView);
        //thread.start();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(leahyarmark.yarmarkpicalculator.R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == leahyarmark.yarmarkpicalculator.R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
