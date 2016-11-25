package edu.grzegorzewski.customholdingslistbuilder;
/* ITMD-555 Android App Development
 * Dennis Grzegorzewski
 * Christopher Montufar
 * Final Project
 * Due: 12/05/2016
 */
import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

import java.io.IOException;

/**
 * Class description.
 *
 * @author Dennis Grzegorzewski.
 * @version 1.0, 11/23/2016
 */
public class GetLocationActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Acquire a reference to the system Location Manager
        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        // create a listener for location updates
        LocationListener locationListener = new LocationListener() {
            // Called when a new location is found by the network location provider.
            public void onLocationChanged(Location location) {
                //
                ThisState thisState = new ThisState() {
                };
                //
                try {
                    //
                    thisState.getThisState(location.getLatitude(), location.getLongitude());
                } // end try
                //
                catch (IOException e) {
                    e.printStackTrace();
                } // end catch
            } // end method onLocationChanged

            /**
             * Required onStatusChanged method implementation of abstract class LocationListener
             *
             * @param provider
             * @param status
             * @param extras
             */
            public void onStatusChanged(String provider, int status, Bundle extras) {
            }

            /**
             * Required onProviderEnabled method implementation of abstract class LocationListener
             *
             * @param provider
             */
            public void onProviderEnabled(String provider) {
            }

            /**
             * Required onProviderDisabled method implementation of abstract class LocationListener
             *
             * @param provider
             */
            public void onProviderDisabled(String provider) {
            }
        };

        // Register the listener with the Location Manager to receive location updates

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);
    }
}
