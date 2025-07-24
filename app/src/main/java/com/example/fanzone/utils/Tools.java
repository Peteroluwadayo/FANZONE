package com.example.fanzone.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

public class Tools {

    private Tools() {
    }


    public static boolean checkIsEditTextNull(EditText... editTexts) {
        boolean isNotNull = editTexts.length > 0;
        for (EditText editText : editTexts) {
            if (android.text.TextUtils.isEmpty(editText.getText().toString())) {
                isNotNull = false;
                break;
            }
        }
        return isNotNull;
    }

    public static void navigateToPage(Context context, Class<?> targetActivityClass) {
        Intent intent = new Intent(context, targetActivityClass);
        context.startActivity(intent);
    }

    String mTitle;

    public static void alertDialog(Context context, String title, String message) {
        // Create the object of AlertDialog Builder class
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        // Set the message show for the Alert time
        builder.setMessage(message);

        // Set Alert Title
        builder.setTitle(title);

        // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
        builder.setCancelable(true);

        // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
        builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
            // When the user click yes button then app will close
            dialog.dismiss();
        });

        // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
        builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
            // If user click no then dialog box is canceled.
            dialog.cancel();
        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();
        // Show the Alert Dialog box
        alertDialog.show();
    }


    public static void openNotificationDialog(@NonNull FragmentActivity activity, String title, String message) {
        Bundle args = new Bundle();
        args.putString("ARG_TITLE", title);
        args.putString("ARG_MESSAGE", message);
        NotificationSuccessErrorDialog dialog =
                NotificationSuccessErrorDialog.newInstance(title, message);
        dialog.setCancelable(true);
        dialog.setArguments(args);
        dialog.show(activity.getSupportFragmentManager(),
                "SuccessErrorDialog");
    }







}


