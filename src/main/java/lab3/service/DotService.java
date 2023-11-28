package lab3.service;

import jakarta.enterprise.event.Event;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import lab3.annotation.DistanceEvent;
import lab3.annotation.PerimeterEvent;
import lab3.dto.DotDto;
import lab3.dto.DotEventDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Default
public class DotService {

    private  List<DotDto> dotList = new ArrayList<>();
    @Inject
    @DistanceEvent
    private  Event<DotEventDto> distanceEvents;
    @Inject
    @PerimeterEvent
    private  Event<DotEventDto> perimeterEvents;

    public void addDot(DotDto dot) {
        dotList.add(dot);
        
        distanceEvents.fire(new DotEventDto(dotList));
        perimeterEvents.fire(new DotEventDto(dotList));
    }
    
    public void removeDot(DotDto dot) {
        boolean result = dotList.removeIf(item -> dot.getX() == item.getX() && dot.getY() == item.getY());
        
        if (!result) {
            throw new IllegalArgumentException("Объект не найден");
        }
        
        distanceEvents.fire(new DotEventDto(dotList));
        perimeterEvents.fire(new DotEventDto(dotList));
    }
}
