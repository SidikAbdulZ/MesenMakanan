package lat.pam.mesenmakanan

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KeranjangFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_keranjang, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view_keranjang)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        val makananList = ArrayList<Makanan>()
        makananList.add(Makanan("Nasi Goreng", "Rp 15.000", R.mipmap.ic_launcher))

        val adapter = MakananAdapter(makananList)
        recyclerView.adapter = adapter

        val orderButton: Button = view.findViewById(R.id.button_order)
        orderButton.setOnClickListener {
            val intent = Intent(activity, AlamatPengirimanActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}