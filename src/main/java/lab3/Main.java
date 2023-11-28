package lab3;


import lab3.dto.DotDto;
import lab3.service.DotService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    public static void main( String[] args ) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize(); // контейнер
        DotService dotService = container.instance().select(DotService.class).get();
        
        
        dotService.addDot(new DotDto(1, 2));
        dotService.addDot(new DotDto(1, 3));
        dotService.addDot(new DotDto(1, 4));
        
        DotDto example = new DotDto(1, 20);
        dotService.addDot(example);
        dotService.removeDot(example);
    }
}
