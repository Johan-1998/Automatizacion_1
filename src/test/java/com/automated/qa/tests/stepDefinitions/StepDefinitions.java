package com.automated.qa.tests.stepDefinitions;

import com.automated.qa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    HomePage homePage;
    SearchResultsPage searchResultsPage;
    BookingPage bookingPage;
    PaymentPage paymentPage;

    @Given("el usuario esta en la pagina principal de Despegar")
    public void elUsuarioEstaEnLaPaginaPrincipalDeDespegar() {
        homePage.open();
    }

    @When("selecciona una opcion de busqueda aleatoria")
    public void seleccionaUnaOpcionDeBusquedaAleatoria() {
        homePage.seleccionarOpcionAleatoria();
    }

    @And("ingresa los datos de busqueda y realiza la busqueda")
    public void ingresaLosDatosDeBusqueda() {
        homePage.realizarBusqueda("Bogotá", "2024-09-01", "2024-09-10");
    }

    @Then("selecciona un resultado cuyo precio esta por debajo del presupuesto")
    public void seleccionaUnResultadoPorDebajoDelPresupuesto() {
        searchResultsPage.seleccionarResultadoPorPrecio(500000);
    }

    @And("diligencia toda la informacion personal y de pago requerida")
    public void diligenciaInformacionPersonalYPago() {
        bookingPage.diligenciarInformacionPersonal("Juan", "Pérez", "juan.perez@gmail.com");
        paymentPage.diligenciarDatosPago("4111111111111111", "Juan Pérez", "12/25", "123");
    }
}
