package com.test;

import cucumber.api.PendingException;
import cucumber.api.java.ru.То;
import org.apache.log4j.Logger;


/**
 * Quitok.
 * Created by Anatoliy on 24.05.2015.
 */
public class MyStepdefs {
    private static final Logger log = Logger.getLogger(MyStepdefs.class);

    @То("^форма М-(\\d+) выводится на печать$")
    public void форма_М_выводится_на_печать(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
