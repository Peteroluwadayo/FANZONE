package com.example.fanzone.utils;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.fanzone.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.List;
import java.util.Objects;

public class Dialogs {

    private Dialogs() {
    }

    public static void messageDialog(Context myContext, String message){
        final Dialog myDialog = new Dialog(myContext);
        myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        myDialog.setContentView(R.layout.message_dialog_layout);

        TextView ok = myDialog.findViewById(R.id.tv_ok);
        TextView msgView = myDialog.findViewById(R.id.tv_message);
        TextView title = myDialog.findViewById(R.id.tv_title);
        msgView.setText(message);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myDialog.dismiss();

            }
        });


        myDialog.show();
        Objects.requireNonNull(myDialog.getWindow()).setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.getWindow().getAttributes();
        Window myWindow = myDialog.getWindow();
        myWindow.setGravity(Gravity.BOTTOM);
    }

    public static void logOutDialog(Context myContext){

       final BottomSheetDialog  myDialog = new BottomSheetDialog(myContext, R.style.BottomSheetDialogTheme);
        myDialog.setContentView(R.layout.logout_dialog);

        Button yesButton = myDialog.findViewById(R.id.btn_log_out_yes);
        Button cancelButton = myDialog.findViewById(R.id.btn_log_out_cancel);

        assert cancelButton != null;
        cancelButton.setOnClickListener(view -> {
            myDialog.dismiss();
        });

        assert yesButton != null;
        yesButton.setOnClickListener(view -> {

            SaveValues mySavePref = new SaveValues(myContext);
            mySavePref.clearPrefValue(AppPreferenceHelper.AUTH_TOKEN);
            mySavePref.clearPrefValue(AppPreferenceHelper.JOB_SEEKER_USER_TYPE_ID);
            mySavePref.clearPrefValue(AppPreferenceHelper.EMPLOYER_USER_TYPE_ID);

           // Tools.navigateToPage(myContext, LoginActivity.class);

            myDialog.dismiss();
        });

        myDialog.show();
    }



    public static String returnMessages(List<String> messages){
        String msg = "";
        for(String message : messages){
            msg += " " + message;
        }
        return msg;
    }


}
