package Vista;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.Candidato;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Carlos
 */
public class GraficaPastel extends javax.swing.JFrame {

    /**
     * Creates new form graficaPastel
     */
    public GraficaPastel() {
        setTitle("Grafica pastel");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void init(ArrayList<Candidato> candidatos) {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        for (Candidato candidato : candidatos) {
            data.setValue(candidato.getNombre(), candidato.getNumVotos());
        }

        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
                "Grafica de pastel de los votos",
                data,
                true,
                true,
                false);

        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
