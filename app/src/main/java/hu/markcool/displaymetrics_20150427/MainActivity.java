package hu.markcool.displaymetrics_20150427;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;


public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 設定 Layout 為 activity_main.xml
        setContentView(R.layout.activity_main);

        // 取得螢幕解析度
        DisplayMetrics dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);

        int vWidth = dm.widthPixels;
        int vHeight = dm.heightPixels;

        // 顯示資訊
        TextView tv = ((TextView) findViewById(R.id.showText));

        tv.setText("寬:" + vWidth + ", 高:" + vHeight);
    }
}