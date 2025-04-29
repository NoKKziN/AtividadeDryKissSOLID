package questao_5;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("001", "Teclado Mecânico", 3, 150.00);

        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: R$ " + fatura.getPrecoPorItem());
        System.out.println("Total da Fatura: R$ " + fatura.getTotalFatura());

        // Testando valores negativos
        fatura.setQuantidade(-5);
        fatura.setPrecoPorItem(-20);

        System.out.println("\nApós valores negativos:");
        System.out.println("Quantidade: " + fatura.getQuantidade()); // Deve ser 0
        System.out.println("Preço por item: R$ " + fatura.getPrecoPorItem()); // Deve ser 0.0
        System.out.println("Total da Fatura: R$ " + fatura.getTotalFatura()); // Deve ser 0.0
    }
}
