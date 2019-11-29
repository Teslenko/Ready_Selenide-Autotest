package org.selenide.Google;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import com.codeborne.selenide.Configuration;
import org.junit.rules.TestRule;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Condition.text;

public class GoogleSearchFieldInMainPage {


    @Test
    public void GoogleSearchField() throws InterruptedException { //Created metod test1


        open("https://www.google.com.ua");                		   // Open page
        $(by("type", "text")).val("It School Netology").pressEnter();    //Enter Text
        $$("#res .g").shouldHave(size(10));
        $((".pcbdac")).shouldHave(text("Netology - официальный сайт | Университет..."));
    }
    @Before
    public void before(){
        Configuration.startMaximized = false;
        Configuration.reportsFolder = "target/surefire-reports";
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
        Configuration.holdBrowserOpen = true;
    }
   }




//
//    git init
//    git add README.md
//        git commit -m "first commit"
//        git remote add origin https://github.com/Teslenko/Ready_Selenide-Autotest.git
//        git push -u origin master