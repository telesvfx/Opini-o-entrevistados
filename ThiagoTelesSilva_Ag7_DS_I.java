import javax.swing.JOptionPane;

public class ThiagoTelesSilva_Ag7_DS_I {

    public static void main(String[] args) {
        
        String nome;
        int excelente = 0;
        int ruim = 0;
        int bom = 0;
        int idade;
        int opiniao;
       
        for (int i = 1; i <= 10; i++) {   
            nome = JOptionPane.showInputDialog("Olá entrevistado, por favor, digite o seu nome " + i);
            idade = Integer.parseInt(JOptionPane.showInputDialog("Sr ou Sra " + nome + ", digite a sua idade"));
            opiniao = Integer.parseInt(JOptionPane.showInputDialog("Qual sua opinião sobre o atendimento? (1-EXCELENTE, 2-BOM, 3-RUIM)"));
            
            switch (opiniao) {
                case 1:
                    excelente++;
                    break;
                case 3: 
                    ruim++;
                    break;
                case 2: 
                    bom++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opinião inválida, por favor insira uma opinião válida! 1-EXCELENTE, 2-BOM, 3-RUIM");
                    i--; 
            }
        }
        
        JOptionPane.showMessageDialog(null, "Quantidade de respostas EXCELENTE: " + excelente);
        JOptionPane.showMessageDialog(null, "Quantidade de respostas BOM: " + bom);
        JOptionPane.showMessageDialog(null, "Quantidade de respostas RUIM: " + ruim);
    }
}