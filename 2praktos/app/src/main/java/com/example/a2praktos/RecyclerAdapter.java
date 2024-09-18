package com.example.a2praktos;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<State> states;
    StateAdapter(Context context, List<State> states){
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateAdapter.ViewHolder holder, int position) {
    State state = states.get(position);
    holder.flagView.setImageResource(state.getFlagResource());
    holder.nameView.setText(state.getName());
    holder.capitalView.setText(state.getCapital());
    }

    @Override
    public int getItemCount() { return states.size();}

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.capital);



        }




    }
}








