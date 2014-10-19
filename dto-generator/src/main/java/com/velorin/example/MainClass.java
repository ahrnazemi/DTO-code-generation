/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.velorin.example;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.codemodel.JClassAlreadyExistsException;
import com.velorin.codegenerator.DTOUtilGenerator;

/**
 * 
 * @author AhmadReza Nazemi
 */
public class MainClass {

	public static void main(String[] args) {
		try {

			DTOUtilGenerator dtog = new DTOUtilGenerator();
			String destPath = System.getProperty("user.dir") + "/src/main/java";
			String classPath = MainClass.class.getPackage().getName();
			dtog.generateDTOClass(classPath
					+ ".entity", classPath
					+ ".dto", destPath);

		} catch (JClassAlreadyExistsException ex) {
			Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null,
					ex);
		} catch (IOException ex) {
			Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null,
					ex);
		}
	}
}
