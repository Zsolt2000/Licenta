package com.zsolt.licenta.ViewHolders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zsolt.licenta.CustomViews.AddFriendDialogFragment;
import com.zsolt.licenta.Models.Interests;
import com.zsolt.licenta.R;

import java.util.List;

public class InterestsAdapter extends RecyclerView.Adapter<InterestsViewHolder> {
    private final List<Interests> interestsList;
    private View itemView;
    private boolean isButtonVisible;

    public InterestsAdapter(List<Interests> interests) {
        this.interestsList = interests;

    }

    @NonNull
    @Override
    public InterestsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_add_interests, parent, false);
        return new InterestsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull InterestsViewHolder holder, int position) {
        Interests interests = interestsList.get(position);
        holder.getTextInterestName().setText(interests.toString());
        holder.getRemoveInterestButton().setOnClickListener(view -> {
            interestsList.remove(holder.getAdapterPosition());
            notifyItemRemoved(holder.getAdapterPosition());
        });
        if(isButtonVisible){
            holder.getRemoveInterestButton().setVisibility(View.VISIBLE);
        }else {
            holder.getRemoveInterestButton().setVisibility(View.GONE);

        }
    }

    public void setButtonVisibility(boolean visibility)
    {
        this.isButtonVisible=visibility;
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        return interestsList.size();
    }




}
