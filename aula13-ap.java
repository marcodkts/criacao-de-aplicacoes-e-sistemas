import javax.swing.*;

class AtividadeJava02
{
    //módulo principal com a entrada pela linha de comando
    public static void main (String entrada[])
    {
        //declaração de variáveis
        int n1, n2, div;
        double pot;
        String msg = "";

        //entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));

        //processamento
        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);
        
        //saida de resultados
        msg = msg + "quociente da divisao de " + n1 + " por " + n2 + " = " + div + "\n";
        msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
