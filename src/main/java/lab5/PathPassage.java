package lab5;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@MyConstraint
public class PathPassage {

    @Positive(message = "ID должен быть > 0")
    private int id; // Сис Идентификатор
    @NotBlank(message = "Имя не может быть пустым")
    private String name; // Имя
    @Range(min = 50, max = 2000, message = "Длина от 50м до 2000м")
    private int length; // Длина Пути Перегона
    @Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{4}", message = "Неверная дата, формат даты: dd-MM-yyyy" ) // dd-MM-yyyy регулярные выражения
    private String constructionDate; // Дата постройки Перегон
    @Size(min = 4, max = 10, message = "Кол-во символов от 4-10")
    private String stationName1; // Одна станция
    @Size(min = 4, max = 10, message = "Кол-во символов от 4-10")
    private String stationName2; // Следующая станция
    @Min(value = 1, message = "Кол-во путей должно больше 1")
    private int countWay; // количество путей
    private List<Block> blocks = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getConstructionDate() {
        return constructionDate;
    }

    public void setConstructionDate(String constructionDate) {
        this.constructionDate = constructionDate;
    }

    public String getStationName1() {
        return stationName1;
    }

    public void setStationName1(String stationName1) {
        this.stationName1 = stationName1;
    }

    public String getStationName2() {
        return stationName2;
    }

    public void setStationName2(String stationName2) {
        this.stationName2 = stationName2;
    }

    public int getCountWay() {
        return countWay;
    }

    public void setCountWay(int countWay) {
        this.countWay = countWay;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }
}
