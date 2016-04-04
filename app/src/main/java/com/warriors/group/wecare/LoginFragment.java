package com.warriors.group.wecare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Rubayet on 04-Apr-16.
 */
public class LoginFragment extends Fragment {
    View view;
    EditText userName , password;
    Button loginBTN;
    Communicator communicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.login_layout,container,false);
        initializer();
        return view;
    }

    private void initializer()
    {
        userName = (EditText) view.findViewById(R.id.userNameET);
        password = (EditText) view.findViewById(R.id.passwordET);
        loginBTN = (Button) view.findViewById(R.id.loginBTN);
    }
}
