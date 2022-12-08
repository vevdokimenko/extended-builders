public class Main {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass.Builder()
                .id(0)
                .name("Test")
                .isActive(true)
                .build();

        System.out.println(finalClass.getId());
        System.out.println(finalClass.getName());
        System.out.println(finalClass.isActive());
    }
}