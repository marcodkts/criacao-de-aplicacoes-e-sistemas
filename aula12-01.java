class MeuPrimeiroProgramaJava
{
    //módulo principal com a entrada pela linha de comando
    public static void main (String entrada[])
    {
        //declaração de variáveis
        int inteiro = 24;
        char caracter = 'M';
        double real = 1.75;
        String frase = "Marco Aurélio";
        boolean VF = true;

        if (VF == true)
        {
            System.out.println("Olá Mundo!, Eu sou o " + frase + ", tenho " + inteiro + "anos e " + real + "m de altura.");
        }
        System.exit(0);
    }
}