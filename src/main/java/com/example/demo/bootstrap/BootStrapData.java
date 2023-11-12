package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        long partCount = outsourcedPartRepository.count() + partRepository.count();
        if(partCount == 0){
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("Engine");
        o.setInv(5);
        o.setPrice(500.0);
        o.setId(100L);
        o.setMaxInv(80);
        o.setMinInv(2);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;

        InhousePart u = new InhousePart();
        u.setName("Set of 4 Wheels");
        u.setInv(15);
        u.setPrice(400.0);
        u.setId(10L);
        u.setMaxInv(100);
        u.setMinInv(4);
        partRepository.save(u);

        OutsourcedPart i= new OutsourcedPart();
        i.setCompanyName("Western Governors University");
        i.setName("Windshield");
        i.setInv(10);
        i.setPrice(200.0);
        i.setId(1L);
        i.setMaxInv(50);
        i.setMinInv(1);
        outsourcedPartRepository.save(i);

        InhousePart h = new InhousePart();
        h.setName("Muffler");
        h.setInv(20);
        h.setPrice(100.0);
        h.setId(11L);
        h.setMaxInv(70);
        h.setMinInv(10);
        partRepository.save(h);

        InhousePart m = new InhousePart();
        m.setName("Roof");
        m.setInv(25);
        m.setPrice(600.0);
        m.setId(12L);
        m.setMaxInv(50);
        m.setMinInv(1);
        partRepository.save(m);
 }
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
        long productCount = productRepository.count();
        if(productCount == 0){
        Product convertible= new Product("Convertible",30000.0,15);
        Product truck= new Product("Truck",15000.0,15);
        Product sedan= new Product("Sedan",10000.0,15);
        Product suv= new Product("Suv",20000.0,15);
        Product sportsCar= new Product("Sports Car",35000.0,15);

        productRepository.save(convertible);
        productRepository.save(truck);
        productRepository.save(sedan);
        productRepository.save(suv);
        productRepository.save(sportsCar);

          }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
