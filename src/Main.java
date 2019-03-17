public class Main {
    public static void main(String[] args) {
        Service<String> service = new ServiceArrayList<>();
        service.add("Hello");
        service.add("my");
        service.add("dear");
        service.add("friend");

        service.update(0, "Hi");
        service.delete(2);

        for (String s : service) {
            System.out.println(s);

        }
    }
}


