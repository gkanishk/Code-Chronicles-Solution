import java.util.Scanner;
 class FileName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             String input = scanner.nextLine();
        int indexOfLastBackslash = input.lastIndexOf('\\');
        int indexOfDot = input.lastIndexOf('.');
        String outputPath = input.substring(0, indexOfLastBackslash + 1);
        String fileName = input.substring(indexOfLastBackslash + 1, indexOfDot);
        String extension = input.substring(indexOfDot + 1);
        System.out.println("Path: " + outputPath);
        System.out.println("File Name: " + fileName);
        System.out.println("Extension: " + extension);
    }
}