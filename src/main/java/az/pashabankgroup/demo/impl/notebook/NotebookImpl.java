package az.pashabankgroup.demo.impl.notebook;


import az.pashabankgroup.demo.interfaces.CPU;
import az.pashabankgroup.demo.interfaces.Display;
import az.pashabankgroup.demo.interfaces.GPU;
import az.pashabankgroup.demo.interfaces.Notebook;

public class NotebookImpl implements Notebook {
    private CPU cpu;
    private GPU gpu;
    private Display display;
    private String name;

    public NotebookImpl() {
    }


    public NotebookImpl(String name, CPU cpu, GPU gpu, Display display) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.display = display;
        this.name = name;
    }

    @Override
    public void specification() {
        System.out.println("Notebook Specifications: " + name);
        System.out.println(cpu.cpuInfo());
        System.out.println(gpu.gpuInfo());
        System.out.println(display.displayInfo());
    }
}
