package com.anthonycode.animation_provided.Common.SpalshScreen.User.ForgotPassword;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.anthonycode.animation_provided.R;

public class VerifyOTPActivity extends AppCompatActivity {

    TextView textMobile;
    private EditText in1, in2, in3, in4, in5, in6;
    private String verificationId;
    private TextView resendOTP;
    Button btnVerifyCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_o_t_p);

        //Hooks
        btnVerifyCode =  findViewById(R.id.btnVerifyOtpCode);

        btnVerifyCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//        textMobile = findViewById(R.id.textMobile);
//        resendOTP = findViewById(R.id.resend_otp);
//        in1 = findViewById(R.id.inputCode1);
//        in2 = findViewById(R.id.inputCode2);
//        in3 = findViewById(R.id.inputCode3);
//        in4 = findViewById(R.id.inputCode4);
//        in5 = findViewById(R.id.inputCode5);
//        in6 = findViewById(R.id.inputCode6);
//
//        textMobile.setText(String.format("+84-%s", getIntent().getStringExtra("mobile")));
//
//        setUpOTPInputs();
//
//        final ProgressBar progressBar = findViewById(R.id.progessBar_);
//        final Button btnVerifyOTP = findViewById(R.id.verify_otp_);
//        verificationId = getIntent().getStringExtra("verificationId");
//        btnVerifyOTP.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (in1.getText().toString().isEmpty()
//                        || in2.getText().toString().isEmpty()
//                        || in3.getText().toString().isEmpty()
//                        || in4.getText().toString().isEmpty()
//                        || in5.getText().toString().isEmpty()
//                        || in6.getText().toString().isEmpty()) {
//                    Toast.makeText(VerifyOTPActivity.this, "Please enter valid code!", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                String codeValid =
//                        in1.getText().toString() +
//                                in2.getText().toString() +
//                                in3.getText().toString() +
//                                in4.getText().toString() +
//                                in5.getText().toString() +
//                                in6.getText().toString();
//                if (verificationId != null) {
//                    progressBar.setVisibility(View.VISIBLE);
//                    btnVerifyOTP.setVisibility(View.INVISIBLE);
//
//                    PhoneAuthCredential phoneAuthCredential = PhoneAuthProvider.getCredential(verificationId, codeValid);
//                    FirebaseAuth.getInstance().signInWithCredential(phoneAuthCredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            progressBar.setVisibility(View.GONE);
//                            btnVerifyOTP.setVisibility(View.GONE);
//                            if (task.isSuccessful()) {
//                                Intent intent = new Intent(getApplicationContext(), Home.class);
//                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                                startActivity(intent);
//                            } else {
//                                Toast.makeText(VerifyOTPActivity.this, "The verification code entered was invalid!", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    });
//                }
//            }
//        });
//
//        resendOTP.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PhoneAuthProvider.getInstance().verifyPhoneNumber(
//                        "+84" + getIntent().getStringExtra("mobile"),
//                        60,
//                        TimeUnit.SECONDS,
//                        com.example.otpverification.VerifyOTPActivity.this,
//                        new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
//
//                            @Override
//                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
//                            }
//
//                            @Override
//                            public void onVerificationFailed(@NonNull FirebaseException e) {
//                                Toast.makeText(VerifyOTPActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
//                            }
//
//                            @Override
//                            public void onCodeSent(@NonNull String newVerificationId, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
//                                verificationId = newVerificationId;
//                                Toast.makeText(VerifyOTPActivity.this, "OTP Sent", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                );
//            }
//        });
    }
//
//    private void setUpOTPInputs() {
//        in1.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
//                if (!charSequence.toString().isEmpty()) {
//                    in2.requestFocus();
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
//        in2.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
//                if (!charSequence.toString().isEmpty()) {
//                    in3.requestFocus();
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
//        in3.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
//                if (!charSequence.toString().isEmpty()) {
//                    in4.requestFocus();
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
//        in4.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
//                if (!charSequence.toString().isEmpty()) {
//                    in5.requestFocus();
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
//        in5.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
//                if (!charSequence.toString().isEmpty()) {
//                    in6.requestFocus();
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
//    }
}