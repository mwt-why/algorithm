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

    public static Linked add() {
        Linked linked = new SingleLinked();
        linked.add(new Person(1, "a"));
        linked.add(new Person(2, "b"));
        linked.add(new Person(3, "c"));
        return linked;
    }

    public static void get(Linked list) {
        Linked linked = list;
        for (int i = 0; i < linked.size(); i++) {
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

    public static void mGet(Linked dulLinked) {
        for (int i = 0; i < dulLinked.size(); i++) {
            System.out.println(dulLinked.get(i));
        }
    }

    public static DulLinked mAdd() {
        DulLinked dulLinked = new DulLinked();
        dulLinked.add(new Person(0, "a"));
        dulLinked.add(new Person(1, "b"));
        dulLinked.add(new Person(2, "c"));
        dulLinked.add(new Person(3, "d"));
//        System.out.println(dulLinked.get(0));
//        mGet(dulLinked);
        return dulLinked;
    }

    public static void rGet() {
        DulLinked linked = mAdd();
        System.out.println(linked.get(1, false));
    }

    public static void mSet() {
        Linked linked = mAdd();
        linked.set(2, new Person(7, "g"));
        mGet(linked);
    }

    public static void mSize() {
        Linked linked = mAdd();
        System.out.println(linked.size());
    }

    public static void mDelete() {
        Linked linked = mAdd();
        linked.delete(2);
        mGet(linked);
    }

    public static void main(String[] args) {
//        add();
//        get(add());
//        set();
//        delete();
//        mAdd();
//        rGet();
//        mSet();
//        mSize();
//        mSet();
        mDelete();
    }

}
