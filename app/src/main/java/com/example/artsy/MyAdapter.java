//package com.example.artsy;
//
//import android.content.Context;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.LayoutInflater;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
//
//    private ArrayList<String> localDataSet = new ArrayList<String>();
//    private Context context;
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_fav_list, parent, false);
//
//        return new MyViewHolder(view);
//    }
//
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.getTextView().setText(localDataSet.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return localDataSet.size();
//    }
//    public MyAdapter(ArrayList<String> dataSet, Context context) {
//        localDataSet = dataSet;
//        this.context = context;
//
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder {
//        private final TextView textView;
//
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            textView = (TextView) itemView.findViewById(R.id.textView);
//        }
//        public TextView getTextView() {
//            return textView;
//        }
//    }
//
//}
