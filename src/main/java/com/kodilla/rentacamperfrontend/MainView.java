package com.kodilla.rentacamperfrontend;

import com.kodilla.rentacamperfrontend.domain.Camper;
import com.kodilla.rentacamperfrontend.service.CamperService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;


@Route/*(value = "")*/
public class MainView extends VerticalLayout {

    private TextField filter = new TextField();

    private CamperService camperService = CamperService.getInstance();
    private Grid grid = new Grid<>(Camper.class);

    public MainView() {
        grid.setColumns("id", "seatsQuantity", "bedsQuantity", "dailyRentPrice");
        setSizeFull();
        filter.setPlaceholder("Filter by dailyRentPrice");
        filter.setClearButtonVisible(true);
        filter.setValueChangeMode(ValueChangeMode.EAGER);
        /*  filter.addValueChangeListener(e -> update());*/
        add(filter, grid);
    }

  /*  private void update() {
        grid.setItems(camperService.findByDailyRentPrice(filter.getValue()));
    }*/

    public void refresh() {
        grid.setItems(camperService.getCampers());
    }
}
