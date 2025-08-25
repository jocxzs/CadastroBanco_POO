import javax.swing.*;
import java.awt.*;


public class Janela extends JFrame {
    private JLabel jlAgencia;
    private JLabel jlConta;
    private JTextField jtfAgencia;
    private JTextField jtfConta;
    private JSeparator jSeparator01;
    private JLabel jlNome;
    private JTextField jtfNome;
    private JLabel jlEndereco;
    private JTextField jtfEndereco;
    private JLabel jlTelefone;
    private JTextField jtfTelefone;
    private JLabel jlCpf;
    private JTextField jtfCpf;
    private JRadioButton jrbCorrente;
    private JRadioButton jrbPoupanca;
    private ButtonGroup bgContas;
    private JSeparator jSeparator02;
    private JButton jbConsultar;
    private JButton jbAtualizar;
    private JButton jbFechar;

    public Janela() {
        // jbConsultar.addActionListener(new ActionListener() {
        //     //@Override
        //     public void actionPerformed(ActionEvent e) {
        //         //gravar();
        //     }
        // });

        // jbAtualizar.addActionListener(new ActionListener() {
        //     //@Override
        //     public void actionPerformed(ActionEvent e) {
        //         //editar();
        //     }
        // });

        // jbFechar.addActionListener(new ActionListener() {
        //     //@Override
        //     public void actionPerformed(ActionEvent e) {
        //         //cancelar();
        //     }
        // });
        // Instância e configuração do componente jlAgencia
        jlAgencia = new JLabel("Código da Agência");
        jlAgencia.setBounds(10, 10, 110, 18);
        getContentPane().add(jlAgencia);

        // Instância e configuração do componente jtfAgencia
        jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
        getContentPane().add(jtfAgencia);

        // Instância e configuração do componente jtfConta
        jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        getContentPane().add(jtfConta);

        // Instância e configuração do componente jSeparator01
        jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        getContentPane().add(jSeparator01);

        // Instância e configuração do componente jlNome
        jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlNome);

        // Instância e configuração do componente jtfNome
        jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        getContentPane().add(jtfNome);

        // Instância e configuração do componente jlEndereco
        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlEndereco);

        // Instância e configuração do componente jtfEndereco
        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        getContentPane().add(jtfEndereco);

        // Instância e configuração do componente jlTelefone
        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlTelefone);

        // Instância e configuração do componente jtfTelefone
        jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75, 100, 300, 20);
        getContentPane().add(jtfTelefone);

        // Instância e configuração do componente jlCpf
        jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 125, 60, 18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlCpf);

        // Instância e configuração do componente jtfCpf
        jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300, 20);
        getContentPane().add(jtfCpf);

        // Instância e configuração do componente jrbCorrente
        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic('C'); // Atalho Alt + C
        jrbCorrente.setSelected(true); // Selecionado por padrão
        getContentPane().add(jrbCorrente);

        // Instância e configuração do componente jrbPoupanca
        jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic('P'); // Atalho Alt + P
        getContentPane().add(jrbPoupanca);

        // Agrupamento dos botões de rádio
        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        // Instância e configuração do componente jSeparator02
        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        // Instância e configuração do componente jbConsultar
        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic('S'); // Atalho Alt + S
        getContentPane().add(jbConsultar);

        // Instância e configuração do componente jbAtualizar
        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic('A'); // Atalho Alt + A
        jbAtualizar.setEnabled(false); // Desabilitado por padrão
        getContentPane().add(jbAtualizar);

        // Instância e configuração do componente jbFechar
        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic('F'); // Atalho Alt + F
        getContentPane().add(jbFechar);

        centralizar();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 255);
        setResizable(false);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // New methods
    public void gravar() {
        // Placeholder for the gravar method
        System.out.println("Gravar method called");
    }

    public void editar() {
        // Placeholder for the editar method
        System.out.println("Editar method called");
    }

    public void excluir() {
        // Placeholder for the excluir method
        System.out.println("Excluir method called");
    }

    public void cancelar() {
        // Placeholder for the cancelar method
        System.out.println("Cancelar method called");
    }

    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();

        if (janela.height > screen.height) {
            setSize(janela.width, screen.height);
        }

        if (janela.width > screen.width) {
            setSize(screen.width, janela.height);
        }

        setLocation((screen.width - janela.width) / 2,
                    (screen.height - janela.height) / 2);
    }

    public static void main(String[] args) {
        new Janela();
    }
}