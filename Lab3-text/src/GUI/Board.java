
package GUI;

import javax.swing.*;
import java.awt.*;

public class Board {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Board");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // ����������壬ʹ�ñ߽粼��
        JPanel panel = new JPanel(new BorderLayout());

        // ��ͷ��������
        Object[] columnNames = {"ʱ��", "Entry ID", "Location", "State"};

        // �������������
        Object[][] rowData = {
                {"����", 80, 80, 80, 240},
                {"John", 70, 80, 90, 240},
                {"Sue", 70, 70, 70, 210},
                {"Jane", 80, 70, 60, 210},
                {"Joe", 80, 70, 60, 210}
        };

        // ����һ�����ָ�� ���������� �� ��ͷ
        JTable table = new JTable(rowData, columnNames);

        // �� ��ͷ ��ӵ�����������ʹ����ͨ���м�������ӱ��ʱ����ͷ �� ���� ��Ҫ�ֿ���ӣ�
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        // �� ������� ��ӵ���������
        panel.add(table, BorderLayout.CENTER);

        jf.setContentPane(panel);
        jf.pack();
        //jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

}