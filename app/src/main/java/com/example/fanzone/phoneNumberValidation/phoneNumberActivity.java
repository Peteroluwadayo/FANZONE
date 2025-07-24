package com.example.fanzone.phoneNumberValidation;

import com.example.fanzone.R;
import com.example.fanzone.databinding.ActivityPhoneNumberBinding;
import com.example.fanzone.utils.BaseActivityBinding;

public class phoneNumberActivity extends BaseActivityBinding<ActivityPhoneNumberBinding> {
    @Override
    protected ActivityPhoneNumberBinding inflateBinding() {
        return ActivityPhoneNumberBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_phonenumber;
    }

    @Override
    protected void initComponents() {

    }
}
