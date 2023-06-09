package com.zsolt.licenta.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zsolt.licenta.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class AddFriendsViewHolder extends RecyclerView.ViewHolder {
    private TextView textProfileName;
    private CircleImageView imageProfile;


    private ImageButton buttonRemoveFriend;

    public AddFriendsViewHolder(@NonNull View itemView) {
        super(itemView);
        textProfileName = itemView.findViewById(R.id.text_recyclerview_name);
        imageProfile = itemView.findViewById(R.id.image_recyclerview_profile);
        buttonRemoveFriend = itemView.findViewById(R.id.button_remove_friend);
    }

    public TextView getTextProfileName() {
        return textProfileName;
    }

    public CircleImageView getImageProfile() {
        return imageProfile;
    }

    public ImageButton getButtonRemoveFriend() {return buttonRemoveFriend;}
}
