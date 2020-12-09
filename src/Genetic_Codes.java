import java.util.Scanner;

public class Genetic_Codes {
    public static void main(String[] args) {
        boolean open = true;
        while(open) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Write the genetic code ");

            String Genetic = myObj.nextLine().toUpperCase();
            switch (Genetic) {
                case "AUG" -> System.out.println("Met");
                case "UGG" -> System.out.println("Trp");
                case "AAU", "AAC" -> System.out.println("Asn");
                case "GAU", "GAC" -> System.out.println("Asp");
                case "UGU", "UGC" -> System.out.println("Cys");
                case "CAA", "CAG" -> System.out.println("Gln");
                case "GAA", "GAG" -> System.out.println("Glu");
                case "AAA", "AAG" -> System.out.println("Lys");
                case "CAU", "CAC" -> System.out.println("His");
                case "UUU", "UUC" -> System.out.println("Phe");
                case "UAU", "UAC" -> System.out.println("Tyr");
                case "AUU", "AUC", "AUA" -> System.out.println("Ile");
                case "GCU", "GCC", "GCA", "GCG" -> System.out.println("Ala");
                case "GGU", "GGC", "GGA", "GGG" -> System.out.println("Gly");
                case "CCU", "CCC", "CCA", "CCG" -> System.out.println("Pro");
                case "ACU", "ACC", "ACA", "ACG" -> System.out.println("Thr");
                case "GUU", "GUC", "GUA", "GUG" -> System.out.println("Val");
                case "CGU", "CGC", "CGA", "CGG", "AGA", "AGG" -> System.out.println("Arg");
                case "UUA", "UUG", "CUU", "CUC", "CUA", "CUG" -> System.out.println("Leu");
                case "UCU", "UCC", "UCA", "UCG", "AGU", "AGC" -> System.out.println("Ser");
                case "UAA", "UAG", "UGA" -> System.out.println("Stop");

                case "MET" -> System.out.println("AUG");
                case "TRP" -> System.out.println("UGG");
                case "ASN" -> System.out.println("AAU, AAC");
                case "ASP" -> System.out.println("GAU, GAC");
                case "CYS" -> System.out.println("UGU, UGC");
                case "GLN" -> System.out.println("CAA, CAG");
                case "GLU" -> System.out.println("GAA, GAG");
                case "LYS" -> System.out.println("AAA, AAG");
                case "HIS" -> System.out.println("CAU, CAC");
                case "PHE" -> System.out.println("UUU, UUC");
                case "TYR" -> System.out.println("UAU, UAC");
                case "ILE" -> System.out.println("AUU, AUC, AUA");
                case "ALA" -> System.out.println("GCU, GCC, GCA, GCG");
                case "GLY" -> System.out.println("GGU, GGC, GGA, GGG");
                case "PRO" -> System.out.println("CCU, CCC, CCA, CCG");
                case "THR" -> System.out.println("ACU, ACC, ACA, ACG");
                case "VAL" -> System.out.println("GUU, GUC, GUA, GUG");
                case "ARG" -> System.out.println("CGU, CGC, CGA, CGG, AGA, AGG");
                case "LEU" -> System.out.println("UUA, UUG, CUU, CUC, CUA, CUG");
                case "SER" -> System.out.println("UCU, UCC, UCA, UCG, AGU, AGC");

                case "STOP" -> open = false;
            }
            System.out.println(" ");

        }
    }
}
