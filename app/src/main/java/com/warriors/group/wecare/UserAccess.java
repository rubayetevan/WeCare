package com.warriors.group.wecare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Rubayet on 04-Apr-16.
 */
public class UserAccess extends Fragment implements View.OnClickListener{
    View view;
    Button registration , login;
    Communicator communicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.user_access_layout,container,false);
        initializer();
        return view;
    }

    private void initializer()
    {
        registration = (Button) view.findViewById(R.id.newUser);
        login = (Button) view.findViewById(R.id.existingUser);
    }

    public  void setCommunicator(Communicator communicator)
    {
        this.communicator =communicator;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        registration.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.newUser)
        {
            communicator.information("new");
        }
        else if(v.getId() == R.id.existingUser)
        {
            communicator.information("old");
        }
    }
}
