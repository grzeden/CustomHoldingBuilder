package edu.grzegorzewski.customholdingslistbuilder;


import android.content.Context;
import android.location.Address;
import android.location.Geocoder;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * Class description.
 *
 * @author Dennis Grzegorzewski.
 * @version 1.0, 11/20/2016
 */

public abstract class ThisState extends Context {

    String getThisState(double latitude, double longitude) throws IOException {
        Geocoder geocoder = new Geocoder(this,Locale.getDefault());
        // Here 1 represent max location result to return
        List<Address> addressList = geocoder.getFromLocation(latitude, longitude, 1);
        // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
        return addressList.get(0).getAdminArea();
    }
}