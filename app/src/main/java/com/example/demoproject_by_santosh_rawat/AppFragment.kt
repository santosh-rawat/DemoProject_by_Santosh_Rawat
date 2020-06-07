package com.example.demoproject_by_santosh_rawat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AppFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AppFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var button_ML: Button
    lateinit var button_DS: Button
    lateinit var button_AI: Button
    lateinit var textView: TextView
    lateinit var AI_textView: TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_app, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.first_fragment_text)
        //textView.text  = "Know About Technologies "

       button_AI =view.findViewById<Button>(R.id.AI)
        button_DS =view.findViewById<Button>(R.id.DataScience)
        button_ML =view.findViewById<Button>(R.id.MachineLearning)
        button_AI.setOnClickListener{
            AI_textView= view.findViewById(R.id.AI_Details)
            AI_textView.text="Artificial intelligence (AI) is the ability of a computer program or a machine to think and learn. " +
                    "It is also a field of study which tries to make computers \"smart\". They work on their own without being encoded " +
                    "with commands. John McCarthy came up with the name \"Artificial Inteligencence\" in 1955."
          //  val intent = Intent (this.context, AppFragment1::class.java)
            //startActivity(intent)
        }
        button_DS.setOnClickListener{
            AI_textView= view.findViewById(R.id.AI_Details)
            AI_textView.text="Data Science. Data science is the study of data. It involves developing methods of " +
                    "recording, storing, and analyzing data to effectively extract useful information." +
                    " The goal of data science is to gain insights and knowledge from any type of data — " +
                    "both structured and unstructured"
                   }
        button_ML.setOnClickListener{
            AI_textView= view.findViewById(R.id.AI_Details)
            AI_textView.text="Machine learning is an application of artificial intelligence (AI) " +
                    "that provides systems the ability to automatically learn and improve from experience without " +
                    "being explicitly programmed. Machine learning focuses on the development of computer programs" +
                    " that can access data and use it learn for themselves."
        }

    }






}
