package lab3;

import jakarta.enterprise.event.Event;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.Default;
import lab3.annotation.Add;
import lab3.annotation.DescriptionDot;

@Default
public class FuckingEventListener {

    public void idk(@Observes @Add Event<DescriptionDot> event) {

    }
}
