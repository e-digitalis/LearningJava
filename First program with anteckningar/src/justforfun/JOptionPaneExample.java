package justforfun;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;


public class JOptionPaneExample {
    public static final String DIALOG_NAME = "what-dialog";
    public static final String PANE_NAME = "what-pane";

    private void showDialog() {
        JOptionPane pane = new JOptionPane(createInputComponent());
        pane.setName(PANE_NAME);
        JDialog dialog = pane.createDialog("What?");
        dialog.setName(DIALOG_NAME);
        dialog.setSize(400, 400);
        dialog.setVisible(true);
        System.out.println(pane.getInputValue());
        System.exit(0);
    }

    private JComponent createInputComponent() {
        JPanel p = new JPanel(new BorderLayout());
        p.add(new JLabel("Pick a Category:"), BorderLayout.NORTH);

        Box rows = Box.createVerticalBox();
        ActionListener chooseMe = createChoiceAction();

        Map<String, List<String>> inputs =
                new LinkedHashMap<String, List<String>>();
        inputs.put("Cars:", Arrays.asList("Toyota", "Honda", "Yugo"));
        inputs.put("Phones:", Arrays.asList("iPhone", "Android", "Rotary"));
        inputs.put("Pets:", Arrays.asList("Dog", "Cat", "Sock"));

        for (String category : inputs.keySet()) {
            JPanel b = new JPanel(new FlowLayout(FlowLayout.LEADING));
            b.add(new JLabel(category));

            for (String choice : inputs.get(category)) {
                JButton button = new JButton(choice);
                button.addActionListener(chooseMe);
                b.add(button);
            }
            rows.add(Box.createVerticalStrut(10));
            rows.add(b);
        }

        rows.add(Box.createVerticalStrut(600));

        p.add(rows, BorderLayout.CENTER);
        return p;
    }

    private ActionListener createChoiceAction() {
        ActionListener chooseMe = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton choice = (JButton) e.getSource();

                // find the pane so we can set the choice.
                Container parent = choice.getParent();
                while (!PANE_NAME.equals(parent.getName())) {
                    parent = parent.getParent();
                }

                JOptionPane pane = (JOptionPane) parent;
                pane.setInputValue(choice.getText());

                // find the dialog so we can close it.
                while ((parent != null) &&
                        !DIALOG_NAME.equals(parent.getName()))
                { parent = parent.getParent(); }

                if (parent != null) {
                    parent.setVisible(false);
                }
            }
        };
        return chooseMe;
    }

    public static void main(String[] args) {
        JOptionPaneExample main = new JOptionPaneExample();
        main.showDialog();
    }
}