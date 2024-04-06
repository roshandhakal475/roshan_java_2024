public class Grade_ch2_pr1 {
    public static void main(String[] args) {
        char grade = 'B';
        grade=(char)(grade+8);
        System.out.println(grade);

        // Decrypting the grade
        grade = (char)(grade-8);
        System.out.println(grade);
    }
}
