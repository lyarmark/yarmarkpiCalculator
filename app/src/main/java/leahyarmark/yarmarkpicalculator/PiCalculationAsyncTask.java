package leahyarmark.yarmarkpicalculator;

import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by student1 on 11/19/2015.
 */
public class PiCalculationAsyncTask extends AsyncTask<Long, String, String> {

    //asynchronous - not at the same time
    //AsyncTask is an abstract class, which will be discussed in 2 weeks

    private TextView textView;

    public PiCalculationAsyncTask(TextView textView) {
        this.textView = textView;
    }

    //the methods below were created using code override
    //the return and parameter types were generated based the the classes parameters in the header
    //this is like the run method of a thread
    @Override
    protected String doInBackground(Long... params) {
       // PiCalculator calc = new PiCalculator();
       // double pi = calc.calculate(100000000L);
        double pi = calculate(100000000L);
        return String.valueOf(pi);
    }

    //this is what to do when the Async task is done
    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        //need to create a constructor to have access to the textView in MainActivity
        //there are other ways to access the main thread variables
        textView.setText(result);
    }

    //the ... in the parameter shows that this is an array
    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        textView.setText(values[0]);
    }


    public double calculate(long l) {

        double pi = 0;
        double numerator = 4;
        double denominator = 1;
        boolean positive = true;

        for (int i = 0; i < l; i++) {

            if (positive) {
                pi += (numerator / denominator);
            }

            else {
                pi -= (numerator / denominator);
            }

            denominator +=2;
            // change boolean
            positive = !positive;

            publishProgress(String.valueOf(pi));
        }
        return pi;

    }
}
