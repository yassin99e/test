package ma.ensa.multiple_dbs.Controllers;


import ma.ensa.multiple_dbs.primary.entity.PrimaryEntity;
import ma.ensa.multiple_dbs.primary.repository.PrimaryRepository;
import ma.ensa.multiple_dbs.secondary.entity.SecondaryEntity;
import ma.ensa.multiple_dbs.secondary.repository.SecondaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {
    @Autowired
    private PrimaryRepository primaryRepository;

    @Autowired
    private SecondaryRepository secondaryRepository;

    @GetMapping("/test")
    public String test(){
        PrimaryEntity p1=new PrimaryEntity();
        p1.setName("yassine");p1.setAge(21);
        primaryRepository.save(p1);

        SecondaryEntity p2=new SecondaryEntity();
        p2.setEmail("ybenakki06@gmail.com");
        secondaryRepository.save(p2);
        return "users registered successfully";

    }
}
