package com.example.fanzone.utils;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.fanzone.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import org.jetbrains.annotations.NotNull;

;

public class NotificationSuccessErrorDialog extends BottomSheetDialogFragment implements View.OnClickListener{

        private TextView tvProceed, tvCancel, tvTitle, tvMessage;

        private OnSelectMenuItemListener onSelectMenuItemListener;

        public interface OnSelectMenuItemListener{
            void onProceed();
            void onCancel();
        }

        public static NotificationSuccessErrorDialog newInstance(String title, String message) {
            final NotificationSuccessErrorDialog notificationSuccessErrorDialog = new NotificationSuccessErrorDialog();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_TITLE", title);
            bundle.putString("ARG_MESSAGE", message);
           notificationSuccessErrorDialog.setArguments(bundle);
            return notificationSuccessErrorDialog;
        }

        @Override
        public void onAttach(@NotNull Context context){
            super.onAttach(context);
            try{
                onSelectMenuItemListener = (OnSelectMenuItemListener)context;
            }catch (ClassCastException ce){
                throw new ClassCastException("OnSelectMenuItemListener must be implemented in "+context);
            }
        }


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setStyle(BottomSheetDialogFragment.STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);
        }

        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.dialog_notification, container, false);
            initComponents(view);
            bindClickListener();
            return view;
        }

        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
            dialog.setOnShowListener(dialog1 -> {
                BottomSheetDialog d = (BottomSheetDialog) dialog1;
                FrameLayout bottomSheet = d.findViewById(com.google.android.material.R.id.design_bottom_sheet);
                if (bottomSheet != null) {
                    BottomSheetBehavior.from(bottomSheet).setState(BottomSheetBehavior.STATE_EXPANDED);
                }
            });

            return dialog;
        }

        private void initComponents(View view) {
            tvTitle = view.findViewById(R.id.tv_title);
            tvMessage = view.findViewById(R.id.tv_message);
            tvCancel = view.findViewById(R.id.tv_cancel);
            tvProceed = view.findViewById(R.id.tv_proceed);

            String msg = null;
            if (getArguments() != null) {
                msg = getArguments().getString("ARG_MESSAGE");
                final String mTitle = getArguments().getString("ARG_TITLE");

                tvTitle.setText(mTitle);
                tvMessage.setText(msg);
            }
        }

        private void bindClickListener(){
            tvProceed.setOnClickListener(this);
            tvCancel.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (onSelectMenuItemListener == null){
                Log.e("BottomDialog3Options", "OnSelectMenuItemListener has not been implemented");
                return;
            }
            if (v == tvCancel){
                onSelectMenuItemListener.onCancel();
            }else if(v == tvProceed){
                onSelectMenuItemListener.onProceed();
            }
            dismiss();
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
        }
    }


