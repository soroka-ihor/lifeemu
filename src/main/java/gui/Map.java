package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Map extends JTable {
    /* amount of cell on the map */
    private int mapSize = 100;
    /* a cell size in pixels */
    private int cellSize = 5;
    public Map() {
        this.setModel(new DefaultTableModel(mapSize, mapSize));
        this.setRowHeight(cellSize);
        for (int i = 0; i < mapSize; i++) {
            this.getColumnModel().getColumn(i).setMinWidth(cellSize);
            this.getColumnModel().getColumn(i).setMaxWidth(cellSize);
        }
    }
}
