package HotDeal.HotDeal.Controller;

import HotDeal.HotDeal.Domain.Tutorial;
import HotDeal.HotDeal.Repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("test")
@RequiredArgsConstructor
public class TutorialController {

    //private final TutorialService tutorialService;
    TutorialRepository tutorialRepository;

    @PostMapping("/tutorials") //create
    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
        try {
            Tutorial _tutorial = tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), false));
            return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
