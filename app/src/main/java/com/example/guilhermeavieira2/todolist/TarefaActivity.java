package com.example.guilhermeavieira2.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TarefaActivity extends AppCompatActivity {

    private TextView textViewTituloTarefas;
    private TextView textViewTituloDescricoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa);

        textViewTituloTarefas = findViewById(R.id.textViewTituloTarefa);
        textViewTituloDescricoes = findViewById(R.id.textViewDescricao2);


        Intent intent = getIntent();
        String titulo = intent.getStringExtra("TITULO");
        textViewTituloTarefas.setText(titulo);

        Intent intent2 = getIntent();
        String descricao = intent2.getStringExtra("DESCRICAO");
        textViewTituloDescricoes.setText(descricao);
    }
}
