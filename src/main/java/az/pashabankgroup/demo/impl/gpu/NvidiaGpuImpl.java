package az.pashabankgroup.demo.impl.gpu;


import az.pashabankgroup.demo.interfaces.GPU;

public class NvidiaGpuImpl implements GPU {

    @Override
    public String gpuInfo() {
        return "Model: Nvidia GTX 1060 Memory: 8 gb";
    }
}
