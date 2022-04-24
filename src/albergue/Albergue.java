/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albergue;

import javax.swing.JOptionPane;

/**
 *
 * @author BelissimaV
 */
public class Albergue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um programa: "
                + "\n 1 - 1- Adicione um funcionário."  
                + "\n 2 - Adicione um pagamento."
                + "\n 3 - Exibir o total de contribuições para o Plano de Pensão do Canadá."
                + "\n 4 - Exibir o total de contribuições para o seguro-desemprego."
                + "\n 5 - Lista de funcionários com taxa fixa (RG, nome e horas extras)."
                + "\n 6 - Lista de funcionários comissionados (ID, nome e faturamento bruto)."
                + "\n 7 - Sair."));
            
            switch (opcao) {
                case 1:
                        JOptionPane.showMessageDialog(null, "Escolheu a opção 1");
                        break;
                case 2:
                        JOptionPane.showMessageDialog(null, "Escolheu a opção 2");
                        break;
                case 3:
                        JOptionPane.showMessageDialog(null, "Escolheu a opção 3");
                        break;
                case 4:
                        JOptionPane.showMessageDialog(null, "Escolheu a opção 4.");
                        break;    
                case 5:
                        JOptionPane.showMessageDialog(null, "Escolheu a opção 5");
                        break;
                case 6:
                        JOptionPane.showMessageDialog(null, "Escolheu a opção 6");
                        break;    
                        
                case 7:
                        JOptionPane.showMessageDialog(null, "Escolheu a opção Sair!");
                        break; 
                default:
                        JOptionPane.showMessageDialog(null, "Opção invalida!");
            }
        } while (opcao != 7);
                     
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }  
}
