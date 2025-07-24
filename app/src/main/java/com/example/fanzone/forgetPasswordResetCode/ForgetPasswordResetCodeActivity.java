package com.example.fanzone.forgetPasswordResetCode;

import com.example.fanzone.R;
import com.example.fanzone.databinding.ActivityForgetPasswordResetCodeBinding;
import com.example.fanzone.utils.BaseActivityBinding;

public class ForgetPasswordResetCodeActivity extends BaseActivityBinding<ActivityForgetPasswordResetCodeBinding> {
    @Override
    protected ActivityForgetPasswordResetCodeBinding inflateBinding() {
        return ActivityForgetPasswordResetCodeBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_forget_password_reset_code;
    }

    @Override
    protected void initComponents() {

    }
}
