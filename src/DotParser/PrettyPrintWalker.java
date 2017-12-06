/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DotParser;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;

/**
 *
 * @author seelyv
 */
public class PrettyPrintWalker {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        ANTLRInputStream stream = new ANTLRInputStream("");
        System.out.println("Please enter Dot code");
        DOTLexer temp = new DOTLexer( stream);
    }
}
