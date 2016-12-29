/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacysystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.Date;
import pharmacysystem.*;

/**
 *
 * @author Ooi
 */
public class dataMonitoringPage extends JFrame{
    //importing the java file
    private membershipRegistration membershipRegistrationPage;
    private editMembership editMembershipPage;
    private viewAllMembershipFile viewAllMembershipFilePage;
    private employeeRegistration employeeRegistrationPage;
    private editEmployee editEmployeePage;
    private deleteEmployee deleteEmployeePage;
    private viewAllEmployeeFile viewAllEmployeeFilePage;
    private productRegistration productRegistrationPage;
    private editProductPage editingProductPage;
    private deleteProductPage deletingProductPage;
    private deleteMembership deleteMembershipPage;
    private viewAllProductFile viewAllProductFilePage;
    private stockPurchase stockPurchasePage;
    private stockUpdate stockUpdatePage;
    private stockAdd sA;
    private stockReturn sR;
    private viewAllStockFile viewAllStockPage;// inventory record <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    private generateReport gR;
    
    Date dNow = new Date();
    SimpleDateFormat ft3 = new SimpleDateFormat ("yyyy");
    SimpleDateFormat ft2 = new SimpleDateFormat ("MM");
    SimpleDateFormat ft1 = new SimpleDateFormat ("dd");
    String day;
    String month;
    String year;
    
    private JLabel title = new JLabel("Pharmacy System");
    private JLabel userLbl = new JLabel("User ID");
    private JLabel dateLbl = new JLabel("Log in date");
    
    private JButton logOut = new JButton("Log out");
    
    private JTextField userID = new JTextField(10);
    private JTextField logDate = new JTextField(15);
    //button for west panel
    private JButton memRegister = new JButton("Membership Registration"); // membership
    private JButton memEdit = new JButton("View & Update membership");
    private JButton memDel = new JButton("View & Delete membership");
    private JButton memView = new JButton("View Membership Records");
    private JButton empRegister = new JButton("Employee Registration"); // Employee
    private JButton empEdit = new JButton("View & Update employee");
    private JButton empDel = new JButton("View & Delete employee");
    private JButton empView = new JButton("View Employee Records");
    private JButton prodRegister = new JButton("Product Registration"); //Product
    private JButton prodEdit = new JButton("View & Update Product");
    private JButton prodDel = new JButton("View & Delete Product");
    private JButton prodView = new JButton("View Product Records");
    private JButton stockUpd = new JButton("Stock Update"); // inventory
    //private JButton stockPhs = new JButton("Stock Purchase"); 
    private JButton addStock = new JButton("Add Stock");
    private JButton returnStock = new JButton("Return Stock");
    private JButton viewStock = new JButton("View Inventory Records");// inventory record <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    private JButton rpt = new JButton("Report Generate"); // report
    
    private JPanel topLabel = new JPanel();
    private JPanel westPanel = new JPanel(new GridLayout(5, 1));
    private JPanel southInfoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    //button panel for west
    private JPanel memPanel = new JPanel(new GridLayout(4, 1));
    private JPanel empPanel = new JPanel(new GridLayout(4, 1));
    private JPanel prodPanel = new JPanel(new GridLayout(4, 1));
    private JPanel invPanel = new JPanel(new GridLayout(4, 1));// inventory record <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    private JPanel rptPanel = new JPanel(new GridLayout(1, 1));
    //CENTER 
    private CardLayout cardLay = new CardLayout(); // -------> For center border
    private JPanel centralPanel = new JPanel(cardLay);
    
    int access;
    
    public dataMonitoringPage(){
        
    }
    
