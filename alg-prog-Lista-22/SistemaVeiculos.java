
public class SistemaVeiculos {

    public static void main(String[] args) {

        Veiculo carro = new Carro("Toyota", "Corolla", 2024);
        Veiculo moto = new Moto("Yamaha", "Fazer", 2023);
        Veiculo caminhao = new Caminhao("Volvo", "FH", 2022);

        System.out.println("=== CARRO ===");
        carro.exibirDetalhes();
        carro.acelerar();

        System.out.println("\n=== MOTO ===");
        moto.exibirDetalhes();
        moto.acelerar();

        System.out.println("\n=== CAMINHAO ===");
        caminhao.exibirDetalhes();
        caminhao.acelerar();

    }
}
