package com.mwt.dataStructure.table;

public class Test {
    public static void main(String[] args) {
        Table table = put();
        set(table);
//        delete(table);
        get(table);
    }

    private static Table put(){
        Table table = new HashTable();
        table.put("1","one");
        table.put("2","two");
        table.put("3","three");
        return table;
    }

    private static void get(Table table){
        System.out.println(table.get("1"));
        System.out.println(table.get("2"));
        System.out.println(table.get("3"));
    }

    public static void set(Table table){
        table.set("1","10");
    }

    public static void delete(Table table){
        table.delete("1");
    }
}
