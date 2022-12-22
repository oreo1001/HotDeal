package HotDeal.HotDeal.Service;

import HotDeal.HotDeal.Domain.Product2;
import HotDeal.HotDeal.Repository.ProductsRepository2;
import HotDeal.HotDeal.Repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TutorialService {

    private final TutorialRepository tutoRepo;

}