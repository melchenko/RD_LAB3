package com.company.lesson6;

public enum SeasonRu {


    January("Январь"),
    February("Февраль"),
    March("Март"),
    April("Апрель"),
    May("Май"),
    June("Июнь"),
    July("Июль"),
    August("Август"),
    September("Сентябрь"),
    October("Октябрь"),
    November("Ноябрь"),
    December("Декабрь");

    private final String nameRu;

    SeasonRu(String nameRu) {
        this.nameRu = nameRu;
    }

    @Override
    public String toString() {
        return nameRu;
    }

}
