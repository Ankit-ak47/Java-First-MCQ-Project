import java.awt.*;
import java.awt.event.*;
class Answer extends Frame implements WindowListener,ActionListener
{
   Button b;
   String s1,s2;
   Image im10=Toolkit.getDefaultToolkit().getImage("10.gif");
   Image im9=Toolkit.getDefaultToolkit().getImage("9.gif");
   Image im8=Toolkit.getDefaultToolkit().getImage("8.gif");
   Image im7=Toolkit.getDefaultToolkit().getImage("7.gif");
   Image im6=Toolkit.getDefaultToolkit().getImage("6.gif");
   Image im5=Toolkit.getDefaultToolkit().getImage("5.gif");
   Image immin=Toolkit.getDefaultToolkit().getImage("min.png");
   Image immax=Toolkit.getDefaultToolkit().getImage("max.png");
   Answer(String n,String p)
   {
       s1=n;
       s2=p;
       setSize(1160,900);
       setLocation(380,75);
       setTitle("Your Score");
       setLayout(null);
       setBackground(Color.black);
       setIconImage(immax);
       Font f=new Font("Courier",Font.BOLD,80);
       Font f1=new Font("Courier",Font.BOLD,40);
       Label l1=new Label("You Score : ");
       l1.setBounds(230,650,600,80);
       l1.setFont(f);
       l1.setForeground(Color.white);
       add(l1);
       setVisible(true);
       Label l2=new Label(s1+"\\"+s2);
       l2.setBounds(830,650,700,80);
       l2.setFont(f);
       l2.setForeground(Color.white);
       add(l2);
       Button b=new Button("Retry Quiz");
       b.setBounds(400,770,300,60);
       b.setFont(f1);
       b.addActionListener(this);
       add(b);
       addWindowListener(this);
       setVisible(true);
   }
   public void paint(Graphics g)
   {
      int m=Integer.valueOf(s1);
      if(m==10)
      g.drawImage(im10,165,100,830,500,this);
      if(m==9)
      g.drawImage(im9,165,100,830,500,this);
      if(m==8)
      g.drawImage(im8,165,100,830,500,this);
      if(m==7)
      g.drawImage(im7,165,100,830,500,this);
      if(m==6)
      g.drawImage(im6,165,100,830,500,this);
      if(m<=5)
      g.drawImage(im5,165,100,830,500,this);
   }
    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);
        new MCQ();
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosing(WindowEvent e){System.exit(0);}
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){setIconImage(immin);}
    public void windowDeiconified(WindowEvent e){setIconImage(immax);}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
}