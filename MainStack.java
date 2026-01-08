public class MainStack {
    public static void main(String[] args) {
        StackArray stack = new StackArray(3);

        System.out.println("=== IMPLEMENTASI STACK MENGGUNAKAN ARRAY ===\n");

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Percobaan push ke-4 (stack penuh)
        stack.push("Go");

        stack.display();

        // Menampilkan elemen teratas
        System.out.println("Elemen teratas (peek): " + stack.peek());

        // Menghapus satu elemen
        System.out.println("\nPop: " + stack.pop());
        stack.display();

        // Menghapus semua elemen
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        // Percobaan pop pada stack kosong
        stack.pop();
    }
}
