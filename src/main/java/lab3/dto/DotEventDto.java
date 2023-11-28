package lab3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class DotEventDto {
    private List<DotDto> dotList;

    public List<DotDto> getDotList() {
        return dotList;
    }

    public void setDotList(List<DotDto> dotList) {
        this.dotList = dotList;
    }

    public DotEventDto(List<DotDto> dotList) {
        this.dotList = dotList;
    }
}
