package com.example.essemalditoprojeto.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.essemalditoprojeto.R;
import com.example.essemalditoprojeto.activity.adapter.Adapter;
import com.example.essemalditoprojeto.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        //listagem de filmes
        this.criarFilmes();

        //configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        //configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    public void criarFilmes() {
        Filme filme = new Filme("mulher maravilha", "ação", "6166");
        listaFilmes.add(filme);

        filme = new Filme("batman begins", "noir", "6166");
        listaFilmes.add(filme);

        filme = new Filme("iron man", "ação", "6166");
        listaFilmes.add(filme);

        filme = new Filme("capitão america e o soldado invernal", "ação", "6166");
        listaFilmes.add(filme);

        filme = new Filme("titulo", "genero", "5165");
        listaFilmes.add(filme);

        filme = new Filme("mulhe2r maravilha", "ação", "6166");
        listaFilmes.add(filme);

        filme = new Filme("batman2 begins", "noir", "6166");
        listaFilmes.add(filme);

        filme = new Filme("iron2 man", "ação", "6166");
        listaFilmes.add(filme);

        filme = new Filme("capitão2 america e o soldado invernal", "ação", "6166");
        listaFilmes.add(filme);

        filme = new Filme("titulo2", "genero", "5165");
        listaFilmes.add(filme);
    }
}