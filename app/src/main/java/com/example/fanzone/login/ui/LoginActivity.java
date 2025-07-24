package com.example.fanzone.login.ui;

import com.example.fanzone.R;
import com.example.fanzone.databinding.ActivityLoginBinding;
import com.example.fanzone.utils.BaseActivityBinding;

public class LoginActivity extends BaseActivityBinding<ActivityLoginBinding> {


    @Override
    protected ActivityLoginBinding inflateBinding() {
        return ActivityLoginBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_login;
    }

    @Override
    protected void initComponents() {

    }
}
