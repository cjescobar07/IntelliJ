package com.syntax.class21.class25_ABSTRACT;

public interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Chrome is opening the window");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome is closing the window");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome is maximizing the window");
    }

    @Override
    public void findElement() {
        System.out.println("Chrome is finding the element");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Firefox is opening the window");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox is closing the window");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox is maximizing the window");
    }

    @Override
    public void findElement() {
        System.out.println("Firefox is finding the element");
    }
}

class Task1 {
    /*
        Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(),
        closeBrowser(),maximizeWindow(), findElement().

        Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        chrome.openBrowser();
        chrome.closeBrowser();
        chrome.maximizeWindow();
        chrome.findElement();

        System.out.println();

        WebDriver firefox = new FirefoxDriver();
        firefox.openBrowser();
        firefox.closeBrowser();
        firefox.maximizeWindow();
        firefox.findElement();

        System.out.println();

        WebDriver[] webDrivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver w : webDrivers){
            w.openBrowser();
            w.findElement();
            w.maximizeWindow();
            w.closeBrowser();

        }
    }
}
