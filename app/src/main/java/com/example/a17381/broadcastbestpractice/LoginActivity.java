package com.example.a17381.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by 17381 on 2016/8/20.
 */
public class LoginActivity extends BaseActivity {

    private EditText accountText;

    private EditText passwordText;

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        accountText = (EditText) findViewById(R.id.account);
        passwordText = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = accountText.getText().toString();
                String password = passwordText.getText().toString();
                //如果账号是admin且密码是123456，就认为登陆成功
                if(account.equals("admin") && password.equals("123456")){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this,
                            "account or password is invalid",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
