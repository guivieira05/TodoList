package com.example.guilhermeavieira2.todolist.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.guilhermeavieira2.todolist.Modelos.Tarefas;
import com.example.guilhermeavieira2.todolist.R;

import java.util.ArrayList;
import java.util.List;

public class TarefaAdapter extends ArrayAdapter<Tarefas> {

    private Context context;
    private List<Tarefas> tarefas;

    public TarefaAdapter(Context context, ArrayList<Tarefas> tarefas)
    {
        super(context, 0,tarefas);
        this.tarefas = tarefas;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listaItem = convertView;

        if (listaItem == null)
        {

            listaItem = LayoutInflater.from(context).
                    inflate(R.layout.layout_lista_tarefa, parent, false);

        }

        Tarefas tarefaAtual = tarefas.get(position);

        TextView textViewNome = listaItem.findViewById(R.id.textViewNomeTarefa);
        TextView textViewStatus = listaItem.findViewById(R.id.textViewStatusTarefa);
        TextView textViewDesc = listaItem.findViewById(R.id.textViewDescricao);

        textViewNome.setText(tarefaAtual.getNome());
        textViewStatus.setText(tarefaAtual.getStatus().toString());
        textViewDesc.setText(tarefaAtual.getDescricao());

        return listaItem;

    }
}

