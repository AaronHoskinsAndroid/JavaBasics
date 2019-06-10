package examples.aaronhoskins.com.javabasics.DesignPatterns;

import java.util.Locale;

public final class PostalLabel {
    private final String name;
    private final String address;
    private final String city;
    private final String state;
    private final String zip;

    public PostalLabel(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.city = builder.city;
        this.state = builder.state;
        this.zip = builder.zip;
    }

    public void printPostalLabel() {
        System.out.println(name);
        System.out.println(address);
        System.out.println(String.format(Locale.US, "%s, %s %s", city, state, zip));
    }


    public static class Builder{
        private String name;
        private String address;
        private String city;
        private String state;
        private String zip;

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setZip(String zip) {
            this.zip = zip;
            return this;
        }

        public PostalLabel build(){
            return new PostalLabel(this);
        }
    }
}
