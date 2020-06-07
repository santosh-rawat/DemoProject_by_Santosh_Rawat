package com.example.demoproject_by_santosh_rawat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.system.exitProcess


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AppFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class AppFragment1 : Fragment() {
    lateinit var textView1: TextView
    lateinit var textView: TextView
    lateinit var button_Python: Button
    lateinit var button_Java: Button
    lateinit var button_R: Button
    lateinit var button_Exit: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_app1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.second_text)
       textView.text = "Programming Language"


        button_Python =view.findViewById<Button>(R.id.Python)
        button_Java=view.findViewById<Button>(R.id.Java)
        button_R=view.findViewById<Button>(R.id.R)
        button_Exit=view.findViewById<Button>(R.id.Exit)
        button_Python.setOnClickListener{
            textView1= view.findViewById(R.id.AI_Details1)
            textView1.text="Python is an interpreted, object-oriented, high-level programming language with dynamic semantics. " +
                    "Python's simple, easy to learn syntax emphasizes" +
                    " readability and therefore reduces the cost of program maintenance. " +
                    "Python supports modules and packages, which encourages program modularity and code reuse."
        }
        button_Java.setOnClickListener{
            textView1= view.findViewById(R.id.AI_Details1)
            textView1.text="Java is a general-purpose computer programming language that is concurrent," +
                    " class-based, object-oriented, and specifically designed to have as few implementation " +
                    "dependencies as possible. It is intended to let application developers “write once, run anywhere” (WORA), " +
                    "meaning that compiled Java code can run on all platforms that support Java without the need for recompilation."
        }
        button_R.setOnClickListener{
            textView1= view.findViewById(R.id.AI_Details1)
            textView1.text="R is a programming language and free software environment for " +
                    "statistical computing and graphics supported by the R Foundation for Statistical Computing. " +
                    "The R language is widely used among statisticians and data miners for developing statistical software and data analysis."
        }
        button_Exit.setOnClickListener{
exitProcess(-1)
        }
  }
}