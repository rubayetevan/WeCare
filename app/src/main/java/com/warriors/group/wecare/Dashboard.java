package com.warriors.group.wecare;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity implements Communicator {

    FragmentManager fragmentManager;
    UserAccess userAccess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        fragmentManager = getSupportFragmentManager();
        userAccess  = new UserAccess();
        userAccess.setCommunicator(this);
        FragmentTransaction transaction =fragmentManager.beginTransaction();
        transaction.add(R.id.dashBoard,userAccess,"userAccess");
        //transaction.addToBackStack("userAccess");
        transaction.commit();
    }


    @Override
    public void information(String information)
    {

        if (information == "new")
        {
            RegistrationSelectionFragment registrationSelectionFragment = new RegistrationSelectionFragment();
            registrationSelectionFragment.setCommunicator(this);
            FragmentTransaction transactionR = fragmentManager.beginTransaction();
            transactionR.replace(R.id.dashBoard,registrationSelectionFragment,"registration");
            transactionR.addToBackStack("registration");
            transactionR.commit();
        }
        else if(information == "old")
        {
            LoginFragment loginFragment = new LoginFragment();
            FragmentTransaction transactionL =fragmentManager.beginTransaction();
            transactionL.replace(R.id.dashBoard,loginFragment,"login");
            transactionL.addToBackStack("login");
            transactionL.commit();
        }
        else if (information == "child")
        {
            ChildRegistrationFragment childRegistrationFragment = new ChildRegistrationFragment();
            FragmentTransaction transactionC = fragmentManager.beginTransaction();
            transactionC.replace(R.id.dashBoard,childRegistrationFragment,"childRegistration");
            transactionC.addToBackStack("childRegistration");
            transactionC.commit();
        }
        else if (information == "women")
        {
            WomenRegistrationFragments womenRegistrationFragments = new WomenRegistrationFragments();
            FragmentTransaction transactionW = fragmentManager.beginTransaction();
            transactionW.replace(R.id.dashBoard,womenRegistrationFragments,"womenRegistration");
            transactionW.addToBackStack("womenRegistration");
            transactionW.commit();

        }

    }
}