    public dataMonitoringPage(String ID){
        setLayout(new BorderLayout());
        membershipRegistrationPage = new membershipRegistration();
        editMembershipPage = new editMembership();
        deleteMembershipPage = new deleteMembership();
        viewAllMembershipFilePage = new viewAllMembershipFile();
        employeeRegistrationPage = new employeeRegistration();
        editEmployeePage = new editEmployee();
        viewAllEmployeeFilePage = new viewAllEmployeeFile();
        productRegistrationPage = new productRegistration();
        editingProductPage = new editProductPage();
        deletingProductPage = new deleteProductPage();
        deleteEmployeePage = new deleteEmployee();
        viewAllProductFilePage  = new viewAllProductFile();
       // stockPurchasePage = new stockPurchase();
        viewAllStockPage = new viewAllStockFile();// inventory record <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        sA = new stockAdd();
        sR = new stockReturn();
        stockUpdatePage = new stockUpdate();
        gR = new generateReport();
        
        topLabel.add(title);
        
        // West Panel group button settings
        memPanel.setBorder(new TitledBorder("Membership"));
        memPanel.add(memRegister);
        memPanel.add(memEdit);
        memPanel.add(memDel);
        memPanel.add(memView);
        empPanel.setBorder(new TitledBorder("Employee"));
        empPanel.add(empRegister);
        empPanel.add(empEdit);
        empPanel.add(empDel);
        empPanel.add(empView);
        prodPanel.setBorder(new TitledBorder("Product"));
        prodPanel.add(prodRegister);
        prodPanel.add(prodEdit);
        prodPanel.add(prodDel);
        prodPanel.add(prodView);
        invPanel.setBorder(new TitledBorder("Inventory"));
        invPanel.add(stockUpd);
       // invPanel.add(stockPhs);
        invPanel.add(addStock);
        invPanel.add(returnStock);
        invPanel.add(viewStock); // inventory record <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        rptPanel.setBorder(new TitledBorder("Report"));
        rptPanel.add(rpt);
        
        // importing the panel into west
        westPanel.add(memPanel);
        westPanel.add(empPanel);
        westPanel.add(prodPanel);
        westPanel.add(invPanel);
        westPanel.add(rptPanel);
        
        //CENTER PANEL !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        centralPanel.add(membershipRegistrationPage, "1");
        centralPanel.add(editMembershipPage, "2");
        centralPanel.add(deleteMembershipPage, "3");
        centralPanel.add(viewAllMembershipFilePage, "4");
        centralPanel.add(employeeRegistrationPage, "5");
        centralPanel.add(editEmployeePage, "6");
        centralPanel.add(deleteEmployeePage, "7");
        centralPanel.add(viewAllEmployeeFilePage, "8");
        centralPanel.add(productRegistrationPage, "9");
        centralPanel.add(editingProductPage, "10");
        centralPanel.add(deletingProductPage, "11");
        centralPanel.add(viewAllProductFilePage, "12");
        centralPanel.add(stockUpdatePage, "13");
        //centralPanel.add(stockPurchasePage, "14");
        centralPanel.add(sA, "15");
        centralPanel.add(sR, "16");
        centralPanel.add(viewAllStockPage, "17");// inventory record <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        centralPanel.add(gR, "18");
        
        //South panel settings
         year = ft3.format(dNow); //Date
         month = ft2.format(dNow);
         day = ft1.format(dNow);
         logDate.setText(day + "/" + month + "/" + year);
        southInfoPanel.setBorder(new TitledBorder("Login Information"));
        southInfoPanel.add(userLbl);
        southInfoPanel.add(userID);
        userID.setEditable(false);
        southInfoPanel.add(dateLbl);
        southInfoPanel.add(logDate);
        logDate.setEditable(false);
        southInfoPanel.add(logOut);
        
        userID.setText(ID);
        
        memRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "1");
            }
        });
        
        memEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "2");
            }
        });
        
        memDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "3");
            }
        });
        
        memView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "4");
            }
        });
        
        empRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "5");
            }
        });
        
        empEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "6");
            }
        });
        
        empDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "7");
            }
        });
        
        empView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "8");
            }
        });
        
        prodRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               cardLay.show(centralPanel, "9");
            }
        });
        
        prodEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "10");
            }
        });
        
        prodDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "11");
            }
        });
        
        prodView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "12");
            }
        });
        
        stockUpd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "13");
            }
        });
        
//        stockPhs.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                cardLay.show(centralPanel, "14");
//            }
//        });
        
        addStock.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "15");
            }
        });
        
        returnStock.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "16");
            }
        });
        
        viewStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               cardLay.show(centralPanel, "17");// inventory record <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            }
        });
        
        rpt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLay.show(centralPanel, "18");
            }
        });
        
        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                access = JOptionPane.showConfirmDialog(null, "Do you wish to go back login page?", "Message", JOptionPane.INFORMATION_MESSAGE);
                if(access == 0){
                    login log = new login();
                    dispose();
                }else if(access == 1){
                    dispose();
                }
            }
        });
        
        add(topLabel ,BorderLayout.NORTH);
        add(westPanel ,BorderLayout.WEST);
        add(centralPanel ,BorderLayout.CENTER);
        add(southInfoPanel ,BorderLayout.SOUTH);
        setUndecorated(true);
                    Toolkit tk = Toolkit.getDefaultToolkit();
                    int xsize = (int)tk.getScreenSize().getWidth();
                    int ysize = (int)tk.getScreenSize().getHeight();
                    setSize(xsize, ysize);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new dataMonitoringPage();
    }
    
}
