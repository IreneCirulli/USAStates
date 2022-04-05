package com.company;

public class State {

    private String name;
    private String capital;
    private String nickname;
    private String population;

    public State(String name, String capital, String nickname, String population) {
        this.name = name;
        this.capital = capital;
        this.nickname = nickname;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "State Name    = " + name +  "\nState Capital    = " + capital +
                "\nState Nickname    = " + nickname + "\nState Population    = " + population;
    }
}
