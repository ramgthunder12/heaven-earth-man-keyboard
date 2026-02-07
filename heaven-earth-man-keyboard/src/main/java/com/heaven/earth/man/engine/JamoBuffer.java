package com.heaven.earth.man.engine;

public class JamoBuffer {

    private Character cho;   // 초성
    private Character jung;  // 중성
    private Character jong;  // 종성

    public void setCho(char cho) {
        this.cho = cho;
    }

    public void setJung(char jung) {
        this.jung = jung;
    }

    public void setJong(char jong) {
        this.jong = jong;
    }

    public Character getCho() {
        return cho;
    }

    public Character getJung() {
        return jung;
    }

    public Character getJong() {
        return jong;
    }

    public void clear() {
        cho = jung = jong = null;
    }

    public boolean isEmpty() {
        return cho == null && jung == null && jong == null;
    }
}
