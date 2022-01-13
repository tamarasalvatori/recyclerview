package com.example.ex03_recyclerview.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ex03_recyclerview.Adapters.Adaptador;
import com.example.ex03_recyclerview.Model.Arquivo;
import com.example.ex03_recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    private List<Arquivo> arquivoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1 – Instanciar o RecyclerView na Activity
        recyclerView = findViewById(R.id.recyclerView);

        //2 - Configurar o tipo de Layout no RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        criarArquivos();

        //9 - Configurar o Adapter
        Adaptador adaptador = new Adaptador(arquivoList);
        recyclerView.setAdapter(adaptador);
    }

    void criarArquivos(){
        Arquivo arquivo;
        arquivo = new Arquivo("Músicas", "Criado em 10/02/2012", true);
        arquivoList.add(arquivo);

        arquivo = new Arquivo("Filmes", "Criado em 22/04/2021", true);
        arquivoList.add(arquivo);

        arquivo = new Arquivo("Aulas", "Criado em 02/03/2014", true);
        arquivoList.add(arquivo);

        arquivo = new Arquivo("Jogos", "Criado em 13/11/2017", true);
        arquivoList.add(arquivo);

        arquivo = new Arquivo("Dados", "Criado em 24/07/2007", true);
        arquivoList.add(arquivo);

        arquivo = new Arquivo("Fotos", "Criado em 30/09/2007", true);
        arquivoList.add(arquivo);

        arquivo = new Arquivo("Clientes", "Criado em 17/03/2014", false);
        arquivoList.add(arquivo);
    }
}