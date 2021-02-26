package com.moonlight.e_challan.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.moonlight.e_challan.Login_system.Login;
import com.moonlight.e_challan.Login_system.Register;
import com.moonlight.e_challan.R;


public class BookFragment extends Fragment {



    public BookFragment() { }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_book, container, false);
        Button button  = rootview.findViewById(R.id.Log);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getActivity(), Login.class));
            }
        });
        return rootview;

    }

}