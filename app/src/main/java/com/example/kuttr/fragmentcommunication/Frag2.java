package com.example.kuttr.fragmentcommunication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Frag2 extends Fragment {
    TextView txt; // object to hold the text view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag2, container, false);
    }

    // method to accept the message from the
    // activity and update the UI
    public void changedata(String i)
    {
        txt=getActivity().findViewById(R.id.tv);
        txt.setText(i);
    }

}
