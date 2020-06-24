package io.github.mortuzahossain.allbanglanewspapers.utils;
/*
 * Created by mortuza on 25/6/20 | 12:08 AM for All Bangla Newspapers
 * Junior Programmer
 * Flora Systems
 * Email : mortuzahossain1997@gmail.com
 * Phone : +8801719200957
 * */


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.StrictMode;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import java.io.File;


public class SharingUtils {

    public static void sendInformation(Context context, String chooserTitle, String subject, String message) {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_TEXT, message);
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        try {
            context.startActivity(Intent.createChooser(sharingIntent, chooserTitle));
        } catch (Exception e) {
            Toast.makeText(context, "No sharing media found. Please install one and try again letter.", Toast.LENGTH_LONG).show();
        }
    }

    public static void shareAPK(Context context) {

        try {
            ApplicationInfo app = context.getApplicationContext().getApplicationInfo();
            String filePath = app.sourceDir;
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("*/*");
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filePath)));
            context.startActivity(Intent.createChooser(intent, "Share app via"));
        } catch (Exception e) {
            Toast.makeText(context, "No sharing media found. Please install one and try again letter.", Toast.LENGTH_LONG).show();
        }
    }

    private static void openAppInPlayStore(Context context) {
        try {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + context.getPackageName() + "&hl=en_US")));
        } catch (android.content.ActivityNotFoundException anfe) {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + context.getPackageName() + "&hl=en_US")));
        }
    }

    public static void showRateDialog(final Context context, String title, String message, int drawable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setIcon(drawable)
                .setPositiveButton("RATE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        openAppInPlayStore(context);
                    }
                })
                .setNegativeButton("CANCEL", null);
        builder.show();
    }


    public static void showMoreApps(Context context) {
        try {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://developer?id=Mortuza+Hossain")));
        } catch (android.content.ActivityNotFoundException anfe) {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Mortuza+Hossain")));
        }
    }
}