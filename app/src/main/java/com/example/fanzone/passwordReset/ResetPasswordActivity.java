package com.example.fanzone.passwordReset;

import com.example.fanzone.R;
import com.example.fanzone.databinding.ActivityResetpasswordBinding;
import com.example.fanzone.utils.BaseActivityBinding;

public class ResetPasswordActivity extends BaseActivityBinding<ActivityResetpasswordBinding> {
    @Override
    protected ActivityResetpasswordBinding inflateBinding() {
        return ActivityResetpasswordBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_resetpassword;
    }

    @Override
    protected void initComponents() {

    }
}
