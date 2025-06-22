package org.aston.module_five;

public class Builder {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .build();
    }
}

class Computer {
    private String CPU;
    private String RAM;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
    }

    public static class Builder {
        private String CPU;
        private String RAM;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}