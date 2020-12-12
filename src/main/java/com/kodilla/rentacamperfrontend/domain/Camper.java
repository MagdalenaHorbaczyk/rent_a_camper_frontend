package com.kodilla.rentacamperfrontend.domain;

import java.util.Objects;

/*@Component*/
public class Camper {
    private Long id;
    private int seatsQuantity;
    private int bedsQuantity;
    private  /*BigDecimal*/ String dailyRentPrice;
    /*private List<Equipment> equipmentList;
    private Category category;
    List<Booking> bookingList;*/

    public Camper() {
    }

    public Camper(Long id, int seatsQuantity, int bedsQuantity, /*BigDecimal*/String dailyRentPrice/*, List<Equipment> equipmentList, Category category, List<Booking> bookingList*/) {
        this.id = id;
        this.seatsQuantity = seatsQuantity;
        this.bedsQuantity = bedsQuantity;
        this.dailyRentPrice = dailyRentPrice;
        /*this.equipmentList = equipmentList;
        this.category = category;
        this.bookingList = bookingList;*/
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeatsQuantity() {
        return seatsQuantity;
    }

    public void setSeatsQuantity(int seatsQuantity) {
        this.seatsQuantity = seatsQuantity;
    }

    public int getBedsQuantity() {
        return bedsQuantity;
    }

    public void setBedsQuantity(int bedsQuantity) {
        this.bedsQuantity = bedsQuantity;
    }

    public /*BigDecimal*/String getDailyRentPrice() {
        return dailyRentPrice;
    }

    public void setDailyRentPrice(/*BigDecimal*/String dailyRentPrice) {
        this.dailyRentPrice = dailyRentPrice;
    }

//    public List<Equipment> getEquipmentList() {
//        return equipmentList;
//    }
//
//    public void setEquipmentList(List<Equipment> equipmentList) {
//        this.equipmentList = equipmentList;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
//
//    public List<Booking> getBookingList() {
//        return bookingList;
//    }
//
//    public void setBookingList(List<Booking> bookingList) {
//        this.bookingList = bookingList;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camper camper = (Camper) o;
        if (!id.equals(camper.id)) return false;
        if (!Objects.equals(dailyRentPrice, camper.dailyRentPrice)) return false;
        if (!Objects.equals(bedsQuantity, camper.bedsQuantity)) return false;
        return Objects.equals(seatsQuantity, camper.seatsQuantity);


    }


    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSeatsQuantity(), getBedsQuantity(), getDailyRentPrice());
    }

    @Override
    public String toString() {
        return "Camper{" +
                "id=" + id +
                ", seatsQuantity=" + seatsQuantity +
                ", bedsQuantity=" + bedsQuantity +
                ", dailyRentPrice=" + dailyRentPrice +
//                ", equipmentList=" + equipmentList +
//                ", category=" + category +
//                ", bookingList=" + bookingList +
                '}';
    }
}
