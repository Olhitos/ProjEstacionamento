import java.util.List;

public abstract class Relatorio {
    public static void gerarRelatorio(List<Vaga> vagas) {
        System.out.println("Relatório:");
        for (Vaga vaga : vagas) {
            System.out.println("Vaga " + vaga.getNumero() + ": " + vaga.getStatus());
        }
    }

    public static void gerarRelatorioDiario(List<Pagamento> pagamentos) {
        double total = 0;
        for (Pagamento pagamento : pagamentos) {
            total += pagamento.getValorPago();
        }
        System.out.println("Total arrecadado no dia: " + total);
    }
}
