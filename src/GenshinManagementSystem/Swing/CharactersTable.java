
package GenshinManagementSystem.Swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CharactersTable extends JTable{
    
    public CharactersTable() {
        setGridColor(new Color(230,230,230));
        setShowHorizontalLines(true);
        setRowHeight(30);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent (JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1){
                TableHeader header = new TableHeader(o + "");
                return header;
            }
        });
    }
}
