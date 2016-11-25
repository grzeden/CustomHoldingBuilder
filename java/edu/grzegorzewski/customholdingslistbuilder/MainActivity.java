package edu.grzegorzewski.customholdingslistbuilder;
/* ITMD-555 Android App Development
 * Dennis Grzegorzewski
 * Christopher Montufar
 * Final Project
 * Due: 12/05/2016
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * TODO Class description.
 *
 * @author Dennis Grzegorzewski.
 * @version 1.0, 11/23/2016
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Executes when activity starts.
     *
     * @param savedInstanceState - the saved activity state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up action for Start Button.
        setupStartButton();
        // Set up action for Continue Button.
        setupContinueButton();

    } // end method onCreate

    private void setupStartButton() {

        // Get button resource.
        Button button = (Button) findViewById(R.id.button_start);
        // Create button listener.
        button.setOnClickListener( new View.OnClickListener() {

            /**
             * Execute on start  button click.
             *
             * @param view - the view to set OnClickListener
             */
            @Override
            public void onClick(View view) {


                // Create  intent for GetLocationActivity.
                Intent intent = new Intent(MainActivity.this, GetLocationActivity.class);
                // Set intent extra parameter to timer delay.
                //intent.putExtra("timer_delay", timerDelay);
                // Execute intent.
                startActivity(intent);

            } // end method onClick.

        });

    } // end method setupStartButton.

    private void setupContinueButton() {


        // Get button resource.
        Button button = (Button) findViewById(R.id.button_continue);
        // Create button listener.
        button.setOnClickListener( new View.OnClickListener() {

            /**
             * Execute on continue button click.
             *
             * @param view - the view to set OnClickListener
             */
            @Override
            public void onClick(View view) {


                // Create  intent for GetLocationActivity.
                Intent intent = new Intent(MainActivity.this, GetLocationActivity.class);
                // Set intent extra parameter to timer delay.
                //intent.putExtra("timer_delay", timerDelay);
                // Execute intent.
                startActivity(intent);

            } // end method onClick.

        });

    } // end method setupContinueButton.
}
