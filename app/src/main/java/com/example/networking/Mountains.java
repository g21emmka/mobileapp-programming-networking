package com.example.networking;

/*
{"ID":"mobilprog_k2",
"name":"K2",
"type":"brom",
"company":"",
"location":"The Karakoram range",
"category":"",
"size":8611,
"cost":28251,
"auxdata":{
"wiki":"https://en.wikipedia.org/wiki/K2",
"img":"https://en.wikipedia.org/wiki/K2#/media/File:K2_2006b.jpg"},
 */

public class Mountains {

    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private Auxdata auxdata;
    public Mountains(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
