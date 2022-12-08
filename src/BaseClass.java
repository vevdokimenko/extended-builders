public abstract class BaseClass {
    protected int id;

    protected BaseClass(Builder<?> builder) {
        this.id = builder.id;
    }

    public int getId() {
        return id;
    }

    public static abstract class Builder<T extends Builder> {
        private int id;

        public T id(int id) {
            this.id = id;
            return self();
        }

        protected abstract BaseClass build();

        protected abstract T self();
    }
}
