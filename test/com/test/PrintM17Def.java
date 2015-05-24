package com.test;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import org.apache.log4j.Logger;


/**
 * Quitok.
 * Created by Anatoliy on 24.05.2015.
 */
public class PrintM17Def {
    private static final Logger log = Logger.getLogger(PrintM17Def.class);

    @Дано("^форма М-(\\d+) импортирована$")
    public void форма_М_импортирована(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
