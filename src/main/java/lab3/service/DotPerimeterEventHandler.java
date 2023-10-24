package lab3.service;

import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.Default;
import lab3.annotation.PerimeterEvent;
import lab3.dto.DotDto;
import lab3.dto.DotEventDto;
import lab3.utils.DistanceCounter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Default
public class DotPerimeterEventHandler {
    
    private static final String DELIMITER = "===============================";
    
    private static final String DEFAULT_PREFIX = "Biggest perimeter: ";
    
    public void biggestPerimeter(@Observes @PerimeterEvent DotEventDto dto) {
        System.out.println(DELIMITER);
        if (dto == null || dto.getDotList() == null || dto.getDotList().size() < 3) {
            System.out.println(DEFAULT_PREFIX + 0);
            return;
        }
        
        List<DotDto> dotList = dto.getDotList();
        List<Double> perimeterList = new ArrayList<>();
        for (int i = 0; i < dotList.size(); i++) {
        
            for (int j = 0; j < dotList.size(); j++) {
                if (j == i) {
                    continue;
                }
                
                for (int k = 0; k < dotList.size(); k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    double perimeter = countPerimeter(dotList.get(i), dotList.get(j), dotList.get(k));
                    perimeterList.add(perimeter);
                }
            }
        }
        
        System.out.println("Perimeter array: " + perimeterList);
        System.out.println(DEFAULT_PREFIX + perimeterList.stream().sorted(Comparator.reverseOrder()).findFirst().get());
        System.out.println(DELIMITER);
    }
    
    private double countPerimeter(DotDto dto1, DotDto dto2, DotDto dto3) {
        return DistanceCounter.countDistance(dto1, dto2) + DistanceCounter.countDistance(dto2, dto3) + DistanceCounter.countDistance(dto3, dto1);
    }
}
