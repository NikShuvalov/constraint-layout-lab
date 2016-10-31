package shuvalov.nikita.constraintlayoutpracticehw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button grubHubButt, pandoraButt, googlerewardsButt;

        grubHubButt = (Button)findViewById(R.id.grubhub);
        pandoraButt =(Button) findViewById(R.id.pandora);
        googlerewardsButt = (Button)findViewById(R.id.googlerewards);

        grubHubButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GrubHubActivity.class);
                startActivity(intent);
            }
        });

        pandoraButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PandoraActivity.class);
                startActivity(intent);
            }
        });

        googlerewardsButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, GoogleOpinionRewardsActivity.class);
                startActivity(intent);
            }
        });
    }
}
