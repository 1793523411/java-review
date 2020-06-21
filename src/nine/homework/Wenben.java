package nine.homework;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

import java.util.*;

public class Wenben extends Frame implements TextListener,ActionListener{
	TextArea text1 , text2;



	Wenben()
	{
		setLayout(new FlowLayout());

		text1 = new TextArea(25,30);

		text2 = new TextArea(25,30);

		add(text1);

		add(text2);

		text2.setEditable(false);

		text1.addTextListener(this);

		setBounds(300,300,350,360);

		setVisible(true);

		validate();
	}

	public void textValueChanged(TextEvent e)
	{

		String s = text1.getText();

		StringTokenizer fenxi = new StringTokenizer(s,",'\n'");
		int n = fenxi.countTokens();

		String a[] = new String[n];

		int t = 0;
		for(int i = 0 ; i <n; i ++)
		{
			String temp = fenxi.nextToken();

			a[i] = temp;

			t = t+Integer.parseInt(a[i]);
		}
		int ave = 0;

		ave = t/n;

		String show = "变化的数的和为"+t+"平均值为"+ave;

		text2.setText(show);
	}

	public void actionPerformed(ActionEvent e)
	{

	}
}


class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wenben w = new Wenben();

	}

}
