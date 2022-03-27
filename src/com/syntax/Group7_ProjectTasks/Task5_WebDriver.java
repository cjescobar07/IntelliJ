package com.syntax.Group7_ProjectTasks;

public class Task5_WebDriver {
    public static void main(String[] args) {
        RemoteWebDriver[] remoteWebDrivers = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
        for (RemoteWebDriver print : remoteWebDrivers) {
            print.open();
            print.navigate();
            print.getTitle();
            print.getScreenshot();
            print.close();
        }
    }
}

interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakeScreeShots {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakeScreeShots {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {


    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}

class FireFoxDriver implements RemoteWebDriver {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}