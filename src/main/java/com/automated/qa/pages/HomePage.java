package com.automated.qa.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By alojamientoButton = By.xpath("//label[contains(text(),'Alojamientos')]");
    private By vuelosButton = By.xpath("//label[contains(text(),'Vuelos')]");
    private By paquetesButton = By.xpath("//label[contains(text(),'Paquetes')]");

    public void seleccionarOpcionAleatoria() {
        int opcion = (int)(Math.random() * 3);
        switch (opcion) {
            case 0:
                $(alojamientoButton).click();
                break;
            case 1:
                $(vuelosButton).click();
                break;
            case 2:
                $(paquetesButton).click();
                break;
        }
    }

    public void realizarBusqueda(String destino, String fechaIda, String fechaVuelta) {
        // Código para diligenciar los campos de búsqueda y hacer clic en buscar
    }
}
