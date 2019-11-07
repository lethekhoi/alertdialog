package lethekhoi.ltk.hcmus.alertdialog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mBtnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnDialog = findViewById(R.id.buttonAlertDialog);
        //ctrl +. => chọn remove
        //    Banhmi banhmi = new Banhmi("tron", "salad son", "ca chua bi", "sot bo", "pepsi");
//        Banhmi banhmi= new BanhmiFastFood()
//                .loai("que")
//                .cachua("Ca chua bi")
//                .nuocuong("pepsi")
//                .build();
        //1 :  cac chuc nang set cho o banh mi
        //2 : build o banh mi voi cac chưc năng muôn set lai
//        mBtnDialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setTitle("Hop thoai xac nhan tat appp");
//                builder.setMessage("Ban hay xac nhan ben duoi !!!");
//                builder.setPositiveButton("Co", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                finish();
//                            }
//                        })
//                .setNegativeButton("Khong", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.cancel();
//
//                    }
//                });
//
//                builder.show();
//            }
//        });
        mBtnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Context context;
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Chọn ngôn ngữ sử dụng");
//                builder.setMessage("Các ngôn ngữ thông dụng");

                final String[] arrayLang = {"C", "C++", "Php", "JavaScript", "Scala"};
                boolean[] arrayChecked ={false, false, false, false, false};
                builder.setMultiChoiceItems(arrayLang, arrayChecked, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean isChecked) {
                        if(isChecked){
                            Toast.makeText(MainActivity.this, "Đã check",Toast.LENGTH_SHORT).show();git add
                        }else{
                            Toast.makeText(MainActivity.this, "Bỏ check",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
//                builder.setSingleChoiceItems(arrayLang, -1, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, arrayLang[i], Toast.LENGTH_SHORT).show();
//                        dialogInterface.dismiss();
//                    }
//                });
builder.show();

                //annotation
//                showToast(new Object());
//                builder.show();
            }

//            @Deprecated
//            public void showToast(@NonNull String text) {
//            }
//
//            public void showToast(Object text) {
//            }

            });
        }
    }
