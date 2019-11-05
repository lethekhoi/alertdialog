package lethekhoi.ltk.hcmus.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnDialog = findViewById(R.id.buttonAlertDialog);
    //    Banhmi banhmi = new Banhmi("tron", "salad son", "ca chua bi", "sot bo", "pepsi");
        Banhmi banhmi= new BanhmiFastFood()
                .loai("que")
                .cachua("Ca chua bi")
                .nuocuong("pepsi")
                .build();
        //1 :  cac chuc nang set cho o banh mi
        //2 : build o banh mi voi cac chưc năng muôn set lai
        mBtnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
