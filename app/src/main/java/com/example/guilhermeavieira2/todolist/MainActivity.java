package com.example.guilhermeavieira2.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.guilhermeavieira2.todolist.Adapter.TarefaAdapter;
import com.example.guilhermeavieira2.todolist.Modelos.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Tarefas> tarefas = new ArrayList<>();
    private ArrayAdapter<Tarefas> tarefasArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        criarTarefas();

        listView = findViewById(R.id.list_view_tarefas);

        tarefasArrayAdapter = new TarefaAdapter(MainActivity.this,
                (ArrayList<Tarefas>) tarefas);
        listView.setAdapter(tarefasArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*Toast toast = Toast.makeText(getApplicationContext(),
                        tarefas.get(position).getNome(),
                        Toast.LENGTH_LONG);
                toast.show();*/

                Intent intent = new Intent(MainActivity.this, TarefaActivity.class);
                intent.putExtra("TITULO", tarefas.get(position).getNome());


                Intent inten2 = new Intent (MainActivity.this, TarefaActivity.class);
                intent.putExtra("DESCRICAO", tarefas.get(position).getDescricao());
                startActivity(intent);
            }
        });
    }

    public void criarTarefas() {
        tarefas.add(new Tarefas("1", "Estudar Android","Área para se estudar Android", false));
        tarefas.add(new Tarefas("2", "Estudar Testes","Área para fazer testes", false));
        tarefas.add(new Tarefas("3", "Jogar Couple","Área para jogar aquele Couple", false));
    }
}
