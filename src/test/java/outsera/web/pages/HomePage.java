package outsera.web.pages;

import org.openqa.selenium.By;

public class HomePage {

    By listaProdutos = By.id("inventory_container");
    By botaoMenu = By.id("react-burger-menu-btn");
    By botaoLogout = By.id("logout_sidebar_link");
    By addToCartBackPack = By.id("add-to-cart-sauce-labs-backpack");
    By linkCarrinho = By.id("shopping_cart_container");

    public By getListaProdutos() {
        return listaProdutos;
    }

    public By getBotaoMenu() {
        return botaoMenu;
    }

    public By getBotaoLogout() {
        return botaoLogout;
    }

    public By getAddToCartBackPack() {
        return addToCartBackPack;
    }

    public By getLinkCarrinho() {
        return linkCarrinho;
    }
}
