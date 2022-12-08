public class FinalClass extends ExtendedBaseClass {
    private boolean isActive;

    protected FinalClass(Builder builder) {
        super(builder);
        this.isActive = builder.isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    public static class Builder extends ExtendedBaseClass.Builder<Builder> {
        private boolean isActive;

        public Builder isActive(boolean isActive) {
            this.isActive = isActive;
            return self();
        }

        public FinalClass build() {
            return new FinalClass(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
