package lab4;


import lombok.Data;


public class PurePathPassage {

    private int id; // Сис Идентификатор

    private String name; // Имя

    private int length; // Длина Пути Перегона

    private String constructionDate; // Дата постройки Перегон

    private String stationName1; // Одна станция

    private String stationName2; // Следующая станция

    private int countWay; // количество путей

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
}
