package newton.com.atmconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;
import newton.com.atmconsultoria.R;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sobre);

        String descricao = "Possui uma estrutura de armazenagem localizada no município de Osasco, \n" +
                "local estratégico com acesso a Rod. Anhanguera, Castelo Branco, Rodoanel, facilitando \n" +
                "a logística e agilizando a entrega. A Best Boi utiliza uma frota de veículos dotados de \n" +
                "Termoking, assegurando a qualidades de nossos produtos até o cliente. Nosso conceito \nde" +
                " sustentabilidade é tornar a empresa ecologicamente correta, economicamente viável, \n" +
                "socialmente justa e culturalmente aceita.\n ";

        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Fale Conosco")
                .addEmail("newtoljunior@hotmail.com","Nos mande um email")
                .addWebsite("atmconsultoria.com.br","Acesse nosso site")
                .addGroup("Redes Sociais")
                .addFacebook("newton.junior.773","Acesse nosso Faceboook")
                .addGitHub("newtonjrfs")
                .create();

        setContentView(sobre);

    }
}
