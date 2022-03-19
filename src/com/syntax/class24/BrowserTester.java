package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
        /*GoogleChrome chrome = new GoogleChrome();
        chrome.openBrowser();
        chrome.loadPage("www.google.com");
        chrome.testThePage();
        chrome.closeBrowser();

        FireFox fireFox = new FireFox();
        fireFox.openBrowser();
        fireFox.loadPage("www.fireFox.com");
        fireFox.testThePage();
        fireFox.closeBrowser();

        Safari safari = new Safari();
        safari.openBrowser();
        safari.loadPage("www.safari.com");
        safari.testThePage();
        safari.closeBrowser();

        InternetExplorer iE = new InternetExplorer();
        iE.openBrowser();
        iE.loadPage("www.iE.com");
        iE.testThePage();
        iE.closeBrowser();
        */

        Browser[] browser = {new GoogleChrome(), new FireFox(), new Safari(), new InternetExplorer()};
        for(Browser b : browser){
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }

        Object s = new String();
        Object zz = new GoogleChrome();
    }
}
