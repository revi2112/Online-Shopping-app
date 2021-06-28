
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Form extends AppCompatActivity {
    Button sendBtn;
    EditText name,email,number,address;

    String name1,desc,price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
         name = findViewById(R.id.pname);
         email = findViewById(R.id.pemail);
         number = findViewById(R.id.pno);
         address = findViewById(R.id.padd);

        Intent i2=getIntent();
        name1 = i2.getStringExtra("name");
        desc = i2.getStringExtra("desc");
        price= i2.getStringExtra("price");

        Button btn = findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ContextCompat.checkSelfPermission(Form.this, Manifest.permission.SEND_SMS)==PackageManager.PERMISSION_GRANTED ){
                    sendMessage();
                }
                else
                {
                    ActivityCompat.requestPermissions(Form.this,new String[]{
                            Manifest.permission.SEND_SMS},100);

                }

                //alert that order placed thank you message

                Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(i);
            }
        });

    }
    private void sendMessage(){
        String p1="xxxxxxxxxx"; //number
        String p=number.getText().toString().trim();
        String m0=name.getText().toString().trim();
        String m1=email.getText().toString().trim();
        String m2=address.getText().toString().trim();

        if(!p1.equals("")&&!m0.equals("")){
            SmsManager smsManager=SmsManager.getDefault();
            smsManager.sendTextMessage(p1,null,m0+" "+m1+" "+m2+" "+p+" "+name1+" "+desc+" "+price+" ",null,null);
            Toast.makeText(getApplicationContext(),"Order Placed",Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(getApplicationContext(),"no",Toast.LENGTH_LONG).show();

        }
    }



    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==100&& grantResults.length>0 &&grantResults[0]==PackageManager.PERMISSION_GRANTED){
            sendMessage();
        }
        else{
            Toast.makeText(getApplicationContext(),"Denied",Toast.LENGTH_SHORT).show();
        }
    }

}
