package az.pashabankgroup.demo.impl.gpu;


import az.pashabankgroup.demo.interfaces.GPU;

public class AmdGpuImpl implements GPU {
    @Override
    public String gpuInfo() {
        return "Model: AMD Radeon RX580 Memory: 8 gb";
    }
}
