package lab3.service;

import jakarta.enterprise.inject.Default;
import jdk.jfr.Event;
import lab3.annotation.DescriptionDot;

import java.util.ArrayList;
import java.util.List;

@Default
public class DotService {

    private final List<DescriptionDot> dotList;
    private final Event<DescriptionDot> events;


    public DotService() {
        this.dotList = new ArrayList<>();
    }

    public void idk(DescriptionDot dot) {
        dotList.add(dot);
    }
}
