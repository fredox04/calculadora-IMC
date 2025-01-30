public class App {
    public static void main(String[] args) throws Exception {
        Paciente A = new Paciente(1.75, 76.50);
        System.out.println("Diagnostico: " + A.diagnostico + "\n");
        Paciente B = new Paciente(1.68, 83.90);
        System.out.println("Diagnostico: " + B.diagnostico + "\n");
        Paciente C = new Paciente(1.78, 67.00);
        System.out.println("Diagnostico: " + C.diagnostico + "\n");
    }
}
