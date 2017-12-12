package com.example.idros.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;

/**
 * Created by Bear on 12/5/2017.
 */

public class MyAlertDialog {

    AlertDialog.Builder objAlertDialog;

    public void HavespaceDialog(Context context, final MediaPlayer click){

        objAlertDialog = new AlertDialog.Builder(context);
        objAlertDialog.setIcon(R.drawable.x);
        objAlertDialog.setTitle("Error !!");
        objAlertDialog.setMessage("Have space "+"\n"+" Please enter your money ");
        objAlertDialog.setCancelable(false);
        objAlertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                click.start();
                dialogInterface.dismiss();
            }
        });objAlertDialog.show();
    }
    public void ShowAnswer(Context context, String strMoney, String strAnswer, String strUnit, final MediaPlayer click){
        objAlertDialog = new AlertDialog.Builder(context);
        objAlertDialog.setIcon(R.drawable.icon);
        objAlertDialog.setTitle("Exchange Money");
        objAlertDialog.setMessage("Your money is "+strMoney +" THB"+"\n"+"Exchange money to " + strAnswer +" "+strUnit);
        objAlertDialog.setCancelable(false);
        objAlertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                click.start();
                dialogInterface.dismiss();
            }
        });objAlertDialog.show();
    }
    public  void NoChooseEveryThing(Context context, final MediaPlayer click){
        objAlertDialog = new AlertDialog.Builder(context);
        objAlertDialog.setIcon(R.drawable.x);
        objAlertDialog.setTitle("Please Choose Answer ?");
        objAlertDialog.setMessage("Please Choose Answer on RadioButton");
        objAlertDialog.setCancelable(false);
        objAlertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                click.start();
                dialogInterface.dismiss();
            }
        });objAlertDialog.show();
    }
}
