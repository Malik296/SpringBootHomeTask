package az.pashabankgroup.demo.model;


import az.pashabankgroup.demo.impl.cpu.AmpdCpuImpl;
import az.pashabankgroup.demo.impl.cpu.IntelCpuImpl;
import az.pashabankgroup.demo.impl.display.LgDisplayImpl;
import az.pashabankgroup.demo.impl.display.SamsungDisplayImpl;
import az.pashabankgroup.demo.impl.gpu.AmdGpuImpl;
import az.pashabankgroup.demo.impl.gpu.NvidiaGpuImpl;
import az.pashabankgroup.demo.impl.notebook.NotebookImpl;
import az.pashabankgroup.demo.interfaces.CPU;
import az.pashabankgroup.demo.interfaces.Display;
import az.pashabankgroup.demo.interfaces.GPU;
import az.pashabankgroup.demo.interfaces.Notebook;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotebookModel {
    private CPU cpu;
    private GPU gpu;
    private Display display;
    private String name;

    @Bean
    public Notebook model1() {
        cpu = new AmpdCpuImpl();
        gpu = new AmdGpuImpl();
        display = new LgDisplayImpl();
        name = "Model 1";
        return new NotebookImpl(name, cpu, gpu, display);
    }

    @Bean
    public Notebook model2() {
        cpu = new IntelCpuImpl();
        gpu = new NvidiaGpuImpl();
        display = new SamsungDisplayImpl();
        name = "Model 2";
        return new NotebookImpl(name, cpu, gpu, display);
    }

}
