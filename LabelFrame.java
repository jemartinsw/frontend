// 
import java.awt.FlowLayout;// Importa o componente flowlayout do módulo owt da biblioteca do pacote java
import javax.swing.JFrame;// Importa o componente jframe do módulo owt da biblioteca do pacote java
import javax.swing.JLabel;// Importa o componente label do módulo owt da biblioteca do pacote java
import javax.swing.SwingConstants;// Importa o componente swingconstant do módulo owt da biblioteca do pacote java
import javax.swing.Icon;// Importa o componente icon do módulo owt da biblioteca do pacote java
import javax.swing.ImageIcon;// Importa o componente imageicon do módulo owt da biblioteca do pacote java

public class LabelFrame extends JFrame// Está declarando a classe labelframe que o extend está herdando o componente jframe que foi importado anteriormente na biblioteca
{// Iniciando o bloco de códigos da classe labelframe
   private final JLabel label1; // Declaração de variável onde o private, que só pode ser visto dentro deste bloco de código, não exporta a variável. O final declara variável somente leitura. O JLabel é o tipo da variável que foi importada anteriormente. O label1 é o nome da variável1.
   private final JLabel label2; // Declaração de variável onde o private, que só pode ser visto dentro deste bloco de código, não exporta a variável. O final declara variável somente leitura. O JLabel é o tipo da variável que foi importada anteriormente. O label1 é o nome da variável2.
   private final JLabel label3; // Declaração de variável onde o private, que só pode ser visto dentro deste bloco de código, não exporta a variável. O final declara variável somente leitura. O JLabel é o tipo da variável que foi importada anteriormente. O label1 é o nome da variável3.

   public LabelFrame()// Não pode ser private, estatico, parâmetro, void. Tem que ser um novo objeto variável. O que está no construtor possui a base completa para ser usada. Construtor tem que ter o mesmo nome da classe e mesmo nome do arquivo.
   {//Início do bloco de códigos do construtor
      
      super("Testing JLabel");// Código presente no bloco de codigos do construtor que é o método de interface. Super define o título da janela. Super vem de superior. O string de texto em aspas duplas é o parâmetro declarado.
      setLayout(new FlowLayout());// Define o desenho/layout do quadro de saída das camadas. Layout vem da abreviaçaõ de layer e camada, ou seja, saída das camadas. Set significa definir. Método invocado sem usar ponto porque foram herdados os métodos do Jframe. O parâmetro é um novo layout de fundo importado anteriormente. Enfim, foi definido como será o layout.

      label1 = new JLabel("Label with text");// O layer 1 recebe um novo objeto (jLabel) com parâmetro texto chamado Label with text.
      label1.setToolTipText("This is label1");// O label1 invoca o método para definir o texto na ferramenta dica(tip). Esta dica permite que se apareça o texto declarado ao posicionar o mouse sobre o texto.
      add(label1);// Add significa adition (adicionar). O LABEL1 definido anteriormente. Ao definí-lo, ele será mostrado no layout. Ou seja, na saída de camadas. 

      // 
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));// Declaranado variável bug do tipo Icon, que está recebendo (operador de atribuição tem declaraçãode variável) um novo objeto ImageIcon. Um parâmetro com métodos que coleta a classe LabelFrame e é incovado o recurso(resource) bug1.png. 
      label2 = new JLabel("Label with text and icon", bug, 
         SwingConstants.LEFT);// label 2 está recebendo declaração de variável. Vírgula dentro da declaração de parametros serve como separador de parametro.  O alinhamento é realizado parao bug. Swingconstant contém informações sobre alinhamento a variável left que é scream_case, que é um variável fixa, que apenas serve para leitura. O bug está sendo alinhado à esquerda que foi o últim objeto declarado.
      label2.setToolTipText("This is label2");// O label2 invoca o método para definir o texto na ferramenta dica(tip). 
      add(label2); // Add significa adition (adicionar). O LABEL2 definido anteriormente.

      label3 = new JLabel(); // Vari[avel sendo declarada - OJlabel. Não precisa ser declarado porque o texto está sendo definido depois de ser atribuído o objeto.
      label3.setText("Label with icon and text at bottom");// O parâmetro entre parênteses (texto) está sendo declarado.
      label3.setIcon(bug); // O ícone foi definido no método set Icon (definir o ícone). Está reutilizando o código da variável ícone.
      label3.setHorizontalTextPosition(SwingConstants.CENTER); // Está definindo a posição horizontal do texto que estará ao centro (mesma margem da es   uerda será a da direita).
      label3.setVerticalTextPosition(SwingConstants.BOTTOM); //Posição vertical do texto abaixo, o ícone ficará acima.
      label3.setToolTipText("This is label3"); // Define que quando se posiciona o mouse sobre o texto ou ícone, a dica em texto será mostrada.
      add(label3); // Será adicionado ao frame, sendo seu fluxo mostrado por último.
   }// Fecha o construtor.
}// Fecha a classe.
