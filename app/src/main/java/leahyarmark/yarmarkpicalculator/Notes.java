package leahyarmark.yarmarkpicalculator;

/**
 * Created by student1 on 11/19/2015.
 */
public class Notes {

    /*
    using threads in an app is important because mobile devices have less processing power.
    google considers 1/10th of a second important
    because it changes the user experience

    without using a thread, if the number is not too long
    you see plain white until finished calculating
    and then the number and app name come up

    differences between app and desktop java:

    1. android: main thread is called UIThread
    google wants this main thread to do all the work for the UI
    ex: set up view, onClicks, interaction

    in order for UI to be really fast, can't do long operations from main
    because user is presented with unresponsive page

    if onClick calls a long running thread, unable to use device until thread is done

    RULE: long running operations must be done in thread
    RUEL: all views must be created from UIThread
    but, can only modify view from UI thread
    here, we were trying to set the text from the PiCalculationThread

    cannot return from the thread to the main and use the return value to set view
    because still have to wait for thread to finish

    instead, we use an AsyncTask.
    AsyncTask sits above threads. it does just what a thread does.
    can define doInBackground() method, which is like the run method of a thread
    it can also set things to do when the thread is done

    http://developer.android.com/reference/android/os/AsyncTask.html

    AsyncTask accepts 3 parameters
1. params - Long (similar to the thread taking in the number of iterations)
2. progress - Void (not important for now, is not always Void)
3. result - String (what we will return. actually a double, but return as string)

    DO NOT NEED THE THREAD CLASS IN ANDROID.

    to let the use know what you're up to in the iteration:
    change the progress to String, which will return the values of pi as we iterate
    create the override method onProgressUpdate

    (make the textview in the xml to display this as center in parent
    the iteration counter should go at align parent bottom)

    since the pi calculator only returns the end answer, temporarily copy the PiCalulator calulate() method in the AsyncTask.
    and add this line inside the for loop
                publishProgress(String.valueOf(pi));
    this is not the right way


     */
}
