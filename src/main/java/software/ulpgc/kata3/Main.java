package software.ulpgc.kata3;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) throws SQLException {

		MainFrame mainFrame = new MainFrame();
		mainFrame.histogramDisplay().show(histogram());
		mainFrame.setVisible(true);
	}


	private static Histogram histogram() {
		return new Histogram() {
			@Override
			public int bins() {
				return 5;
			}

			@Override
			public double[] values() {
				return  new double[]{5, 4, 5, 454, 54, 3, 6, 7,};
			}
		};
	}
}





