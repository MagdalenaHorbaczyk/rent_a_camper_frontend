package com.kodilla.rentacamperfrontend.service;

import com.kodilla.rentacamperfrontend.domain.Camper;

import java.util.HashSet;
import java.util.Set;

/*@Service*/
public class CamperService {

    private static CamperService camperService;
    private Set campers;

    private CamperService() {
        this.campers = exampleData();
    }

    public static CamperService getInstance() {
        if (camperService == null) {
            camperService = new CamperService();
        }
        return camperService;
    }

    public Set getCampers() {
        return new HashSet<>(campers);
    }

    public void addCamper(Camper camper) {
        this.campers.add(camper);
    }

 /*   public Set findByDailyRentPrice(String dailyRentPrice) {
        return campers.stream().filter(camper -> {
            return camper.getDailyRentPrice().contains(dailyRentPrice);
        }).collect(Collectors.toSet());
    }*/

    private Set exampleData() {
        Set campers = new HashSet<>();
        campers.add(new Camper(1L, 6, 6, /*new BigDecimal(350)*/"350"));
        campers.add(new Camper(2L, 8, 6, /*new BigDecimal(450)*/"450"));
//        campers.add(new Camper(3L, 4, 4, new BigDecimal(500)));
//        campers.add(new Camper(4L, 2, 6, new BigDecimal(400)));
//        campers.add(new Camper(5L, 6, 4, new BigDecimal(550)));
//        campers.add(new Camper(6L, 7, 6, new BigDecimal(600)));
//        campers.add(new Camper(7L, 5, 5, new BigDecimal(650)));
        return campers;
    }
}

