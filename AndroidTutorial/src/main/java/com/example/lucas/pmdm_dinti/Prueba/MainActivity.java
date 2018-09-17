package com.example.lucas.pmdm_dinti.Prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.milib.mylibrary.LoginFragment;
import com.milib.mylibrary.LoginFragmentListener;

public class MainActivity extends AppCompatActivity {

 LoginFragment loginFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   loginFragment = (LoginFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentLogin);
   MainActivityEvents mainActivityEvents= new MainActivityEvents(this);
   loginFragment.setListener(mainActivityEvents);
    }
}
class MainActivityEvents implements LoginFragmentListener{
    MainActivity mainActivity;
    public MainActivityEvents(MainActivity mainActivity){

    }

    @Override
    public void loginFragmentLoginButtonClick() {

    }

    @Override
    public void loginFragmentRegisterButtonClick() {

    }
}