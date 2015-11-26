import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick() {
        Open inserir = new Openr();
        inserir.onUpgrade();
    }

    public void buttonClickSearch () {
        Open inserir = new Open();
        inserir.buscar();
    }

}