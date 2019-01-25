package com.technicalrj.cb9_network;

import java.util.ArrayList;

public class SingleResponse {

    int total_count;
    ArrayList<GithubUser> items;

    public SingleResponse(int total_count, ArrayList<GithubUser> items) {
        this.total_count = total_count;
        this.items = items;
    }

    public SingleResponse() {
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public ArrayList<GithubUser> getItems() {
        return items;
    }

    public void setItems(ArrayList<GithubUser> items) {
        this.items = items;
    }
}
