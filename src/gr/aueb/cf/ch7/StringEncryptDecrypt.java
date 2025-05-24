package gr.aueb.cf.ch7;

/**
 * Παρέχει λειτουργίες κρυπτογράφησης και αποκρυπτογράφησης αλφαριθμητικών
 * χρησιμοποιώντας τη μέθοδο κρυπτογράφησης Καίσαρα (Caesar cipher).
 * Η κρυπτογράφηση γίνεται μετατοπίζοντας τους χαρακτήρες κατά
 * έναν συγκεκριμένο αριθμό θέσεων στο αλφάβητο.
 *
 * @author A.Polymeros
 * @version 1.0
 */
public class StringEncryptDecrypt {
    /**
     * Κύρια μέθοδος που παρουσιάζει τη λειτουργία των μεθόδων κρυπτογράφησης
     * και αποκρυπτογράφησης.
     *
     * @param args Τα ορίσματα γραμμής εντολών.
     */
    public static void main(String[] args) {

        String encryptedStr = encryptString("alex" , 2);
        System.out.println(encryptedStr);
        String decryptedStr = decryptString(encryptedStr , 2);
        System.out.println(decryptedStr);
    }

    /**
     * Κρυπτογραφεί έναν χαρακτήρα μετατοπίζοντάς τον κατά ένα συγκεκριμένο
     * αριθμό θέσεων στο αλφάβητο.
     *
     * @param c      Ο χαρακτήρας προς κρυπτογράφηση.
     * @param shift  Ο αριθμός των θέσεων μετατόπισης (θετικός για δεξιά μετατόπιση).
     * @return       Τον κρυπτογραφημένο χαρακτήρα.
     */
    public static char charCipher(char c , int shift){
        char cipheredChar;
        int originalNumValue = Character.getNumericValue(c);
        int cipheredNumValue = ((originalNumValue -10 + shift)%26) +10 ;
        cipheredChar = Character.forDigit(cipheredNumValue , Character.MAX_RADIX);
        return  cipheredChar;
    }

    /**
     * Αποκρυπτογραφεί έναν χαρακτήρα μετατοπίζοντάς τον προς την αντίθετη
     * κατεύθυνση κατά ένα συγκεκριμένο αριθμό θέσεων στο αλφάβητο.
     *
     * @param c      Ο χαρακτήρας προς αποκρυπτογράφηση.
     * @param shift  Ο αριθμός των θέσεων μετατόπισης (θετικός για αριστερή μετατόπιση).
     * @return       Τον αποκρυπτογραφημένο χαρακτήρα.
     */
    public static char charDecipher(char c , int shift){
        char decipheredChar;
        int originalNumValue = Character.getNumericValue(c);
        int cipheredNumValue = ((originalNumValue -10 - shift)%26) +10 ;
        decipheredChar = Character.forDigit(cipheredNumValue , Character.MAX_RADIX);
        return  decipheredChar;
    }

    /**
     * Κρυπτογραφεί ένα αλφαριθμητικό εφαρμόζοντας την κρυπτογράφηση
     * σε κάθε χαρακτήρα ξεχωριστά.
     *
     * @param s      Το αλφαριθμητικό προς κρυπτογράφηση.
     * @param shift  Ο αριθμός των θέσεων μετατόπισης για κάθε χαρακτήρα.
     * @return       Το κρυπτογραφημένο αλφαριθμητικό.
     */
    public static String encryptString(String s, int shift){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() ; i++) {
            char originalCh = s.charAt(i);
            char cipheredCh = charCipher(originalCh , shift);
            sb.append(cipheredCh);
        }
        return sb.toString();
    }

    /**
     * Αποκρυπτογραφεί ένα αλφαριθμητικό εφαρμόζοντας την αποκρυπτογράφηση
     * σε κάθε χαρακτήρα ξεχωριστά.
     *
     * @param s      Το αλφαριθμητικό προς αποκρυπτογράφηση.
     * @param shift  Ο αριθμός των θέσεων μετατόπισης για κάθε χαρακτήρα.
     * @return       Το αποκρυπτογραφημένο αλφαριθμητικό.
     */
    public static String decryptString(String s, int shift){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() ; i++) {
            char originalCh = s.charAt(i);
            char cipheredCh = charDecipher(originalCh , shift);
            sb.append(cipheredCh);
        }
        return sb.toString();
    }
}