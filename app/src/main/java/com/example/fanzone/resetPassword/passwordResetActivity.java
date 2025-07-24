package com.example.fanzone.resetPassword;

import com.example.fanzone.R;
import com.example.fanzone.databinding.ActivityPasswordResetBinding;
import com.example.fanzone.utils.BaseActivityBinding;

public class passwordResetActivity extends BaseActivityBinding<ActivityPasswordResetBinding> {
    @Override
    protected ActivityPasswordResetBinding inflateBinding() {
        return ActivityPasswordResetBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_password_reset;
    }

    @Override
    protected void initComponents() {

    }
}
