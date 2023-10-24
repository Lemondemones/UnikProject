package lab3.utils;


import lab3.dto.DotDto;

public final class DistanceCounter {
    
    public static double countDistance(DotDto dto1, DotDto dto2) {
        return Math.sqrt(Math.pow((dto2.getX() - dto1.getX()), 2)
                + Math.pow((dto2.getY() - dto1.getY()), 2));
    }
}
