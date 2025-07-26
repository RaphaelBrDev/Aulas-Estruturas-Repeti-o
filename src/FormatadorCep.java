public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("Cep não corresponde com as regras de Negocio");
        }
    }
        static String formatarCep(String cep) throws CepInvalidException{
        if (cep.length() != 8)
        throw new CepInvalidException();

        return "23.765-064";

    }
}
