package com.anthonycode.animation_provided.Common.SpalshScreen.User.ForgotPassword;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.anthonycode.animation_provided.R;

public class SendOTPActivity extends AppCompatActivity {

    EditText inputMobile;
    Button btnGetOTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_o_t_p);
//
//        //Hooks
//        btnGetOTP = findViewById(R.id.getOTP);
//        inputMobile = findViewById(R.id.inputMobile);
//
//        final ProgressBar progressBar = findViewById(R.id.progessBar);
//
//
//        btnGetOTP.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (inputMobile.getText().toString().trim().isEmpty()){
//                    Toast.makeText(SendOTPActivity.this, "Enter Mobile", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                progressBar.setVisibility(View.VISIBLE);
//                btnGetOTP.setVisibility(View.INVISIBLE);
//
//                PhoneAuthProvider.getInstance().verifyPhoneNumber(
//                        "+84" + inputMobile.getText().toString(),
//                        60,
//                        TimeUnit.SECONDS,
//                        com.example.otpverification.SendOTPActivity.this,
//                        new PhoneAuthProvider.OnVerificationStateChangedCallbacks(){
//
//                            @Override
//                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
//                                progressBar.setVisibility(View.GONE);
//                                btnGetOTP.setVisibility(View.VISIBLE);
//                            }
//
//                            @Override
//                            public void onVerificationFailed(@NonNull FirebaseException e) {
//                                progressBar.setVisibility(View.GONE);
//                                btnGetOTP.setVisibility(View.VISIBLE);
//                                Toast.makeText(SendOTPActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
//                            }
//
//                            @Override
//                            public void onCodeSent(@NonNull String verificationId, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
//                                progressBar.setVisibility(View.GONE);
//                                btnGetOTP.setVisibility(View.VISIBLE);
//
//                                Intent intent = new Intent(getApplicationContext(), VerifyOTPActivity.class);
//                                intent.putExtra("mobile", inputMobile.getText().toString());
//                                intent.putExtra("verificationId", verificationId);
//                                startActivity(intent);
//                            }
//                        }
//                );
//
//
//            }
//        });
//
    }
}