package tech.ericwathome.viewbinding

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import tech.ericwathome.viewbinding.databinding.ActivityUserDetailBinding

class UserDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserDetailBinding

    companion object {
        val TAG = this::class.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initializeViews()
    }

    private fun initializeViews() {
        val userDetails = intent.getBundleExtra("userBundle")
        var firstName = ""
        var lastName = ""

        userDetails?.let {
            firstName = userDetails.getString("firstName", "")
            lastName = userDetails.getString("lastName", "")
        }

        Log.i(TAG, "initializeViews: first name=$firstName, last name=$lastName")
    }


}