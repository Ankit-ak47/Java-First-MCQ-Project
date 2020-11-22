import java.awt.*;
import java.awt.event.*;
public class MCQ extends Frame implements ActionListener,MouseListener,WindowListener
{
     Label l1,l2,l3;
     int j=10,m=0,z=1,x=1;
     Question q[]=new Question[j];
     int i=0;
     CheckboxGroup cg;
     Checkbox c1,c2,c3,c4,c5;
     Button b1,b2,b3;
     Font f1,f2,f3,f4;
     
     Image imr=Toolkit.getDefaultToolkit().getImage("r.gif");
     Image iml=Toolkit.getDefaultToolkit().getImage("l.gif");
     Image imw=Toolkit.getDefaultToolkit().getImage("w.gif");
     Image immin=Toolkit.getDefaultToolkit().getImage("min.png");
     Image immax=Toolkit.getDefaultToolkit().getImage("max.png");
      public MCQ() throws Exception
     {
        setSize(860,850);
        setLocation(480,125);
        setBackground(Color.black);
        setTitle("Multiple Choice Question..");
        setLayout(null);
        setUndecorated(true);
        setIconImage(immax);
        f1=new Font("Courier",Font.BOLD,50);
        f2=new Font("Courier",Font.BOLD,40);
        f3=new Font("Courier",Font.BOLD,100);
        f4=new Font("Courier",Font.BOLD,70);
        l1=new Label("");
        l1.setBounds(100,200,1720,50);
        l1.setForeground(Color.white);
        l1.setVisible(false);
        l1.setFont(f1);
        add(l1);
        l2=new Label("Welcome to");
        l2.setBounds(200,300,1720,80);
        l2.setForeground(Color.white);
        l2.setFont(f4);
        add(l2);
        l3=new Label("A-Quiz");
        l3.setBounds(230,420,1720,100);
        l3.setForeground(Color.red);
        l3.setFont(f3);
        add(l3);
        cg=new CheckboxGroup();
        c1=new Checkbox(" ",cg,false);
        c1.setBounds(200,300,960,40);
        c1.setForeground(Color.white);
        c1.setVisible(false);
        c1.setFont(f2);
        add(c1);
        c2=new Checkbox(" ",cg,false);
        c2.setBounds(200,400,960,40);
        c2.setVisible(false);
        c2.setForeground(Color.white);
        c2.setFont(f2);
        add(c2);
        c3=new Checkbox(" ",cg,false);
        c3.setBounds(200,500,960,40);
        c3.setVisible(false);
        c3.setForeground(Color.white);
        c3.setFont(f2);
        add(c3);
        c4=new Checkbox(" ",cg,false);
        c4.setBounds(200,600,960,40);
        c4.setVisible(false);
        c4.setForeground(Color.white);
        c4.setFont(f2);
        add(c4);
        c5=new Checkbox("",cg,true);
        c5.setBounds(0,0,10,10);
        c5.setForeground(Color.white);
        c5.setVisible(false);
        c5.setFont(f2);
        add(c5);
        b1=new Button("SUBMIT");
        b1.setBounds(960,800,200,50);
        b1.setFont(f1);
        b1.addActionListener(this);
        add(b1);
        b2=new Button("NEXT");
        b2.setBounds(960,800,200,50);
        b2.setFont(f1);
        b2.addActionListener(this);
        b3=new Button("FINISH");
        b3.setBounds(960,800,200,50);
        b3.setFont(f1);
        b3.addActionListener(this);
        addMouseListener(this);
        addWindowListener(this);
        loadQuestion();
        setVisible(true);
        Thread.sleep(3000);
        setSize(1920,1050);
        setLocation(0,0);
        x=0;
     }
     public void loadQuestion()
     {
               q[0]=new Question("What is the name of java Compiler?","Java","Javac","Javap","None of the Above","Javac");
               q[1]=new Question("What is name java interpreter?","java","javap","javac","none of these","java");
               q[2]=new Question("What is Final?","Keyword","Make constant","prevent form inheritance","all the above","all the above");
               q[3]=new Question("Find the odd one out.","5720","6710","2640","4270","4270");
               q[4]=new Question("Find the odd one out.","PQXZ","CQBN","ABDF","PRMF","ABDF");
               q[5]=new Question("Half percentage written is decimal?","0.2","0.02","0.005","0.05","0.005");
               q[6]=new Question("The rightmost non-zero digit of 30^2720 is","1","3","7","9","1");
               q[7]=new Question("If a:b=2:3 & b:c=4:5, find a^2:b^2:bc.","4:9:45","16:36:20","16:36:45","4:36:40","16:36:45");
               q[8]=new Question("Average of first 97 natural number.","47","37","48","49","49");
               q[9]=new Question("2 5 7 12 19 ?","22","31","34","27","31");
     }

