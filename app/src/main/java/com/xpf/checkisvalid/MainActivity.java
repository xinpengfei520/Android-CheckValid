package com.xpf.checkisvalid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	private EditText editUserName;//验证用户名输入域
	private EditText editPassword;//验证密码输入域
	private EditText editphonenumber;//验证手机号输入域
	private EditText editEmail;//验证邮箱输入域
	private EditText editChinese;//验证汉字输入域
	private EditText editIdCard;//验证身份证输入域
	private EditText editUrl;//验证URL输入域
	private EditText editIpAddress;//验证IP地址输入域

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initViews();
	}

	/**
	 * 初始化视图
	 */
	private void initViews(){
		findViewById(R.id.tv_verify_user_name).setOnClickListener(this);
		editUserName = (EditText) findViewById(R.id.edit_verify_user_name);
		editPassword = (EditText) findViewById(R.id.edit_verify_password);
		editphonenumber = (EditText) findViewById(R.id.edit_verify_phonenumber);
		editEmail = (EditText) findViewById(R.id.edit_verify_email);
		editChinese = (EditText) findViewById(R.id.edit_verify_chinese);
		editIdCard = (EditText) findViewById(R.id.edit_verify_id_card);
		editUrl = (EditText) findViewById(R.id.edit_verify_url);
		editIpAddress = (EditText) findViewById(R.id.edit_verify_ip_address);
	
		//监听
		findViewById(R.id.tv_verify_user_name).setOnClickListener(this);
		findViewById(R.id.tv_verify_password).setOnClickListener(this);
		findViewById(R.id.tv_verify_phonenumber).setOnClickListener(this);
		findViewById(R.id.tv_verify_email).setOnClickListener(this);
		findViewById(R.id.tv_verify_chinese).setOnClickListener(this);
		findViewById(R.id.tv_verify_id_card).setOnClickListener(this);
		findViewById(R.id.tv_verify_url).setOnClickListener(this);
		findViewById(R.id.tv_verify_ip_address).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.tv_verify_user_name:
			String userName = editUserName.getText().toString().trim();
			if(Validator.isUserName(userName)){
				showToast("验证用户名成功!");
			}else{
				showToast("验证用户名失败!");
			}
			break;
		case R.id.tv_verify_password:
			String password = editPassword.getText().toString().trim();
			if(Validator.isPassword(password)){
				showToast("验证密码成功!");
			}else{
				showToast("验证密码失败!");
			}
			break;
		case R.id.tv_verify_phonenumber:
			String phoneNumber = editphonenumber.getText().toString().trim();
			if(Validator.isMobile(phoneNumber)){
				showToast("验证手机号成功!");
			}else{
				showToast("验证手机号失败!");
			}
			break;
		case R.id.tv_verify_email:
			String email = editEmail.getText().toString().trim();
			if(Validator.isEmail(email)){
				showToast("验证邮箱成功!");
			}else{
				showToast("验证邮箱失败!");
			}
			break;
		case R.id.tv_verify_chinese:
			String chinese = editChinese.getText().toString().trim();
			if(Validator.isChinese(chinese)){
				showToast("验证汉字成功!");
			}else{
				showToast("验证汉字失败!");
			}
			break;
		case R.id.tv_verify_id_card:
			String idCard = editIdCard.getText().toString().trim();
			if(Validator.isIDCard(idCard)){
				showToast("验证身份证成功!");
			}else{
				showToast("验证身份证失败!");
			}
			break;
		case R.id.tv_verify_url:
			String url = editUrl.getText().toString().trim();
			if(Validator.isUrl(url)){
				showToast("验证URL成功!");
			}else{
				showToast("验证URL失败!");
			}
			break;
		case R.id.tv_verify_ip_address:
			String ipAddress = editIpAddress.getText().toString().trim();
			if(Validator.isIPAddress(ipAddress)){
				showToast("验证IP地址成功!");
			}else{
				showToast("验证IP地址失败!");
			}
			break;
		default:
			break;
		}
	}
	
	private void showToast(String text){
		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
	}
}
