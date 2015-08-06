package br.com.oztechnology.ViappLink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ActivityNotFoundException;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.Config;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;
import org.json.JSONObject;

public class ViappLink extends CordovaPlugin {

    public boolean execute(String action, CordovaArgs args, final CallbackContext callbackContext) throws JSONException {
        
        url = "market://details?id=br.com.bluepen.viapp";
        Intent intent = null;
        intent = new Intent(Intent.ACTION_VIEW);
        // Omitting the MIME type for file: URLs causes "No Activity found to handle Intent".
        // Adding the MIME type to http: URLs causes them to not be handled by the downloader.
        Uri uri = Uri.parse(url);
        if ("file".equals(uri.getScheme())) {
            intent.setDataAndType(uri, webView.getResourceApi().getMimeType(uri));
        } else {
            intent.setData(uri);
        }
        this.cordova.getActivity().startActivity(intent);
            
        return true;
    }
}
