package com.example.applicationsoftwarica.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applicationsoftwarica.Model.Student;
import com.example.applicationsoftwarica.R;
import com.example.applicationsoftwarica.Student_Adapter;
import com.example.applicationsoftwarica.ui.dashboard.DashboardFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private RecyclerView recycler;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recycler = root.findViewById(R.id.recycler);


        Student_Adapter adapter = new Student_Adapter(getActivity(), DashboardFragment.studentlist);
        recycler.setAdapter(adapter);

        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }


}