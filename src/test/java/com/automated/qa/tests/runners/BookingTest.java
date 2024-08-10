package com.automated.qa.tests.runners;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.automated.qa.pages.HomePage;
import com.automated.qa.pages.SearchResultsPage;
import com.automated.qa.pages.BookingPage;
import com.automated.qa.pages.PaymentPage;

@RunWith(SerenityRunner.class)
public class BookingTest {

    @Steps
    HomePage homePage;

    @Steps
    SearchResultsPage searchResultsPage;

    @Steps
    BookingPage bookingPage;

    @Steps
    PaymentPage paymentPage;

    @Test
    public void realizarReserva() {
        // Abrir la página principal de Despegar
        homePage.open();

        // Seleccionar una opción de búsqueda aleatoria (Alojamiento, Vuelo o Paquete)
        homePage.seleccionarOpcionAleatoria();

        // Realizar la búsqueda con datos predefinidos
        homePage.realizarBusqueda("Bogotá", "2024-09-01", "2024-09-10");

        // Seleccionar un resultado cuyo precio esté por debajo del presupuesto
        searchResultsPage.seleccionarResultadoPorPrecio(500000);

        // Diligenciar la información personal requerida
        bookingPage.diligenciarInformacionPersonal("Juan", "Pérez", "juan.perez@gmail.com");

        // Diligenciar los datos de pago con tarjeta de crédito
        paymentPage.diligenciarDatosPago("4111111111111111", "Juan Pérez", "12/25", "123");
    }
}
