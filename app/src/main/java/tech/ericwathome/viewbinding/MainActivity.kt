package tech.ericwathome.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tech.ericwathome.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaveContact.setOnClickListener {
            transferData()
        }
    }

    private fun transferData() {
        val firstName = binding.edtFirstName.text.toString().trim()
        val lastName = binding.edtLastName.text.toString().trim()

        val userBundle = Bundle()
        userBundle.putString("firstName", firstName) 
        userBundle.putString("lastName", lastName)
        val intent = Intent(this, UserDetailActivity::class.java)
        intent.putExtra("userBundle", userBundle)
        startActivity(intent)
    }
}