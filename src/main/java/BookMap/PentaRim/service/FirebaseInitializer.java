package BookMap.PentaRim.service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;

@Service
public class FirebaseInitializer {
    @PostConstruct
    public void initialize(){
        try{
            FileInputStream serviceAccount=
                    new FileInputStream("./src/main/resources/serviceAccountKey.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
