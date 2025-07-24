package com.example.fanzone.signup.ui;

import com.example.fanzone.R;
import com.example.fanzone.databinding.ActivitySignupBinding;
import com.example.fanzone.utils.BaseActivityBinding;

public class SignupActivity extends BaseActivityBinding<ActivitySignupBinding> {




    @Override
    protected ActivitySignupBinding inflateBinding() {
        return ActivitySignupBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_signup;
    }

    @Override
    protected void initComponents() {

    }
}
