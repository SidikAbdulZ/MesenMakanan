package lat.pam.mesenmakanan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view_makanan)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        val makananList = ArrayList<Makanan>()
        makananList.add(Makanan("Nasi Goreng", "Rp 15.000", R.mipmap.ic_launcher))
        makananList.add(Makanan("Mie Goreng", "Rp 12.000", R.mipmap.ic_launcher))
        makananList.add(Makanan("Ayam Bakar", "Rp 25.000", R.mipmap.ic_launcher))

        val adapter = MakananAdapter(makananList)
        recyclerView.adapter = adapter

        return view
    }
}