package com.example.student.myregistration;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

/**
 * Created by Student on 19-09-2016.
 */
class BackgroundActivity extends AsyncTask<String, Void ,String> {

    Context ctx;
    String msg;
    AlertDialog ad;

    BackgroundActivity(Context context) {
        ctx = context;
    }

    @Override
    protected String doInBackground(String... params) {
        String n = params[0];
        String u = params[1];
        String p = params[2];

        if (n.equals("123") && u.equals("123") && p.equals("123")) {
            msg = "Successfull";

        } else {
            msg = "Failed";
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        ad = new AlertDialog.Builder(ctx).create();
        ad.setTitle("STATUS");
    }

    @Override
    protected void onPostExecute(String s) {
        ad.setMessage(msg);
        ad.show();
        if (msg.equals("Successfull"))
        {
            Intent i = new Intent(ctx, Register.class);
        ctx.startActivity(i);
    }

        }


    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