     public void mouseClicked(MouseEvent e)
     {
       if(e.getY()>=290&&e.getY()<=360&&e.getX()>=180&&getX()<=960)
        {
        c1.setState(true);
        }
        if(e.getY()>=390&&e.getY()<=460&&e.getX()>=180&&getX()<=960)
        {
        c2.setState(true);
        }
        if(e.getY()>=490&&e.getY()<=560&&e.getX()>=180&&getX()<=960)
        {
        c3.setState(true);
        }
        if(e.getY()>=590&&e.getY()<=660&&e.getX()>=180&&getX()<=960)
        {
       c4.setState(true);
        }   
     }
     public void mousePressed(MouseEvent e)
     {
       
     }
     public void mouseReleased(MouseEvent e)
     {

     }
     public void mouseEntered(MouseEvent e)
     {
        if(e.getY()>=290&&e.getY()<=360&&e.getX()>=180&&getX()<=960)
        {
        c1.setFont(f1);
        c1.setForeground(Color.blue);
        }
        if(e.getY()>=390&&e.getY()<=460&&e.getX()>=180&&getX()<=960)
        {
        c2.setFont(f1);
        c2.setForeground(Color.blue);
        }
        if(e.getY()>=490&&e.getY()<=560&&e.getX()>=180&&getX()<=960)
        {
        c3.setFont(f1);
        c3.setForeground(Color.blue);
        }
        if(e.getY()>=590&&e.getY()<=660&&e.getX()>=180&&getX()<=960)
        {
        c4.setFont(f1);
        c4.setForeground(Color.blue);
        }
          
     }
     public void mouseExited(MouseEvent e)
     {
        c1.setFont(f2);
        c1.setForeground(Color.white);
        c2.setFont(f2);
        c2.setForeground(Color.white);
        c3.setFont(f2);
        c3.setForeground(Color.white);
        c4.setFont(f2);
        c4.setForeground(Color.white);
        
     }
     public void actionPerformed(ActionEvent e)
     {  
        if(e.getSource()==b1)
        {
           z=0;
           if(cg.getSelectedCheckbox().getLabel().equals(q[i].ans))
           {
           cg.getSelectedCheckbox().setForeground(Color.green);
           remove(b1);
           removeMouseListener(this);
           m++;
           if(i<j-1)
           {
           add(b2);
           }
           else
           {
           add(b3);
           }
           }
           else
           {
           cg.getSelectedCheckbox().setForeground(Color.red);
           if(c1.getLabel().equals(q[i].ans))
           c1.setForeground(Color.green);
           if(c2.getLabel().equals(q[i].ans))
           c2.setForeground(Color.green);
           if(c3.getLabel().equals(q[i].ans))
           c3.setForeground(Color.green);
           if(c4.getLabel().equals(q[i].ans))
           c4.setForeground(Color.green);
           remove(b1);
           removeMouseListener(this);
           if(i<j-1)
           {
           add(b2);
           }
           else
           {
           add(b3);
           }
           }
        }
        if(e.getSource()==b2)
        {
        z=1;
        i++;
        c5.setState(true);
        c1.setForeground(Color.white);
        c2.setForeground(Color.white);
        c3.setForeground(Color.white);
        c4.setForeground(Color.white);
        addMouseListener(this);
        remove(b2);
        add(b1);
        repaint();
        }
        if(e.getSource()==b3)
        {
            String n=Integer.toString(m);
            String p=Integer.toString(j);
            setVisible(false);
            Answer ob=new Answer(n,p);
        }

     }
     public void paint(Graphics g)
     {
        if(x==0)
        {
         remove(l2);
         remove(l3);
         l1.setText("Q"+(i+1)+". "+q[i].qt);
         l1.setVisible(true);
         c1.setLabel(q[i].op1);
         c1.setVisible(true);
         c2.setLabel(q[i].op2);
        c2.setVisible(true);
         c3.setLabel(q[i].op3);
        c3.setVisible(true);
         c4.setLabel(q[i].op4);
        c4.setVisible(true);
        if(z==0)
        {
         if(cg.getSelectedCheckbox().getLabel().equals(q[i].ans))
         {
            g.drawImage(imr,1200,300,600,450,this);
         }
         else
         {
            g.drawImage(imw,1200,300,600,450,this);
         }
         if(c5.getState()==true)
         {
            g.setColor(Color.black);
            g.fillRect(1200,300,600,450);
            g.drawImage(iml,1200,300,600,450,this);
         }
        }
        else
        {
            g.setColor(Color.black);
            g.fillRect(1200,300,600,450);
         
        }
       }
     }
    public void windowOpened(WindowEvent e){}
    public void windowClosing(WindowEvent e){System.exit(0);}
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){setIconImage(immin);}
    public void windowDeiconified(WindowEvent e){setIconImage(immax);}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}

     public static void main(String args[]) throws Exception
     { 
       MCQ ob=new MCQ();
     }
}