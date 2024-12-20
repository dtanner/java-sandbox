// Example of a simplified Java file that doesn't require public static void main(String[] args) nor a Class
// Prerequisites: JDK 21 or higher

// Note that you currently CANNOT compile and run this in a single step like you can with ClassicMain.java
// Alleged Usage:
// javac --release 21 --enable-preview ModernMain.java
// java --enable-preview ModernMain

// But, on the latest version of temurin 21 this doesn't work:
/*
> javac --release 21 --enable-preview ModernMain.java
error: release version --enable-preview not supported
 */

void main() {
    System.out.println("Hello World");
}

