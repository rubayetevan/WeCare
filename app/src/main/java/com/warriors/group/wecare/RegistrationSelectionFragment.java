package com.warriors.group.wecare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Rubayet on 04-Apr-16.
 */
public class RegistrationSelectionFragment extends Fragment implements View.OnClickListener {
    Communicator communicator;
    View view;
    Button child,women;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.registration_selection_layout,container,false);
        initializer();
        return view;
    }

    private void initializer()
    {
        child = (Button) view.findViewById(R.id.child);
        women = (Button) view.findViewById(R.id.women);
    }
    public  void setCommunicator(Communicator communicator)
    {
        this.communicator =communicator;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        child.setOnClickListener(this);
        women.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.child)
        {
            communicator.information("child");
        }
        else if(v.getId() == R.id.women)
        {
            communicator.information("women");
        }
    }
}
