package com.example.fanzone.passwordReset;

import com.example.fanzone.R;
import com.example.fanzone.databinding.ActivityResetPasswordBinding;
import com.example.fanzone.utils.BaseActivityBinding;

public class ResetPasswordActivity extends BaseActivityBinding<ActivityResetPasswordBinding> {
    @Override
    protected ActivityResetPasswordBinding inflateBinding() {
        return ActivityResetPasswordBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_reset_password;
    }

    @Override
    protected void initComponents() {

    }
}
