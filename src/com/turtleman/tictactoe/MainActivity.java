package com.turtleman.tictactoe;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	static String currentPlayer = "x";
	static String[] board = new String[] {"b","b","b","b","b","b","b","b","b"};
	
	public void clearAll(){
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);		
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);		
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);		
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);		
		ImageView image5 = (ImageView)findViewById(R.id.imageView5);		
		ImageView image6 = (ImageView)findViewById(R.id.imageView6);		
		ImageView image7 = (ImageView)findViewById(R.id.imageView7);		
		ImageView image8 = (ImageView)findViewById(R.id.imageView8);		
		ImageView image9 = (ImageView)findViewById(R.id.imageView9);
		
		TextView result = (TextView)findViewById(R.id.resultText);
		
		image1.setImageResource(R.drawable.blank);
		image2.setImageResource(R.drawable.blank);
		image3.setImageResource(R.drawable.blank);
		image4.setImageResource(R.drawable.blank);
		image5.setImageResource(R.drawable.blank);
		image6.setImageResource(R.drawable.blank);
		image7.setImageResource(R.drawable.blank);
		image8.setImageResource(R.drawable.blank);
		image9.setImageResource(R.drawable.blank);
		
		image1.setClickable(true);
		image2.setClickable(true);
		image3.setClickable(true);
		image4.setClickable(true);
		image5.setClickable(true);
		image6.setClickable(true);
		image7.setClickable(true);
		image8.setClickable(true);
		image9.setClickable(true);

		board[0] = "b";
		board[1] = "b";
		board[2] = "b";
		board[3] = "b";
		board[4] = "b";
		board[5] = "b";
		board[6] = "b";
		board[7] = "b";
		board[8] = "b";
		
		result.setText(" ");
		
		currentPlayer = "x";
		
	}

	public void gameOver(String winner) {
		// TODO Auto-generated method stub
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);		
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);		
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);		
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);		
		ImageView image5 = (ImageView)findViewById(R.id.imageView5);		
		ImageView image6 = (ImageView)findViewById(R.id.imageView6);		
		ImageView image7 = (ImageView)findViewById(R.id.imageView7);		
		ImageView image8 = (ImageView)findViewById(R.id.imageView8);		
		ImageView image9 = (ImageView)findViewById(R.id.imageView9);
		
		TextView result = (TextView)findViewById(R.id.resultText);
		
		image1.setClickable(false);
		image2.setClickable(false);
		image3.setClickable(false);
		image4.setClickable(false);
		image5.setClickable(false);
		image6.setClickable(false);
		image7.setClickable(false);
		image8.setClickable(false);
		image9.setClickable(false);
		
		result.setText("Winner: " + winner);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		clearAll();

	}
	
	
	
	public void update(ImageView view, int pos){
		
		//update the "board"
		board[pos] = currentPlayer;
		
		//update the tile
		view.setClickable(false);
		if (currentPlayer == "x"){
			view.setImageResource(R.drawable.x);
			currentPlayer = "o";
		}
		else{
			view.setImageResource(R.drawable.o);
			currentPlayer = "x";
		}
		
		if (board[0]=="x" & board[1]=="x" & board[2]=="x" | 
				board[3]=="x" & board[4]=="x" & board[5]=="x" |
				board[6]=="x" & board[7]=="x" & board[8]=="x" |
				board[0]=="x" & board[3]=="x" & board[6]=="x" |
				board[1]=="x" & board[4]=="x" & board[7]=="x" |
				board[2]=="x" & board[5]=="x" & board[8]=="x" |
				board[0]=="x" & board[4]=="x" & board[8]=="x" |
				board[2]=="x" & board[4]=="x" & board[6]=="x" ){
				gameOver("x");
			}
		else if (board[0]=="o" & board[1]=="o" & board[2]=="o" | 
				board[3]=="o" & board[4]=="o" & board[5]=="o" |
				board[6]=="o" & board[7]=="o" & board[8]=="o" |
				board[0]=="o" & board[3]=="o" & board[6]=="o" |
				board[1]=="o" & board[4]=="o" & board[7]=="o" |
				board[2]=="o" & board[5]=="o" & board[8]=="o" |
				board[0]=="o" & board[4]=="o" & board[8]=="o" |
				board[2]=="o" & board[4]=="o" & board[6]=="o" ){
				gameOver("o");
			}
		else if (board[0]!="b" & board[1]!="b" & board[2]!="b" & 
				board[3]!="b" & board[4]!="b" & board[5]!="b" &
				board[6]!="b" & board[7]!="b" & board[8]!="b"){
				TextView result = (TextView)findViewById(R.id.resultText);
				result.setText("Tie");

		}
			
		
	}
	
	
	
	
	
	
	



	public void one(View view) {  
		//Implement image click function  
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);		
		update(image1,0);
	}
	public void two(View view) {  
		//Implement image click function    
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);
		update(image2,1);
	}
	public void three(View view) {  
		//Implement image click function    
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);
		update(image3,2);
	}
	public void four(View view) {  
		//Implement image click function    
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);
		update(image4,3);
	}
	public void five(View view) {  
		//Implement image click function    
		ImageView image5 = (ImageView)findViewById(R.id.imageView5);
		update(image5,4);
	}
	public void six(View view) {  
		//Implement image click function    
		ImageView image6 = (ImageView)findViewById(R.id.imageView6);
		update(image6,5);
	}
	public void seven(View view) {  
		//Implement image click function    
		ImageView image7 = (ImageView)findViewById(R.id.imageView7);
		update(image7,6);
	}
	public void eight(View view) {  
		//Implement image click function    
		ImageView image8 = (ImageView)findViewById(R.id.imageView8);
		update(image8,7);
	}
	public void nine(View view) {  
		//Implement image click function    
		ImageView image9 = (ImageView)findViewById(R.id.imageView9);
		update(image9,8);
	}
	
	public void restartButton(View view) {  
		//Implement image click function    
		clearAll();
	}
	
}
