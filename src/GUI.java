import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import PrincetonResources.Picture;

/**
 *
 * @author AdamShamaa
 */
public class GUI extends javax.swing.JFrame {
  /**
	 * Creates new form GUI
	 */

  public GUI() {
    initComponents();
  }

  private void initComponents() {
    /* Start Component Declarations */
    //Declare JLabels
    importJLabel = new javax.swing.JLabel();
    currentPictureJLabel = new javax.swing.JLabel();
    applicationTitleJLabel = new javax.swing.JLabel();
    originalDimensionsJLabel = new javax.swing.JLabel();
    currentDimensionsJLabel = new javax.swing.JLabel();
    pictureJLabel = new javax.swing.JLabel();

    //Declare JButtons
    importJButton = new javax.swing.JButton();
    exportJButton = new javax.swing.JButton();

    //Declare JTextFields
    originalDimensionsJTextField = new javax.swing.JTextField();
    currentDimensionsJTextField = new javax.swing.JTextField();
    currentPictureJTextField = new javax.swing.JTextField();

    //Declare JMenus
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();

    widthHeightJSlider = new javax.swing.JSlider();
    /* End Component Declarations */

    /* Start Component Attributes Modifications*/

    //JFrame Attributes
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(102, 102, 102));

    //JButton Attributes
    importJButton.setText("Import...");
    importJButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        importJButtonActionPerformed(evt);
      }
    });

    exportJButton.setText("Export...");
    exportJButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exportJButtonActionPerformed(evt);
      }
    });

    //JLabel Attributes
    currentPictureJLabel.setText("Current Picture: ");

    applicationTitleJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14));
    applicationTitleJLabel.setText("Smart Image Resizer");

    originalDimensionsJLabel.setText("Original Dimensions:");

    pictureJLabel.setForeground(new java.awt.Color(102, 102, 102));
    pictureJLabel.setAlignmentX(0.5F);

    //JTextField Attributes
    currentPictureJTextField.setEditable(false);
    currentPictureJTextField.setBackground(new java.awt.Color(238, 238, 238));
    currentPictureJTextField.setBorder(null);
    currentPictureJTextField.setOpaque(true);

    currentDimensionsJLabel.setText("Current DImensions:");

    originalDimensionsJTextField.setEditable(false);
    originalDimensionsJTextField.setBackground(new java.awt.Color(238, 238, 238));
    originalDimensionsJTextField.setBorder(null);
    originalDimensionsJTextField.setOpaque(true);

    currentDimensionsJTextField.setEditable(false);
    currentDimensionsJTextField.setBackground(new java.awt.Color(238, 238, 238));
    currentDimensionsJTextField.setBorder(null);
    currentDimensionsJTextField.setOpaque(true);

    //JSlider Attributes
    widthHeightJSlider.setMajorTickSpacing(50);
    widthHeightJSlider.setMinimum(1);
    widthHeightJSlider.setMinorTickSpacing(1);
    widthHeightJSlider.setPaintTicks(true);
    widthHeightJSlider.setSnapToTicks(true);
    widthHeightJSlider.setValue(0);
    widthHeightJSlider.setInverted(true);
    widthHeightJSlider.setMaximumSize(new java.awt.Dimension(282, 30));
    widthHeightJSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseDragged(java.awt.event.MouseEvent evt) {
        widthHeightJSliderMouseDragged(evt);
      }
    });

    //JMenu Attributes
    jMenu1.setText("File");
    jMenuBar1.add(jMenu1);

    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);
    /* End Component Declarations */

    //Mount Components to JFrame (automatically done by NetBeans, highly suggest using NetBeans to modify the layout rather then modifying this code directly.)
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(6, 6, 6).addComponent(importJLabel).addGap(12, 12, 12).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(originalDimensionsJLabel).addComponent(currentDimensionsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(6, 6, 6).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(originalDimensionsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addGap(102, 102, 102).addComponent(applicationTitleJLabel))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(layout.createSequentialGroup().addGap(79, 79, 79).addComponent(importJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(exportJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addComponent(currentPictureJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(currentPictureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGroup(layout.createSequentialGroup().addComponent(currentDimensionsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(widthHeightJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))).addComponent(pictureJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap(36, Short.MAX_VALUE)));
    layout.setVerticalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(9, 9, 9).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(32, 32, 32).addComponent(importJLabel)).addGroup(layout.createSequentialGroup().addGap(30, 30, 30).addComponent(originalDimensionsJLabel).addGap(6, 6, 6).addComponent(currentDimensionsJLabel)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(applicationTitleJLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(originalDimensionsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(currentPictureJLabel).addComponent(currentPictureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(layout.createSequentialGroup().addGap(1, 1, 1).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(exportJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(importJButton)))).addGap(6, 6, 6).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(currentDimensionsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(widthHeightJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE).addComponent(pictureJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE).addGap(24, 24, 24)));

    importJLabel.getAccessibleContext().setAccessibleName("Import Picture...");

    pack();
  }

  private Picture currentPicture; // current picture displayed on the GUI
  private SeamCarver seam; // Seam carver which handles the removal and processing of the image
  private Thread seamThread; // thread allowing the computation of seams in the background
  private double ratio; // ratio to reduce picture size without affecting dimensions
  private final JFileChooser filechooser = new JFileChooser(); //file chooser for the import/export of pictures
  
  //Action-Performed
  private void importJButtonActionPerformed(java.awt.event.ActionEvent evt) {
    importPicture();
  }
  private void exportJButtonActionPerformed(java.awt.event.ActionEvent evt) {
    exportPicture();
  }
  private void widthHeightJSliderMouseDragged(java.awt.event.MouseEvent evt) {
    updatePictureDimension();
  }

  // Initiate file chooser to import picture
  private void importPicture() {
    // file-mode - files only
    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    // Valid file-types Note* first input 'png/jpg' not valid, however required to indicate to user which picture formats are eligible
    filechooser.setFileFilter(new FileNameExtensionFilter("png/jpg", "png", "jpg"));

    int result = -99;
    // open dialog & save result - if opened result = 0, if cancelled result = 1
    result = filechooser.showOpenDialog(this);
    if (result == 0) {
      // show selected file-name on GUI
      currentPictureJTextField.setText(filechooser.getSelectedFile().getName());
      // replace & reinitialize variables with the new imported picture
      currentPicture = new Picture(filechooser.getSelectedFile());
      initializeNewPicture();
    }
  }

  // Initiate file chooser to select a directory to export picture
  private void exportPicture() {
    // set file-mode to directories only
    filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

    int result = -1;
    // open dialog & save result - if save is selected result = 0, if cancelled result = 1
    result = filechooser.showSaveDialog(this);
    if (result == 0) {
      // save current picture to the selected directory as "cropped_(original-picturename).png"
      currentPicture.save(filechooser.getSelectedFile() + "//cropped_" + currentPictureJTextField.getText());
    }
  }

  // update picture width by retrieving picture width from SeamCarver object
  private void updatePictureDimension() {
    currentPicture = seam.getPicture(widthHeightJSlider.getValue());

    // update current dimensions
    currentDimensionsJTextField.setText(currentPicture.width() + " x " + currentPicture.height());

    // update GUI with new picture
    setPicture();
  }

  // initialization for new pictures (reset all variables, threads, objects)
  private void initializeNewPicture() {
    // stop any pre-existing threads to reclaim memory.
    if (seamThread != null) seam.stopThread();

    // Initialize the new picture after 
    seam = new SeamCarver(currentPicture);
    seam.insertJSlider(widthHeightJSlider);

    seamThread = new Thread(seam);
    seamThread.setPriority(seamThread.MAX_PRIORITY);
    seamThread.start();

    // compute the ratio when downsizing the image to a height of 330 pixels. The ratio will then be applied to the width.
    ratio = currentPicture.height() / 330.0;

    // reset displayed dimensions on GUI
    originalDimensionsJTextField.setText(currentPicture.width() + " x " + currentPicture.height());
    currentDimensionsJTextField.setText(currentPicture.width() + " x " + currentPicture.height());

    // update displayed picture on GUI
    setPicture();

    // re-declare the width slider to the entire width of the new picture
    widthHeightJSlider.setMaximum(currentPicture.width());
    widthHeightJSlider.setValue(0);
  }

  // reset/update the display picture on the GUI
  private void setPicture() {
    pictureJLabel.setIcon(new ImageIcon(((ImageIcon) currentPicture.getJLabel().getIcon()).getImage().getScaledInstance((int)(currentPicture.width() / ratio), 330, java.awt.Image.SCALE_SMOOTH))); //Icon initialize with scaled implementation (330 height and automatically scale width)
    pictureJLabel.setHorizontalAlignment(JLabel.CENTER);
    pictureJLabel.setVerticalAlignment(JLabel.CENTER);

    pictureJLabel.updateUI();
    pictureJLabel.validate();
  }

  public static void main(String args[]) {
	    /* Set the Nimbus look and feel */
	    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
			 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
			 */
	    try {
	      for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
	        if ("Nimbus".equals(info.getName())) {
	          javax.swing.UIManager.setLookAndFeel(info.getClassName());
	          break;
	        }
	      }
	    } catch(ClassNotFoundException ex) {
	      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch(InstantiationException ex) {
	      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch(IllegalAccessException ex) {
	      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch(javax.swing.UnsupportedLookAndFeelException ex) {
	      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    //</editor-fold>
	    /* Create and display the JFrame */
	    java.awt.EventQueue.invokeLater(new Runnable() {
	      public void run() {
	        GUI gui = new GUI();
	        gui.setVisible(true);
	      }
	    });
	  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel applicationTitleJLabel;
  private javax.swing.JLabel currentDimensionsJLabel;
  private javax.swing.JTextField currentDimensionsJTextField;
  private javax.swing.JLabel currentPictureJLabel;
  private javax.swing.JTextField currentPictureJTextField;
  private javax.swing.JButton exportJButton;
  private javax.swing.JButton importJButton;
  private javax.swing.JLabel importJLabel;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JLabel originalDimensionsJLabel;
  private javax.swing.JTextField originalDimensionsJTextField;
  private javax.swing.JLabel pictureJLabel;
  private javax.swing.JSlider widthHeightJSlider;
  // End of variables declaration//GEN-END:variables
}