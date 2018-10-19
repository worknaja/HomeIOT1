package com.example.nsx.homeiot;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import javax.security.auth.login.LoginException;

public class MainFragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Go To Login
        gotoLogin();

        gotoRegister();


    }

    private void gotoRegister() {
        Button button = getView().findViewById(R.id.btnGoToRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenFragmentMain, new FragmentRegister())
                        .addToBackStack(null)
                        .commit();
            }
        });


    }

    private void gotoLogin() {
        Button button = getView().findViewById(R.id.btnGoToLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenFragmentMain, new FragmentLogin())
                        .addToBackStack(null)
                        .commit();

            }
        });

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}
