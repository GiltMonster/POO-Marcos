import javax.swing.*;

public class Loja{

        public static void main(String[] args)
        {
            String[] produto = {"p01", "p02", "p03", "p04", "p05", "p06", "p07", "p08", "p09", "p10"};
            float[] preco = {1.50f, 2.65f, 10.90f, 7.40f, 8.39f, 1.59f, 4.00f, 5.00f, 11.50f, 5.50f};
            String cod = JOptionPane.showInputDialog("Digite o código do produto:");

            for(int i = 0; i < produto.length; i++)
            {
//                if(cod.equals(produto[i]))
                if(produto[i])
                {
                    JOptionPane.showMessageDialog(null, preco[i]);
               }
           }
       }
}
