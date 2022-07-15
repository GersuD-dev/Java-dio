public class App {
    public static void main(String[] args) throws Exception {
        SmartTv SmartTv = new SmartTv();

        System.out.println("A tv está: " + SmartTv.ligada);
        
        System.out.println("O canal atual: " + SmartTv.canal);
        
        System.out.println("O volume atual: " +SmartTv.volume);
    }
}
