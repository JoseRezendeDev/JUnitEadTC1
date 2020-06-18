public class RegrasDesconto {
    public String nome;
    public int id;
    public char tipoCliente;
    public int quantidadeItens;

    public float calculaDesconto() {
        switch (tipoCliente) {
            case 'A':
                if (quantidadeItens < 10) {
                    return 0;
                } else if (quantidadeItens >= 10 && quantidadeItens <= 99) {
                    return quantidadeItens * 0.05f;
                } else {
                    return quantidadeItens * 0.1f;
                }
            case 'B':
                if (quantidadeItens < 10) {
                    return quantidadeItens * 0.05f;
                } else if (quantidadeItens >= 10 && quantidadeItens <= 99) {
                    return quantidadeItens * 0.15f;
                } else {
                    return quantidadeItens * 0.25f;
                }
            case 'C':
                if (quantidadeItens < 10) {
                    return 0;
                } else if (quantidadeItens >= 10 && quantidadeItens <= 99) {
                    return quantidadeItens * 0.2f;
                } else {
                    return quantidadeItens * 0.25f;
                }
            default:
                return 0;
        }
    }
}
