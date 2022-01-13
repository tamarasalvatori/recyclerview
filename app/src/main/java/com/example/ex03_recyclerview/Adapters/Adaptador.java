package com.example.ex03_recyclerview.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ex03_recyclerview.Model.Arquivo;
import com.example.ex03_recyclerview.R;

import java.util.ArrayList;
import java.util.List;
//3 - Criar uma classe que herda a RecyclerView
public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {

private List<Arquivo> arquivoAdp = new ArrayList<>();

    public Adaptador(List<Arquivo> arquivoAdp) {
        this.arquivoAdp = arquivoAdp;
    }

    //Criado de forma automatica
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //5 - Método chamado quando novos "itens" da lista são criados.
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista, parent, false);
        return new MyViewHolder(itemLista);
    }
    //Criado de forma automatica
    @Override
    //7 - Método responsável por "popular" os itens da lista
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //holder.txtTitulo.setText("Arquivo X");
        Arquivo arquivo = arquivoAdp.get(position);
        holder.txtTitulo.setText(arquivo.getTitulo());
        holder.txtData.setText(arquivo.getData());
        //holder.imgMore.setImageResource(R.drawable.ic_baseline_more_vert_24);
        holder.posicao = position;

        if(!arquivo.getTipo()){
            holder.imgIcon.setImageResource(R.drawable.ic_baseline_insert_drive_file_24);
        }
    }

    //Criado de forma automatica
    @Override
    //8 - Método que configura a quantidade de itens do RecyclerView
    public int getItemCount() {
        return arquivoAdp.size();
    }

    //4 - Criar InnerClasse
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtTitulo, txtData;
        ImageView imgIcon, imgMore;
        int posicao;

        public MyViewHolder(final View itemView) {
            super(itemView);
            //6 - ViewHolder - Classe responsável por configurar as Views de cada um itens da lista
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtData = itemView.findViewById(R.id.txtData);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            imgMore = itemView.findViewById(R.id.imgMore);

            imgIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(),"Deseja abrir " + arquivoAdp.get(posicao).getTitulo() + "?", Toast.LENGTH_SHORT).show();
                }
            });

            imgMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), "Mais opções.", Toast.LENGTH_SHORT).show();
                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), "Deseja abrir " + arquivoAdp.get(posicao).getTitulo() + "?", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

}
