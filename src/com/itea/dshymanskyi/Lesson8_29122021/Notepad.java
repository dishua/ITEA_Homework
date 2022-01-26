package com.itea.dshymanskyi.Lesson8_29122021;

import java.util.ArrayList;

public class Notepad {

    private class Note {
        private final String date;
        private final String event;

        private Note(String date, String event) {
            this.date = date;
            this.event = event;
        }
    }

    ArrayList<Note> notes = new ArrayList<>();

    public void addNote(String date, String event) {
        Note note = new Note(date, event);
        notes.add(note);
    }

    @Override
    public String toString() {
        String result = "";
        for (Note note : notes) {
            result += note.date + "\n" + note.event + "\n\n";
        }
        return result;
    }
}

class NotepadRunner {

    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.addNote("12/10/2021", "Go to the gym");
        notepad.addNote("12/12/2021", "go to the cinema");

        System.out.println(notepad);

    }
}


