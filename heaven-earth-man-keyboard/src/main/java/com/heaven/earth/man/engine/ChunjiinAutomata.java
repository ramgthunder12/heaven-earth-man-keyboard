package com.heaven.earth.man.engine;

public class ChunjiinAutomata {

    private State state = State.EMPTY;
    private final JamoBuffer buffer = new JamoBuffer();
    private final StringBuilder output = new StringBuilder();

    public void input(KeyType type, char value) {
        switch (state) {
            case EMPTY -> handleEmpty(type, value);
            case CHO -> handleCho(type, value);
            case JUNG -> handleJung(type, value);
            case JONG -> handleJong(type, value);
        }
    }

    private void handleEmpty(KeyType type, char value) {
        // TODO
    }

    private void handleCho(KeyType type, char value) {
        // TODO
    }

    private void handleJung(KeyType type, char value) {
        // TODO
    }

    private void handleJong(KeyType type, char value) {
        // TODO
    }

    public String getText() {
        return output.toString();
    }
}

