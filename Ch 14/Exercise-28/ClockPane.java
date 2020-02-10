package clockwork;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ClockPane extends Pane{
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	private double h = 250;
	private double w = 250;
	private boolean hourHandVisible = true;
	private boolean minuteHandVisible = true;
	private boolean secondHandVisible = true;
	public ClockPane() {

		setCurrentTime();
		paintClock();
	}
	public ClockPane(int hour, int minute, int second, double h, double w, boolean hourHandVisible, boolean minuteHandVisible, boolean secondHandVisible) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.h = h;
		this.w = w;
		this.hourHandVisible = hourHandVisible;
		this.minuteHandVisible = minuteHandVisible;
		this.secondHandVisible = secondHandVisible;
		paintClock();
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public double getH() {
		return h;
	}
	public double getW() {
		return w;
	}
	public boolean isHourHandVisible() {
		return hourHandVisible;
	}
	public boolean isMinuteHandVisible() {
		return minuteHandVisible;
	}
	public boolean isSecondHandVisible() {
		return secondHandVisible;
	}
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}
	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}
	public void setH(double h) {
		this.h = h;
		paintClock();
	}
	public void setW(double w) {
		this.w = w;
		paintClock();
	}
	public void setHourHandVisible(boolean hourHandVisible) {
		this.hourHandVisible = hourHandVisible;
		paintClock();
	}
	public void setMinuteHandVisible(boolean minuteHandVisible) {
		this.minuteHandVisible = minuteHandVisible;
		paintClock();
	}
	public void setSecondHandVisible(boolean secondHandVisible) {
		this.secondHandVisible = secondHandVisible;
		paintClock();
	}
	public void setCurrentTime() {
		//Calendar calendar = new GregorianCalendar();
		//this.hour = calendar.get(Calendar.HOUR_OF_DAY) - 12;
		//this.minute = calendar.get(Calendar.MINUTE);
		//this.second = calendar.get(Calendar.SECOND);
		this.hour = (int)(Math.random() * 12);
		int z = (int)(Math.random() * 2);
		if(z == 1) {
			this.minute = 0;
		}
		else {
			this.minute = 30;
		}

		this.second = 15;
		System.out.println(hour + " " + minute + " " + second);

		paintClock();
	}
	protected void paintClock() {
		double clockRadius = Math.min(w,  h) * 0.8 * 0.5;
		double centerX = w / 2;
		double centerY = h / 2;

		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
		//second hand

		double sLength = clockRadius * 0.8;
		double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));		
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		sLine.setStroke(Color.RED);


		//minute hand

		double mLength = clockRadius * 0.65;
		double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, xMinute, minuteY);
		mLine.setStroke(Color.BLUE);

		//hour hand

		
		double hLength = clockRadius * 0.5;
		double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);
	

		
		getChildren().clear();
		getChildren().addAll(circle, t1, t2, t3, t4);
		if(hourHandVisible == true) {
			getChildren().add(hLine);
		}
		if(minuteHandVisible == true) {
			getChildren().add(mLine);
			
		}
		if(secondHandVisible == true) {
			getChildren().add(sLine);
		}
	}

}
