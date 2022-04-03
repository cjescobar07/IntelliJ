package com.syntax.class23_METHOD_OVERLOADING.class24_METHOD_OVERRIDDING;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String webLink){
        System.out.println("loading the website " + webLink);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}

class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the GoogleChrome browser");
    }
    void loadPage(String webLink){
        System.out.println("loading the website " + webLink + " in GoogleChrome");
    }
    void testThePage(){
        System.out.println("Testing the page in GoogleChrome");
    }
    void closeBrowser(){
        System.out.println("Closing the GoogleChrome browser");
    }
}

class FireFox extends Browser {
    void openBrowser() {
        System.out.println("Opening the FireFox browser");
    }

    void loadPage(String webLink) {
        System.out.println("loading the website " + webLink + " in FireFox");
    }
    void testThePage() {
        System.out.println("Testing the page in FireFox");
    }
    void closeBrowser() {
        System.out.println("Closing the FireFox browser");
    }
}

class Safari extends Browser {
    void openBrowser() {
        System.out.println("Opening the Safari browser");
    }
    void loadPage(String webLink) {
        System.out.println("loading the website " + webLink + " in Safari");
    }
    void testThePage() {
        System.out.println("Testing the page in Safari");
    }
    void closeBrowser() {
        System.out.println("Closing the Safari browser");
    }
}

class InternetExplorer extends Browser {
    void openBrowser() {
        System.out.println("Opening the InternetExplorer browser");
    }
    void loadPage(String webLink) {
        System.out.println("loading the website " + webLink + " in InternetExplorer");
    }
    void testThePage() {
        System.out.println("Testing the page in InternetExplorer");
    }
    void closeBrowser() {
        System.out.println("Closing the InternetExplorer browser");
    }
}



