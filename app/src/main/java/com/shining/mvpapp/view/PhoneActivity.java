package com.shining.mvpapp.view;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jakewharton.rxbinding.view.RxView;
import com.shining.mvpapp.Constants;
import com.shining.mvpapp.R;
import com.shining.mvpapp.model.PhoneInfo;
import com.shining.mvpapp.presenter.PhonePresenter;
import com.shining.mvpapp.presenter.PhonePresenterImpl;

import java.util.concurrent.TimeUnit;

import butterknife.Bind;
import butterknife.ButterKnife;
import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;
import rx.functions.Action1;

@RuntimePermissions
public class PhoneActivity extends AppCompatActivity implements PhoneView {

    @Bind(R.id.et_PhoneNumber)
    EditText etPhoneNumber;
    @Bind(R.id.bt_Query)
    Button btQuery;
    @Bind(R.id.tv_phoneNumber)
    TextView tvPhoneNumber;
    @Bind(R.id.tv_area)
    TextView tvArea;
    @Bind(R.id.tv_operators)
    TextView tvOperators;
    @Bind(R.id.tv_areaCode)
    TextView tvAreaCode;
    @Bind(R.id.tv_postCode)
    TextView tvPostCode;
    private PhonePresenter phonePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        ButterKnife.bind(this);
        phonePresenter = new PhonePresenterImpl(this);
        OnClinkListener();
    }

    @Override
    public void showPhoneInfo(PhoneInfo phoneInfo) {
        String area=phoneInfo.getProvince()+","+phoneInfo.getCity();
        tvPhoneNumber.setText(phoneInfo.getMobile());
        tvArea.setText(area);
        tvOperators.setText(phoneInfo.getCorp());
        tvAreaCode.setText(phoneInfo.getAreaCode());
        tvPostCode.setText(phoneInfo.getPostCode());
        Toast.makeText(this,getResources().getString(R.string.toast_notify_success),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideLoading(){

    }

    @Override
    public void showLoading(){

    }

    @Override
    public void showError(){
        Toast.makeText(this,getResources().getString(R.string.toast_notify_failed),Toast.LENGTH_SHORT).show();
    }

    protected void OnClinkListener() {
        /*防止重复点击*/
        RxView.clicks(btQuery).throttleFirst(1000,TimeUnit.MILLISECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                String phoneNumber = etPhoneNumber.getText().toString();
                String checkNumber = tvPhoneNumber.getText().toString();
                if (phoneNumber.length() != 11) {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.toast_notify_input), Toast.LENGTH_SHORT).show();
                    return;
                }
                if (phoneNumber.equals(checkNumber)) {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.toast_notify_order), Toast.LENGTH_SHORT).show();
                    Log.d(Constants.TAG, "电话号码与前一个相同");
                    return;
                }
                phonePresenter.getPhoneInfo(phoneNumber);
            }
        });
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @NeedsPermission({Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE})
    void writeStorage() {
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PhoneActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    }

    @OnShowRationale({Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE})
    void writeStorageShow(final PermissionRequest request) {
    }
}
