/*
 * Copyright (c) 2014 Andrew Fontaine, James Finlay, Jesse Tucker, Jacob Viau, and Evan DeGraff
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package ca.ippetad.geerweekapp.model;

import android.graphics.Paint;

import java.util.HashMap;

/**
 * @author Andrew Fontaine
 * @version 1.0
 * @since 09/02/14
 */
public class ClubCapturable {
    public static String PRESIDENT = "president";
    public static String PRREP = "prrep";
    public static String FLAG = "flag";

    private HashMap<String, Capturable> Capturables;
    private String name;
    
    public ClubCapturable(Capturable flag, Capturable prez, Capturable prrep, String name) {
        Capturables = new HashMap<String, Capturable>();
        Capturables.put("flag", flag);
        Capturables.put("president", prez);
        Capturables.put("prrep", prrep);
        this.name = name;
    }

    public HashMap<String, Capturable> getCapturables() {
        return Capturables;
    }

    public void setCapturables(HashMap<String, Capturable> capturables) {
        Capturables = capturables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
