package cursoandroid.kotlin.com.app_consultoria.ui.sobre

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cursoandroid.kotlin.com.app_consultoria.R
import mehdi.sakout.aboutpage.AboutPage


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SobreFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SobreFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_sobre, container, false)
        return AboutPage(activity)
            .setImage(R.drawable.logo)
            .setDescription("A ATM Consultoria tem como missão apoiar organizações que desejam alcançar o sucesso através da excelência em gestão e da busca pela qualidade")
            .addGroup("Entre em contato")
            .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
            .addGroup("Redes Sociais")
            .addWebsite("https://www.google.com.br", "Aceso nosso site")
            .addInstagram("Leoocandado")
            .addGitHub("leonardocandado")
            .addPlayStore("com.facebook.katana", "Download App")

            .create()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SobreFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                SobreFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}