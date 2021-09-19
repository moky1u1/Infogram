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

        images.add(new Image("https://mir-s3-cdn-cf.behance.net/project_modules/2800_opt_1/86136164057543.5acbb22ca2b6f.jpg","Monica Galindo", "2 Dias", "1 me gusta"));
        images.add(new Image("https://www.lostiempos.com/sites/default/files/styles/noticia_detalle/public/media_imagen/2018/1/13/1-_roma_2-_hector_arnez.jpg?itok=UCQEK8Mi","Icela Creyo", "4 Dias", "25 me gusta"));
        images.add(new Image("https://tipsparatuviaje.com/wp-content/uploads/2019/07/salar-de-uyuni.jpg","Zoyla Vaca", "3 Dias", "10 me gusta"));
        images.add(new Image("https://boliviamia.net/Images/Tourpics/atop-uyuni-07.jpg","Elvis Quito", "2 Dias", "5 me gusta"));
        images.add(new Image("https://content.skyscnr.com/m/4c09ac3f3118423c/original/GettyImages-490287388.jpg?resize=1800px:1800px&quality=100","Juan Perez", "2 Dias", "2 me gusta"));
        images.add(new Image("https://queverenz.com/wp-content/uploads/2016/11/Que-cosas-ver-hacer-en-bolivia-lugares-sitios-puntos-destinos-turismo-dias.jpg","Facundo Rojas", "5 Dias", "11 me gusta"));
        images.add(new Image("https://tipsparatuviaje.com/wp-content/uploads/2019/07/el-camino-de-la-muerte.jpg","Alvaro Camargo", "7 Dias", "9 me gusta"));
        images.add(new Image("https://www.la-razon.com/wp-content/uploads/2020/12/01/10/ybs42dy9o6a1hqyfwu8ibh.jpg","Cristian Tapia", "9 Dias", "15 me gusta"));
        images.add(new Image("https://marketingsimulator.net/asaucedo/wp-content/uploads/sites/187/2016/07/valledelaluna-1038x576.jpg","Lorena Nina", "3 Dias", "14 me gusta"));
        images.add(new Image("https://static.eldeber.com.bo//Files/Original/sites/eldeber/img/2018/01/15/cho_.jpg","Esteban Quito", "2 Dias", "20 me gusta"));






        return images;
    }
}