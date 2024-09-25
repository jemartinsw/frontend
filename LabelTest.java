// A linha abaixo importará o componente JFrame do módulo swing da biblioteca (pacote) javax
import javax.swing.JFrame;//A linha abaixo está declarando a classe LabelTest
public class LabelTest//Vai iniciar o bloco de notas da classe LabelTest
{
   public static void main(String[] args)// Está declarando o método main
   { 
      LabelFrame labelFrame = new LabelFrame();//está declarando a variável LabelFrame, do tipo LAbel Frame (tipo de arquivo qeu está na pasta) porque está criando variável do mesmo tipo do construtor. O new atribui um novo objeto. 
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//invocan o método a partir do ponto para frente - que consiste em ser escrito com o mesmo padrão do camelcase da palavra anterior para definir a operação de fechamento padrão dos parâmetros chamado exitonclose)
      labelFrame.setSize(260, 180);//Configura o tamanho em pixels da largura e altura   
      labelFrame.setVisible(true);//Exibe
   } //Encerra bloco de códigos do método main
} //Encerra bloco de códigos da classe LabelTest
