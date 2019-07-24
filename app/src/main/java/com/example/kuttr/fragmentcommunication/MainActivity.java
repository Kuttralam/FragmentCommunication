package com.example.kuttr.fragmentcommunication;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kuttr.fragmentcommunication.Communicator;
import com.example.kuttr.fragmentcommunication.Frag2;
import com.example.kuttr.fragmentcommunication.R;

public class MainActivity extends AppCompatActivity
        implements Communicator, AdapterView.OnItemClickListener {
    Communicator comm; //object for interface to pass the message to the activity
    ListView lv;
    String s;
    String days[]={"Monday","Tuesday","Wednesday","Thursday",
            "Friday","Saturday","Sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        ArrayAdapter<String> ada=
                new ArrayAdapter<String>
                        (this, android.R.
                                layout.simple_list_item_1,days);

        lv.setAdapter(ada);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void respond(String i) {
        FragmentManager fm=
                getSupportFragmentManager();
        Frag2 f2= (Frag2) fm.
                findFragmentById(R.id.fragment2);
        f2.changedata(i);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        TextView txt = (TextView) view;
        respond(txt.getText().toString());

    }
}
