package thescone.myexercise6;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private TextView textMsg;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textMsg = (TextView) findViewById(R.id.textMsg);
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        textMsg.setText("onSingleTapConfirmed");
        return true; // means the touch event was handled
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        textMsg.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        textMsg.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        textMsg.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        textMsg.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        textMsg.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        textMsg.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        textMsg.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        textMsg.setText("onFling");
        return true;
    }

    // default functionality that get called when user touch screen
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
