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

@Default
public class DotService {

    private final List<DotDto> dotList;
    private final Event<DotEventDto> distanceEvents;
    private final Event<DotEventDto> perimeterEvents;
    
    
    @Inject
    public DotService(@DistanceEvent Event<DotEventDto> events, @PerimeterEvent Event<DotEventDto> perimeterEvents) {
        this.dotList = new ArrayList<>();
        this.distanceEvents = events;
        this.perimeterEvents = perimeterEvents;
    }
    
    public void addDot(DotDto dot) {
        dotList.add(dot);
        
        distanceEvents.fire(new DotEventDto(dotList));
        perimeterEvents.fire(new DotEventDto(dotList));
    }
}
