package com.mkcorp.ethicworld.beans;

public class Comp {
    private long id;
    private String name;
    private long nbEmps;

    public Comp() {
    }

    public Comp(long id, String name, long nbEmps) {
        this.id = id;
        this.name = name;
        this.nbEmps = nbEmps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNbEmps() {
        return nbEmps;
    }

    public void setNbEmps(long nbEmps) {
        this.nbEmps = nbEmps;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Comp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nbEmps=" + nbEmps +
                '}';
    }
}
