package com.mcs.easysocial;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;
/**
 * Created by kaushal on 10/12/16.
 */
public class EasyViewMod {

    public static Snackbar snackbar(View view, String string, int LENGTH) {
        Snackbar sb = Snackbar.make(view, string, LENGTH);sb.show();
        return sb;
    }

    public static Toast toast(Context context, String string, int LENGTH){
        Toast to = Toast.makeText(context, string, LENGTH);to.show();
        return to;
    }

    public static ProgressDialog progressDialog(final Context context, int style, String message, boolean setIndeterminate, boolean setCancelable){

        ProgressDialog pd = new ProgressDialog(context);

            pd.setProgressStyle(style);
            pd.setMessage(message);

            pd.setIndeterminate(setIndeterminate);
            pd.setCancelable(setCancelable);

        return pd;
    }
}