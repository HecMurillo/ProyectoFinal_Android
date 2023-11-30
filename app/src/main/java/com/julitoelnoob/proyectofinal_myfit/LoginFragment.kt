package com.julitoelnoob.proyectofinal_myfit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginFragment : Fragment() {

    private  var users: List<User> = emptyList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_login, container, false)
        val user = view.findViewById<EditText>(R.id.user)
        val password = view.findViewById<EditText>(R.id.password)
        val button = view.findViewById<Button>(R.id.button)

        button.setOnClickListener {
            validUsers()

            if(user.text != null && password.text !=null){

                var  email = user.text.toString()
                var pass = password.text.toString()

                if (checkUsername(email,users) and checkPassword(pass, users)){
                    Toast.makeText(context, "Usuario correcto", Toast.LENGTH_SHORT).show()

                    //TODO Cambiar a MainActivity
                    val i = Intent(activity, MainActivity:: class.java)
                    startActivity(i)
                    activity?.finish()
                } else{
                    Toast.makeText(context, "El usuario o la contraseña son incorrectos", Toast.LENGTH_SHORT).show()
                }

            } else {
                Toast.makeText(context, "ambos campos son requeridos", Toast.LENGTH_SHORT).show()
            }

        }
        return view
    }
    private fun checkUsername(text: String, users: List<User>): Boolean{
        return users.any(){user ->
            text == user.email
        }

    }
    private fun checkPassword(text: String, users: List<User>): Boolean{
        return users.any()
    }
    fun validUsers(){
        users = listOf(
            User(1,"cheno@gmail.com","1234"),
            User(2,"julio@gmail.com","1234"),
            User(3,"julio","12")

        )

    }
}