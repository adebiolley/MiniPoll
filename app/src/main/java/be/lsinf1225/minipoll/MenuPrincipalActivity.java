package be.lsinf1225.minipoll;

//import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;
//import android.widget.TextView;

public class MenuPrincipalActivity extends AppCompatActivity {
    Button btn_new;
    Button btn_sond;
    Button btn_quest;
    Button btn_aide;
    Button btn_friends;
    Button btn_profil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btn_new = findViewById(R.id.button4);
        btn_quest = findViewById(R.id.button2);
        btn_sond = findViewById(R.id.button5);
        btn_aide = findViewById(R.id.button3);
        btn_friends = findViewById(R.id.button);
        btn_profil = findViewById(R.id.button6);

        setFontBut(btn_aide, "GeosansLight.ttf");
        setFontBut(btn_new, "GeosansLight.ttf");
        setFontBut(btn_sond, "GeosansLight.ttf");
        setFontBut(btn_quest, "GeosansLight.ttf");

        btn_profil.setOnClickListener(btn_profil_ls);
        btn_friends.setOnClickListener(btn_friends_ls);
        btn_aide.setOnClickListener(btn_aide_ls);
        btn_sond.setOnClickListener(btn_sond_ls);
        btn_quest.setOnClickListener(btn_quest_ls);
        btn_new.setOnClickListener(btn_new_ls);



    }

    View.OnClickListener btn_profil_ls = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i("DEBUG","Bouton profil");
        }
    };
    View.OnClickListener btn_new_ls = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i("DEBUG","Bouton nouveau");
        }
    };
    View.OnClickListener btn_quest_ls = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i("DEBUG","Bouton questionnaire");
        }
    };
    View.OnClickListener btn_sond_ls = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i("DEBUG","Bouton sondage");
        }
    };
    View.OnClickListener btn_friends_ls = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i("DEBUG","Bouton amis");
        }
    };

    View.OnClickListener btn_aide_ls = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i("DEBUG","Bouton aide");
        }
    };
    public void setFontTxt(TextView textView, String fontName) {
        if(fontName != null){
            try {
                Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/" + fontName);
                textView.setTypeface(typeface);
            } catch (Exception e) {
                Log.e("FONT", fontName + " not found", e);
            }
        }
    }
    public void setFontBut(Button button, String fontName) {
        if(fontName != null){
            try {
                Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/" + fontName);
                button.setTypeface(typeface);
            } catch (Exception e) {
                Log.e("FONT", fontName + " not found", e);
            }
        }
    }
}
