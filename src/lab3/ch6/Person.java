package lab3.ch6;

public final class Person {
    private final String name;
    private final String job;
    private final String university;
    private final String drivingLicense;
    private final boolean isMaried;

    public Person(Builder builder) {
        this.name = builder.name;
        this.isMaried = builder.isMaried;
        this.drivingLicense = builder.drivingLicense;
        this.university = builder.university;
        this.job = builder.job;
    }

    public static class Builder {
        private String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMaried;

        public Builder newInstance() {
            return new Builder();
        }

        Builder() { }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setDrivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder setIsMaried(boolean isMaried) {
            this.isMaried = isMaried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", isMaried=" + isMaried +
                '}';
    }
}
