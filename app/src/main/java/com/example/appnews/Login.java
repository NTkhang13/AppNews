package com.example.appnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.appnews.MainActivity.MainActivity;
import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
TextInputEditText user_name, pass_word;
Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user_name=findViewById(R.id.eUser);
        pass_word=findViewById(R.id.Pass);
        btnLogin= findViewById(R.id.login);

        btnLogin.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case (R.id.login):
                String username = user_name.getText().toString();
                ("Nguyen").concat("Khang");
                String pass = pass_word.getText().toString();
                if (username.equals("khang") && pass.equals("1")) {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                    Intent ds  = new Intent(Login.this, MainActivity.class);
                    startActivity(ds);
                }
                else
                    Toast.makeText(getApplicationContext(), "đăng nhập thất bại!",Toast.LENGTH_SHORT).show();

                break;
//            case (R.id.buttonCancel):
//                Intent startMain = new Intent(Intent.ACTION_MAIN);
//                startMain.addCategory(Intent.CATEGORY_HOME);
//                startActivity(startMain);
//                finish();
//                break;



        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}