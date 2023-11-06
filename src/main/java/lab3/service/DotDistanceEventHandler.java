package lab3.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.Default;
import lab3.annotation.DistanceEvent;
import lab3.annotation.PerimeterEvent;
import lab3.dto.DotDto;
import lab3.dto.DotEventDto;
import lab3.utils.DistanceCounter;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class DotDistanceEventHandler {
    
    private static  String DELIMITER = "===============================";
    
    private static  String DEFAULT_PREFIX = "Lowest distance: ";
    
    public void lowestDistance(@Observes @DistanceEvent DotEventDto dto) {
        System.out.println(DELIMITER);
        if (dto == null || dto.getDotList() == null || dto.getDotList().size() < 2) {
            System.out.println(DEFAULT_PREFIX + 0);
            return;
        }
        
        List<DotDto> dotList = dto.getDotList();
        List<Double> dotDistancesSum = new ArrayList<>();
        for (int i = 0; i < dotList.size(); i++) {
            double sum = 0;
            for (int j = 0; j < dotList.size(); j++) {
                if (j != i) {
                    sum += DistanceCounter.countDistance(dotList.get(i), dotList.get(j));
                }
            }
            
            dotDistancesSum.add(sum);
        }
        
        System.out.println("Distance array: " + dotDistancesSum);
        System.out.println(DEFAULT_PREFIX + dotDistancesSum.stream().sorted().findFirst().get());
        System.out.println(DELIMITER);
    }
}
