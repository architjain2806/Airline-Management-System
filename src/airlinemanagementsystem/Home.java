package airlinemanagementsystem;

import java.awt.Color;
import javax.swing. *;
import java.awt.event.*;
import java.awt.Font;

public class Home extends JFrame implements ActionListener {
    
    public Home(){
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1600,800);
        add(image);
        
        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
        heading .setBounds(500,20,1000,40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma",Font.PLAIN,36));
        image.add(heading);
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details = new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
        JMenuItem CustomerDetails = new JMenuItem("Add Customer Details");
        CustomerDetails.addActionListener(this);
        details.add(CustomerDetails);
        
        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenuItem("Ticket Cancellation");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation );
        
      JMenu ticket = new JMenu("Tickets");
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        boardingPass.addActionListener(this);
        ticket.add(boardingPass);
        
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       String text = ae.getActionCommand();
       
       if(text.equals("Add Customer Details")){
           new addCustomer();
       }else if(text.equals("Flight Details")){
           new FlightInfo();
       }else if(text.equals("Book Flight")){
           new BookFlight();
       }else if(text.equals("Journey Details")){
           new JourneyDetails();
       }else if(text.equals("Ticket Cancellation")){
           new Cancel();
       }else if(text.equals("Boarding Pass")){
           new BoardingPass();
       }
    }
    public static void main(String[] args) {
        new Home();
    }
}