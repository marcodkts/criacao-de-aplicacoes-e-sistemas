class PrimeiraAtividadeJava
{
    //módulo principal com a entrada pela linha de comando
    public static void main (String entrada[])
    {
        //declaração de variáveis
        String nome = "Marco Aurélio de Arruda Sá e Lima Junior";
        String curso = "Ciências da Computação";
        int idade = 24;
        String sexo = "Masculino";
        double peso = 103.22;
        boolean VF = true;

        if (VF == true)
        {
            System.out.println("Olá Mundo!");
            System.out.println("Me chamo " + nome + " e curso " + curso + ".");
            System.out.println("Sou do sexo " + sexo + " tenho anos " + idade + " e meu peso é " + peso + " kg.");
        }
        System.exit(0);
    }
}