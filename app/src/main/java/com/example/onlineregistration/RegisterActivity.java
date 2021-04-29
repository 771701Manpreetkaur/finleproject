package com.example.onlineregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.text.TextUtils;

import com.google.gson.Gson;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgHeader;
    private EditText etFullName;
    private EditText etEmail;
    private EditText etPhone;
    private EditText etStudentNumber;
    private EditText etPassword;
    private Button btnCreate;
    private Button btnView;
    private StudentList sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();

        sp = new StudentList();
        imgHeader = (ImageView)findViewById(R.id.imgHeader);
        etFullName = (EditText)findViewById(R.id.etFullName);
        etEmail = (EditText)findViewById(R.id.etEmail);
        etPhone = (EditText)findViewById(R.id.etPhone);
        etStudentNumber = (EditText)findViewById(R.id.etStudentNumber);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btnCreate = (Button)findViewById(R.id.btnCreate);
        btnView = (Button)findViewById(R.id.btnView);

        imgHeader.setBackgroundResource(R.drawable.headerpic);


        btnCreate.setOnClickListener(this);
        btnView.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCreate:
                String fullName = etFullName.getText().toString();
                String email = etEmail.getText().toString();
                String phone = etPhone.getText().toString();
                String sNumber = etStudentNumber.getText().toString();
                String password = etPassword.getText().toString();

                if(TextUtils.isEmpty(fullName)){
                     Toast("Full Name is required!");
                    return;
                }
                if(TextUtils.isEmpty(email)){
                    Toast("Email is required!");
                    return;
                }
                if(TextUtils.isEmpty(phone)){
                    Toast("Phone Number is required!");
                    return;
                }

                if(TextUtils.isEmpty(sNumber)){
                    Toast("Student Number is required!");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast("Password is required!");
                    return;
                }
                if(password.length() < 6){
                    Toast("Password must be minimum of length 6!");
                    return;
                }
                int id = sp.getStudentList().size() + 1;
                Student student = new Student(id, fullName,email,phone,sNumber,password);
                sp.addStudent(student);
                ClearFields();
                Toast(  "New Student Successfully added");
                break;
            case R.id.btnView:
                if(sp.getStudentList().size() > 0){
                    Gson gson = new Gson();
                    String myJson = gson.toJson(sp);
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("spObj", myJson);
                    startActivity(intent);
                }else{
                    Toast("No Students added! Please add atleast one student to view");
                }

                break;
        }
    }

    public void Toast(String msg){
        Toast toast = Toast.makeText(RegisterActivity.this, msg,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void ClearFields(){
        etFullName.setText("");
        etEmail.setText("");
        etPassword.setText("");
        etPhone.setText("");
        etStudentNumber.setText("");

    }
}