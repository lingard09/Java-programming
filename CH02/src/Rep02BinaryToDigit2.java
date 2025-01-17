import javax.swing.JOptionPane;


public class Rep02BinaryToDigit2 {
	public static void main(String[] args) {
		String input;
		input = JOptionPane.showInputDialog("Enter a 4-bit binary number: ");
		int output = 0;
		int flag = 0;
		
		if(input.length() == 4) {
			for(int i=0; i<4; i++) {
				if(input.charAt(i) == '1' || input.charAt(i) == '0') {
					if(input.charAt(i) == '1') {
						output += Math.pow(2, (3-i));
					}
				}
				else {
					flag ++;
				}
			}
		}
		else {
			flag ++;
		}
		
		if(flag == 0) {
			JOptionPane.showMessageDialog(null, "The decimal value is: " + output);
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid input. Please a 4-bit binary number.");	
		}
		
		System.exit(0);
	}
}
