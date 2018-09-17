package com.milib.mylibrary;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
public EditText etemail;
public EditText etpass;
public Button btnLogin;
public Button btnRegister;
public LoginFragmentEvents events;
public LoginFragmentListener listener;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v=inflater.inflate(R.layout.fragment_login, container, false);
       //devuelve la representacion en objeto del xml, lo guardamos en v

        etemail = v.findViewById(R.id.etemail);
        etpass = v.findViewById(R.id.etpass);
        btnLogin = v.findViewById(R.id.btnLogin);
        btnRegister = v.findViewById(R.id.btnRegister);
        events = new LoginFragmentEvents(this);
        btnLogin.setOnClickListener(events);
        btnRegister.setOnClickListener(events);

        return v;
    }

    public void setListener(LoginFragmentListener listener) {
        this.listener = listener;
    }
}
class LoginFragmentEvents implements View.OnClickListener{
    private LoginFragment loginFragment;
public LoginFragmentEvents(LoginFragment fragment){
this.loginFragment = fragment;
}
    @Override
    public void onClick(View v) {
if(v.getId()==this.loginFragment.btnLogin.getId()){
    this.loginFragment.listener.loginFragmentLoginButtonClick(this.loginFragment.etemail.getText().toString(),
    this.loginFragment.etpass.getText().toString());
}
else if (v.getId()==this.loginFragment.btnRegister.getId()){
    this.loginFragment.listener.loginFragmentRegisterButtonClick();
}
    }
}