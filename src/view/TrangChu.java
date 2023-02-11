/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.FindById;
import dao.Insert;
import dao.ListItem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.HangTonKho;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
import service.ConnectDB;
import service.RandColor;
import table.TableCustom;

/**
 *
 * @author Admin
 */
public final class TrangChu extends javax.swing.JPanel {

    /**
     * Creates new form TrangChu
     */
    private DefaultTableModel tblHangTonKhoModel;
    public TrangChu() throws Exception {
        initComponents();
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT); //or MULTI_LINE
        initTable();
        loadDataToTable("");
        showPieChart();
        showLineChart();
        
        jlbNhap.setText(Integer.toString(new ListItem().phieuNhap("").size()));
        jlbXuat.setText(Integer.toString(new ListItem().phieuXuat("").size()));
        jlbTra.setText(Integer.toString(new ListItem().phieuTraHang("").size()));
    }
    
    public void showPieChart() throws Exception{
        
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      List<HangTonKho> list = new ListItem().hangTonKho("");
      for(int i=0; i<list.size(); i++){
          String name = new FindById().vatTu(list.get(i).getSupplyID()).getSuppliesName();
          int quantity = list.get(i).getQuantityRemain();
          barDataset.setValue(name, quantity);  
      }
              
        //create dataset
      
//      barDataset.setValue( "IPhone 5s" , new Double(20) );  
//      barDataset.setValue( "SamSung Grand" , new Double( 20 ) );   
//      barDataset.setValue( "MotoG" , new Double( 40 ) );    
//      barDataset.setValue( "Nokia Lumia" , new Double( 100 ) ); 
//      barDataset.setValue( "IPhong 15" , new Double( 500 ) ); 
      
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Vật Tư Tồn Kho",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
       for(int i=0; i<list.size(); i++){
           String name = new FindById().vatTu(list.get(i).getSupplyID()).getSuppliesName();
           //int color = new RandColor().Color();
          piePlot.setSectionPaint(name, new Color(new RandColor().Color(),new RandColor().Color(),new RandColor().Color()));
      }
//       piePlot.setSectionPaint("IPhone 5s", new Color(255,255,102));
//        piePlot.setSectionPaint("SamSung Grand", new Color(102,255,102));
//        piePlot.setSectionPaint("MotoG", new Color(255,102,153));
//        piePlot.setSectionPaint("Nokia Lumia", new Color(0,204,204));
//        piePlot.setSectionPaint("IPhong 15", new Color(150,22,204));
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
    }
     public void showLineChart(){
        //create dataset for the graph
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("contribution","monthly","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelBarChart2.removeAll();
        panelBarChart2.add(lineChartPanel, BorderLayout.CENTER);
        panelBarChart2.validate();
    }
     
     public void showHistogram(){
        
         double[] values = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67,
                            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
                            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
                            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
                            77, 44, 58, 91, 10, 67, 57, 19, 88, 84                                
                          };
 
 
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values, 20);
        
         JFreeChart chart = ChartFactory.createHistogram("JFreeChart Histogram","Data", "Frequency", dataset,PlotOrientation.VERTICAL, false,true,false);
            XYPlot plot= chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);

        
        
        ChartPanel barpChartPanel2 = new ChartPanel(chart);
        jPanel3.removeAll();
        jPanel3.add(barpChartPanel2, BorderLayout.CENTER);
        jPanel3.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHangTonKho = new javax.swing.JTable();
        jpnBox = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlbNhap = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlbXuat = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jlbTra = new javax.swing.JLabel();
        jpnChart = new javax.swing.JPanel();
        panelBarChart = new javax.swing.JPanel();
        panelBarChart2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jpnTable.setBackground(new java.awt.Color(255, 255, 255));

        tblHangTonKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Vật tư", "Số lượng", "Nhà cung cấp"
            }
        ));
        jScrollPane1.setViewportView(tblHangTonKho);

        javax.swing.GroupLayout jpnTableLayout = new javax.swing.GroupLayout(jpnTable);
        jpnTable.setLayout(jpnTableLayout);
        jpnTableLayout.setHorizontalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jpnTableLayout.setVerticalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnBox.setBackground(new java.awt.Color(255, 255, 255));
        jpnBox.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbNhap.setBackground(new java.awt.Color(255, 102, 102));
        jlbNhap.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlbNhap.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-import-50.png"))); // NOI18N
        jlbNhap.setText("1500");
        jlbNhap.setToolTipText("");
        jlbNhap.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnBox.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbXuat.setBackground(new java.awt.Color(102, 255, 102));
        jlbXuat.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlbXuat.setForeground(new java.awt.Color(255, 255, 255));
        jlbXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-export-50.png"))); // NOI18N
        jlbXuat.setText("800");
        jlbXuat.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnBox.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbTra.setBackground(new java.awt.Color(153, 153, 0));
        jlbTra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlbTra.setForeground(new java.awt.Color(255, 255, 255));
        jlbTra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-medium-risk-50.png"))); // NOI18N
        jlbTra.setText("5");
        jlbTra.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTra, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTra, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnBox.add(jPanel5);

        jpnChart.setLayout(new java.awt.GridLayout(2, 1));

        panelBarChart.setLayout(new java.awt.BorderLayout());
        jpnChart.add(panelBarChart);

        panelBarChart2.setLayout(new java.awt.BorderLayout());
        jpnChart.add(panelBarChart2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnBox, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnChart, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbNhap;
    private javax.swing.JLabel jlbTra;
    private javax.swing.JLabel jlbXuat;
    private javax.swing.JPanel jpnBox;
    private javax.swing.JPanel jpnChart;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelBarChart2;
    private javax.swing.JTable tblHangTonKho;
    // End of variables declaration//GEN-END:variables
    private void initTable() {
        tblHangTonKhoModel = new DefaultTableModel();
        tblHangTonKhoModel.setColumnIdentifiers(new String[]{"STT","Tên vật tư","Quantity","QuantityRemain","Nhà cung cấp"});
        tblHangTonKho.setModel(tblHangTonKhoModel);
    }

    private void loadDataToTable(String name) {
        try {
            List<HangTonKho> list = new ListItem().hangTonKho(name);
            tblHangTonKhoModel.setRowCount(0);
            int i = 1;
            for(HangTonKho hangTonKho : list){
                tblHangTonKhoModel.addRow(new Object[]{
                    i++,
                    new FindById().vatTu(hangTonKho.getSupplyID()).getSuppliesName(),
                    hangTonKho.getQuantity(),
                    hangTonKho.getQuantityRemain(),
                    new FindById().nhaCungCap(hangTonKho.getSupplierID()).getSupplier()
                });
            }
            //System.out.println("tu tim kiem : " + key);
            tblHangTonKhoModel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
