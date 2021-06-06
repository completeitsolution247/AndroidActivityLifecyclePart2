package com.example.androidactivitypartii;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

//    Dialog dialog;
//    Button dialogButton;

//    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("------- onCreate method called -------");

        button = findViewById(R.id.button);

//        dialog = new Dialog(this);
//        dialog.setContentView(R.layout.dialog_layout);
//        dialog.setTitle("Welcome");

//        dialogButton = dialog.findViewById(R.id.button2);
//        dialogButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                dialog.dismiss();
//            }
//        });


//        builder = new AlertDialog.Builder(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                builder.setTitle(getResources().getString(R.string.string_alert_title))
//                .setMessage(getResources().getString(R.string.string_alert_message))
//                .setCancelable(false)
//                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.cancel();
//                    }
//                });
//
//                AlertDialog alert = builder.create();
//                alert.show();

//                dialog.show();

                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("------- onStart method called -------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("------- onResume method called -------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("------- onPause method called -------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("------- onStop method called -------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("------- onRestart method called -------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("------- onDestroy method called -------");
    }

}