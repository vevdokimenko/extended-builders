public abstract class ExtendedBaseClass extends BaseClass {
    private String name;

    protected ExtendedBaseClass(Builder<?> builder) {
        super(builder);
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public static abstract class Builder<T extends Builder> extends BaseClass.Builder<T> {
        private String name;

        public T name(String name) {
            this.name = name;
            return self();
        }
    }
}
