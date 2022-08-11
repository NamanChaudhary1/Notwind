package com.example.notwind;

import androidx.cardview.widget.CardView;

import com.example.notwind.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
