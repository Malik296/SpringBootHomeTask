package az.pashabankgroup.demo.impl.cpu;


import az.pashabankgroup.demo.interfaces.CPU;

public class IntelCpuImpl implements CPU {
    @Override
    public String cpuInfo() {
        return "Cores: 4 Threads: 8 Max: 4.00 Gh ";
    }
}
