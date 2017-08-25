package example.com.kenburnsview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.RandomTransitionGenerator;
import com.flaviofaria.kenburnsview.Transition;

public class MainActivity extends AppCompatActivity {

    KenBurnsView kbv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kbv = (KenBurnsView) findViewById(R.id.image);
//        RandomTransitionGenerator generator = new RandomTransitionGenerator(5000, 2000);
//        kbv.setTransitionGenerator(generator);
    }
}
