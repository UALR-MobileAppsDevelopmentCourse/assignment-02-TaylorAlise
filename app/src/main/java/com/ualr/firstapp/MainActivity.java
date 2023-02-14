package com.ualr.firstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.firstapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = mBinding.getRoot();
        setContentView(rootView);
    }

    // TODO 06. Avoid updating the text label (userMsgTV) when the text field (userInputET) is empty

    @SuppressLint("SetTextI18n")
    public void showTextMessage(View view) {
       if (TextUtils.isEmpty(mBinding.userInputET.getText().toString())) {
           mBinding.userInputET.setText("Field is empty");
       }
       else {
           mBinding.userMsgTV.setText(mBinding.userInputET.getText().toString());

       }

    }

    // TODO 07. Create a new method called cleanTextField to delete the text inside the text field
    public void cleanTextField (View view) {
        mBinding.cleanBtn.setText("");

    }
}
