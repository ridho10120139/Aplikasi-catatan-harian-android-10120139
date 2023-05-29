package com.example.dailynotes10120139;

import android.database.Cursor;

import com.example.dailynotes10120139.model.Note;

//10120139-MochamadRidho-IF4
public interface NoteInterface {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}