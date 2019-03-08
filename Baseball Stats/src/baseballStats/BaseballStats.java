package baseballStats;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpinnerNumberModel;

public class BaseballStats implements ActionListener{
	JPanel mainPanel;
	
	JPanel playerNamePanel;
	JLabel playerNameLabel;
	JTextField playerName;
	
	JPanel spinnersPanel1;
	JLabel g1HitsLabel;
	JSpinner g1Hits;
	JPanel spinnersPanel2;
	JLabel g2HitsLabel;
	JSpinner g2Hits;
	JPanel spinnersPanel3;
	JLabel g3HitsLabel;
	JSpinner g3Hits;
	JPanel spinnersPanel4;
	JLabel g4HitsLabel;
	JSpinner g4Hits;
	JPanel spinnersPanel5;
	JLabel g5HitsLabel;
	JSpinner g5Hits;
	
	JPanel addedPlayersPanel;
	JLabel currentPlayersLabel;
	JTextArea playersBox;
	JScrollPane playersBoxScroll;
	
	JPanel buttons;
	JButton addPlayer;
	JButton resetValues;
	JButton showStats;
	
	ArrayList<Player> pList;
	

	public static void main(String[] args) {
		new BaseballStats();

	}
	
	public BaseballStats() {
		
		pList = new ArrayList<Player>();
		
		JFrame myFrame = new JFrame("Baseball Stats");
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    mainPanel = (JPanel)myFrame.getContentPane();
	    
	    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	    mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    
	    playerNamePanel = new JPanel();
	    playerNameLabel = new JLabel("Player Name");
	    playerNamePanel.add(playerNameLabel);
	    playerName = new JTextField("", 20);
	    playerNamePanel.add(playerName);
	    mainPanel.add(playerNamePanel);
	    
	    spinnersPanel1 = new JPanel();
	    g1HitsLabel = new JLabel("Game 1 Hits:");
	    spinnersPanel1.add(g1HitsLabel);
	    g1Hits = new JSpinner(new SpinnerNumberModel(0,0,5,1));
	    spinnersPanel1.add(g1Hits);
	    mainPanel.add(spinnersPanel1);
	    
	    spinnersPanel2 = new JPanel();
	    g2HitsLabel = new JLabel("Game 2 Hits:");
	    spinnersPanel2.add(g2HitsLabel);
	    g2Hits = new JSpinner(new SpinnerNumberModel(0,0,5,1));
	    spinnersPanel2.add(g2Hits);
	    mainPanel.add(spinnersPanel2);
	    
	    spinnersPanel3 = new JPanel();
	    g3HitsLabel = new JLabel("Game 3 Hits:");
	    spinnersPanel3.add(g3HitsLabel);
	    g3Hits = new JSpinner(new SpinnerNumberModel(0,0,5,1));
	    spinnersPanel3.add(g3Hits);
	    mainPanel.add(spinnersPanel3);
	    
	    spinnersPanel4 = new JPanel();
	    g4HitsLabel = new JLabel("Game 4 Hits:");
	    spinnersPanel4.add(g4HitsLabel);
	    g4Hits = new JSpinner(new SpinnerNumberModel(0,0,5,1));
	    spinnersPanel4.add(g4Hits);
	    mainPanel.add(spinnersPanel4);
	    
	    spinnersPanel5 = new JPanel();
	    g5HitsLabel = new JLabel("Game 5 Hits:");
	    spinnersPanel5.add(g5HitsLabel);
	    g5Hits = new JSpinner(new SpinnerNumberModel(0,0,5,1));
	    spinnersPanel5.add(g5Hits);
	    mainPanel.add(spinnersPanel5);
	    
	    addedPlayersPanel = new JPanel();
	    currentPlayersLabel = new JLabel("Current Players:");
	    addedPlayersPanel.add(currentPlayersLabel);
	    playersBox = new JTextArea(5, 20);
	    playersBox.setLineWrap(true);
	    playersBox.setEditable(false);
	    playersBoxScroll = new JScrollPane(playersBox);
	    playersBoxScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    addedPlayersPanel.add(playersBoxScroll);
	    mainPanel.add(addedPlayersPanel);
	    
	    buttons = new JPanel();
	    addPlayer = new JButton("Add Player");
	    addPlayer.addActionListener(this);
	    buttons.add(addPlayer);
	    resetValues = new JButton("Reset Values");
	    resetValues.addActionListener(this);
	    buttons.add(resetValues);
	    showStats = new JButton("Show Stats");
	    showStats.addActionListener(this);
	    buttons.add(showStats);
	    mainPanel.add(buttons);
	    
	    myFrame.pack();
	    myFrame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object control = e.getSource();
		if (control == addPlayer) {
			Player player = new Player();
			player.name = playerName.getText();
			player.hits[0] = (int) g1Hits.getValue();
			player.hits[1] = (int) g2Hits.getValue();
			player.hits[2] = (int) g3Hits.getValue();
			player.hits[3] = (int) g4Hits.getValue();
			player.hits[4] = (int) g5Hits.getValue();
			pList.add(player);
			playerName.setText("");
			g1Hits.setValue(0);
			g2Hits.setValue(0);
			g3Hits.setValue(0);
			g4Hits.setValue(0);
			g5Hits.setValue(0);
			String playerNameList = "";
			for (Player playerObject : pList) {
				playerNameList += playerObject.name + "\n" ;
			}
			playersBox.setText(playerNameList);
			
		}
		else if (control == resetValues) {
			playerName.setText("");
			g1Hits.setValue(0);
			g2Hits.setValue(0);
			g3Hits.setValue(0);
			g4Hits.setValue(0);
			g5Hits.setValue(0);
			playersBox.setText("");
			pList.clear();
		}
		else if (control == showStats) {
			double totalBats = 25.0;
			String message = "";
			DecimalFormat df = new DecimalFormat("0.000"); 
			for(Player playerObject : pList) {
				int totalHits = 0;
				for(int a = 0; a < 5; a++) {
					totalHits += playerObject.hits[a];
				}
				double battingAvg = (double)totalHits/totalBats;
				message += playerObject.name+": "+df.format(battingAvg)+"\n";
			}
			JOptionPane.showMessageDialog(mainPanel, message);
			
		}
		
	}

}
