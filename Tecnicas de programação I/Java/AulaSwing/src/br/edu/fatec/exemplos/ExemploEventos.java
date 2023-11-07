package br.edu.fatec.exemplos;


 
 import java.awt.FlowLayout;
 import java.awt.GridLayout;
 import javax.swing.JFrame;
 import javax.swing.JButton;
 import javax.swing.JComboBox;
 import javax.swing.JLabel;
 import javax.swing.Icon;
 import javax.swing.ImageIcon;
 import javax.swing.JOptionPane;
 import javax.swing.JPanel;
 import javax.swing.JTextArea;
 import javax.swing.JTextField;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
  import java.util.InputMismatchException;
 
 
 public class ExemploEventos extends JFrame
 {
    //declara��o das vari�veis
    //Vetor de caracteres (String) de 2 colunas
    private String sexo[]={"Mulher","Homem"};
    //inteiros (int)
    int tipo, foto;
    //numeros de pontos flutuantes (double)
    double altura, peso, massa;
    //criando um array j� com os valores configurados do tipo double
    double imc_homens[] ={20.7,26.4};
    double imc_mulheres[] ={19.1,25.8};
    private String string="";
 
    //cria��o do FlowLayout que alinha componentes da esquerda para a direita.
    private FlowLayout flowLayout = new FlowLayout();
    /*cria��o de GridLayout com 4 linhas e 2 colunas com 10 de espa�o em largura
     e 1 de altura*/
    private GridLayout gridLayout = new GridLayout(4,2,10,1);
    //cria��o de um painel
    private JPanel gridJPanel = new JPanel();
 
    //cria��o de dois bot�es com os nomes Calcular e Limpar Dados
    private JButton butao = new JButton("Calcular");
    private JButton butao2 = new JButton("Limpar Dados");
    //cria��o das label's
    private JLabel Lsexo = new JLabel("Escolha o sexo:");
    private JLabel Laltura = new JLabel("Altura em cm:");
    private JLabel Lpeso = new JLabel("Peso em Kg:");
    private JLabel Lresultado = new JLabel("");
    private JLabel Lfoto = new JLabel("");
    //cria��o de campos com 5 de largura
    private JTextField Faltura = new JTextField("",5);
    private JTextField Fpeso = new JTextField("",5);
 
    //cria��o de uma caixa de sele��o
    private JComboBox escolha = new JComboBox(sexo);
 
    //anexando a imagem um icone de nome limpar
    private Icon limpar = new ImageIcon(getClass().getResource("/image/images.jpg"));
    //criando um vetor com as demais imagens
    private Icon imagemM[] = {new ImageIcon(getClass().getResource("/image/esqueleto.gif")), new ImageIcon
    (getClass().getResource("/image/obesidade.jpg")),new ImageIcon(getClass().getResource("/image/obesidade.jpg"))};
    private Icon imagemH[] = {new ImageIcon(getClass().getResource("/image/esqueleto.gif")), new ImageIcon
    (getClass().getResource("/image/obesidade.jpg")),new ImageIcon(getClass().getResource("/image/obesidade.jpg"))};
 
    //construtor de Ex2 sem argumentos
    public ExemploEventos()
    {
     //t�tulo  da janela
     super("Calculo do IMC(�ndice de massa corporal)");
     //alinhamento do frame com o uso do objeto flowLayout
     super.setLayout(flowLayout);
     //tamanho da janela
     setSize(370, 160);
     //inclus�o dos componentes de maximinizar, miniminizar e fechar
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
     //exibe 2 linhas da caixa de sele��o ao clic�-la
     escolha.setMaximumRowCount(2);
     //alinha o painel com o objeto gridLayout
     gridJPanel.setLayout(gridLayout);
     //adiciona os componentes
     gridJPanel.add(Lsexo);
     gridJPanel.add(escolha);
     gridJPanel.add(Laltura);
     gridJPanel.add(Faltura);
     gridJPanel.add(Lpeso);
     gridJPanel.add(Fpeso);
     gridJPanel.add(butao);
     gridJPanel.add(butao2);
 
     //adiciona a janela principal
     super.add(gridJPanel);
     super.add(Lfoto);
     super.add(Lresultado);
 
     //cria��o de uma classe interna an�nima para butao
     butao.addActionListener(
     new ActionListener()
     {
        public void actionPerformed(ActionEvent event)
        {
         switch (escolha.getSelectedIndex())
         {
            /*caso seja a primeira op��o que foi selecionada na caixa de sele��o
             configure tipo=0 e v� para o m�todo Calculos*/
            case 0:
            {
              tipo=0; //mulher
              Calculos();
              break;
            }
            //caso seja a segunda op��o, configura tipo como 1 e v� para o m�todo Calculos.
            case 1:
            {
              tipo=1; //homem
              Calculos();
              break;
            }
         }
        }
      }//Fim da classe interna an�nima
     );//fim da chamada para addActionListerner
 
     //classe interna an�nima para butao2
     butao2.addActionListener(
     new ActionListener()
     {
        //ao clicar no butao2 de nome limpar chama o m�todo limpar
        public void actionPerformed(ActionEvent event)
        {
         limpar();
        }
     }//Fim da classe interna an�nima
     );//fim da chamada para addActionListerner
    }
 
    //m�todo que realiza os calculos
    private void Calculos()
    {
        try //tratador de erros com try e catch
        {
           //pega e converte os caracteres em ponto flutuante do campo Faltura para a variavel altura
           altura=Double.parseDouble(Faltura.getText());
           //converte para metros
           altura/=100;
           //da mesma forma com Fpeso para a vari�vel peso
           peso=Double.parseDouble(Fpeso.getText());
           //realiza calculos
           massa=peso/(altura*altura);
           /*Se a massa corporal for menor do que o estabelecido pelo vetor configure a vari�vel
            string com essa frase*/
          if (tipo==0)
          {
             if (imc_mulheres[0]>massa)
             {
                string = String.format("CUIDADO!!!Voce estar abaixo do peso! IMC %.2f",massa);
                foto=0;
             }
             else if((imc_mulheres[0]<massa) && (massa<=imc_mulheres[1]))
             {
                string = String.format("PARABENS!!Voce estar com o peso ideal! IMC %.2f",massa);
                foto=1;
             }
             else
             {
                string = String.format("CUIDADO!!Voce estar obesa! IMC %.2f",massa);
                foto=2;
             }
             //configure a foto conforme a posi��o da vari�vel foto
             Lfoto.setIcon(imagemM[foto]);
          }
          else if (tipo==1)
          {
             if (imc_homens[0]>massa)
             {
                string = String.format("CUIDADO!!!Voce estar abaixo do peso! IMC %.2f",massa);
                //configura a posi��o que ser� exibido a imagem
                foto=0;
             }
             else if((imc_homens[0]<massa) && (massa<imc_homens[1]))
             {
                string = String.format("PARABENS!!Voce estar com o peso ideal! IMC %.2f",massa);
                foto=1;
             }
             else
             {
                string = String.format("CUIDADO!!Voce estar obeso! IMC %.2f",massa);
                foto=2;
             }
             //configure a foto conforme a posi��o da vari�vel foto
             Lfoto.setIcon(imagemH[foto]);
          }
           //reconfigure o tamanho da tela
           setSize(370, 500);
           //configure a label Lresultado com a vari�vel string
           Lresultado.setText(string);
        }
        //caso ocorra uma excess�o(erro) exiba uma mensagem nua caixa de mensagem
        catch(NumberFormatException exception)
        {
         JOptionPane.showMessageDialog(this,"No n�mero inv�lido!\nEx: Use '.' ao inv�s de ',' para separar as casas decimais.","ERROR FATAL!!!",JOptionPane.ERROR_MESSAGE);
         //limpe s campos e vari�veis
         Fpeso.setText("");
         Faltura.setText("");
         peso=0;
        altura=0;
        }
    }
    //m�todo para limpar os dados da tela e retornar a tela ao seu tamanho original
    private void limpar()
    {
     Fpeso.setText("");
     Faltura.setText("");
     Lresultado.setText("");
     //substitua a imagem atual por essa
     Lfoto.setIcon(limpar);
     setSize(300, 160);
    }
 

   //Comando principal para execu��o do programa
   public static void main(String[] args)
   {
       //Cria��o de um objeto ex da classe Ex2
       ExemploEventos ex = new ExemploEventos();
       //posi��o da tela ao abri-la
       ex.setLocation(400,200);
       //tornando a tela vis�vel
       ex.setVisible(true);
    }
 }
