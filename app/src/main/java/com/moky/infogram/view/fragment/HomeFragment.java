package com.moky.infogram.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moky.infogram.R;
import com.moky.infogram.adapter.CardviewAdapter;
import com.moky.infogram.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //toolbar
        showToolBar(getString(R.string.title_home_fragment), false, view);

        //recyclerView
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        //layout Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //el adapter
        CardviewAdapter cardviewAdapter = new CardviewAdapter(buildImages(), R.layout.cardview_image,getActivity());
        recyclerView.setAdapter(cardviewAdapter);


        return view;
    }

    public void showToolBar(String titulo, boolean botonSubir, View view){
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }

    //crear la lista de imagenes
    public ArrayList<Image> buildImages(){
        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("","Monica Galindo", "2 Dias", "1 me gusta"));
        images.add(new Image("","Icela Creyo", "4 Dias", "25 me gusta"));
        images.add(new Image("","Zoyla Vaca", "3 Dias", "10 me gusta"));
        images.add(new Image("","Elvis Quito", "2 Dias", "5 me gusta"));
        images.add(new Image("","Juan Perez", "2 Dias", "2 me gusta"));
        images.add(new Image("","Facundo Rojas", "5 Dias", "11 me gusta"));
        images.add(new Image("","Alvaro Camargo", "7 Dias", "9 me gusta"));
        images.add(new Image("","Cristian Tapia", "9 Dias", "15 me gusta"));
        images.add(new Image("","Lorena Nina", "3 Dias", "14 me gusta"));
        images.add(new Image("","Esteban Quito", "2 Dias", "20 me gusta"));






        return images;
    }
}