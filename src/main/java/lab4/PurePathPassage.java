package lab4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurePathPassage {

    private int id; // Сис Идентификатор

    private String name; // Имя

    private int length; // Длина Пути Перегона

    private String constructionDate; // Дата постройки Перегон

    private String stationName1; // Одна станция

    private String stationName2; // Следующая станция

    private int countWay; // количество путей

}
