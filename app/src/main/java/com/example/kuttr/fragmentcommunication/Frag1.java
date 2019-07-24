package com.example.kuttr.fragmentcommunication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Frag1 extends Fragment implements View.OnClickListener{
    int count=0; // int to maintain the no of button clicks
    Button bt; //object for button
    Communicator comm; //object for interface to pass the message to the activity
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_frag1, container, false);
        comm= (Communicator) getActivity();

        bt = view.findViewById(R.id.btn);
        bt.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
// on button click increment the counter and pass the message to the activity using the //method defined in the interface
        count++;
        comm.respond("The button is clicked "+ count+" times");
    }
}


