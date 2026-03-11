// package com.mycompany.app;

// /**
//  * Hello world!
//  */
// public class App {

//     private static final String MESSAGE = "Hello World!";

//     public App() {}

//     public static void main(String[] args) {
//         System.out.println(MESSAGE);
//     }

//     public String getMessage() {
//         return MESSAGE;
//     }
// }

package com.mycompany.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    private static final String DEFAULT_MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        App app = new App();
        
        // 1. Ambil nama dari argumen (jika ada), jika tidak pakai Default
        String name = (args.length > 0) ? args[0] : "Guest";
        
        // 2. Cetak Header yang informatif
        System.out.println("========================================");
        System.out.println("   APP LOG: " + app.getTimestamp());
        System.out.println("========================================");
        
        // 3. Eksekusi logic utama
        System.out.println("Message: " + app.getMessage() + " " + name + "!");
        
        // 4. Tambahkan info sistem 
        System.out.println("\n--- System Info ---");
        System.out.println("OS      : " + System.getProperty("os.name"));
        System.out.println("Java Ver: " + System.getProperty("java.version"));
        System.out.println("User    : " + System.getProperty("user.name"));
        System.out.println("========================================");
    }

    public String getMessage() {
        return DEFAULT_MESSAGE;
    }

    public String getTimestamp() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now());
    }
}