public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Cong");
        list.add("Hoa");
        list.add("Xa");
        list.add("Hoi");

        print(list.getData());
        System.out.println(list.indexOf("Chu"));
        System.out.println(list.indexOf("Nghia"));
        list.remove(1);
        list.add("Viet", 1);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("Nam"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(list.getData());
    }


    public static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}
