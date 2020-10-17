package com.mwt.list;


public class Test {
    private static class Person {
        private long id;
        private String username;

        public Person(long id, String username) {
            this.id = id;
            this.username = username;
        }

        public Person() {
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
//        add();
//        get(add());
//        set();
        delete();
    }

    public static Linked add() {
        Linked linked = new SingleLinked();
        linked.add(new Person(1, "a"));
        linked.add(new Person(2, "b"));
        linked.add(new Person(3, "c"));
        return linked;
    }

    public static void get(Linked list) {
        Linked linked = list;
        for (int i = 0; i < linked.getSize(); i++) {
            System.out.println(linked.get(i));
        }
    }

    public static void set() {
        Linked linked = add();
        linked.set(1, new Person(4, "d"));
        get(linked);
    }

    public static void delete() {
        Linked linked = add();
        linked.delete(2);
        get(linked);
    }

}
