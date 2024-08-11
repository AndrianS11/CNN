package app.ucok.mlwithtensorflowlite;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JenisPenyakit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jenis_penyakit);

        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        if (actionBar != null) {
            // Mengubah teks title pada ActionBar
            actionBar.setTitle("Jenis Penyakit");
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void scorch(View view) {
        Intent intent = new Intent(JenisPenyakit.this, Penyakit.class);
        startActivity(intent);
    }

    public void spot(View view) {
        Intent intent = new Intent(JenisPenyakit.this, LeafSpot.class);
        startActivity(intent);
    }

}