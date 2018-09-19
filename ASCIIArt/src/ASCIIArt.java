/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

public class ASCIIArt {
	public static void main (String[] args) {
		System.out.print("\t  This is my\n");
		System.out.print("\t  skyscraper.\n");
		System.out.println("");
		topCeiling();
		blankFloor();
		fullLines();
		fullLines();
		fullLines();
		windowPanes();
		dashedLines();
		fullLines();
		fullLines();
		windowPanes();
		windowPanes();
		windowPanes();
		dashedLines();
		blankFloor();
		fullLines();
		windowPanes();
		windowPanes();
		dashedLines();
		fullLines();
		windowPanes();
		dashedLines();
		fullLines();
		windowPanes();
		windowPanes();
		dashedLines();
		blankFloor();
		fullLines();
		windowPanes();
		dashedLines();
		blankFloor();
		fullLines();
		windowPanes();
		windowPanes();
		windowPanes();
		dashedLines();
		fullLines();
		fullLines();
		System.out.println("  /                         \\");
		System.out.println(" /                           \\");
		System.out.println("|                             |");
		System.out.println("|_____________________________|");
	}

	public static void windowPanes() {
		System.out.println("   |+|+|+|+|+|+|+|+|+|+|+|+|");
	}
	
	public static void dashedLines () {
		System.out.println("   |-----------------------|");
	}
	
	public static void fullLines() {
		System.out.println("   |_______________________|");
	}
	
	public static void blankFloor () {
		System.out.println("   |                       |");
	}
	
	public static void topCeiling() {
		System.out.println("        _______________");
		System.out.println("       /               \\");
		System.out.println("      /                 \\");
		System.out.println("     /                   \\");
		System.out.println("    /                     \\");
	}
}
    