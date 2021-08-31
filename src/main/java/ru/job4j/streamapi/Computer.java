package ru.job4j.streamapi;

public class Computer {
    private String model;
    private String cpu;
    private int cpuFrequncy;
    private int ram;
    private String ramType;
    private int ramFrequncy;

    @Override
    public String toString() {
        return "Computer{"
                + "model='" + model + '\''
                + ", cpu='" + cpu + '\''
                + ", cpuFrequncy=" + cpuFrequncy
                + ", ram=" + ram
                + ", ramType='" + ramType + '\''
                + ", ramFrequncy=" + ramFrequncy
                + '}';
    }

    static class Builder {
        private String model;
        private String cpu;
        private int cpuFrequncy;
        private int ram;
        private String ramType;
        private int ramFrequncy;

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        Builder buildCpuFrequncy(int cpuFrequncy) {
            this.cpuFrequncy = cpuFrequncy;
            return this;
        }

        Builder buildRam(int ram) {
            this.ram = ram;
            return this;
        }

        Builder buildRamType(String ramType) {
            this.ramType = ramType;
            return this;
        }

        Builder buildRamFrequncy(int ramFrequncy) {
            this.ramFrequncy = ramFrequncy;
            return this;
        }

        Computer build() {
            Computer comp = new Computer();
            comp.cpu = cpu;
            comp.ram = ram;
            comp.cpuFrequncy = cpuFrequncy;
            comp.model = model;
            comp.ramFrequncy = ramFrequncy;
            comp.ramType = ramType;
            return comp;
        }
    }

    public static void main(String[] args) {
        Computer computer = new Builder().buildModel("a384")
                .buildCpu("iCore 3")
                .buildCpuFrequncy(2666)
                .buildRam(4000)
                .buildRamType("DDR3")
                .buildRamFrequncy(2666)
                .build();
        System.out.println(computer);
    }
}
