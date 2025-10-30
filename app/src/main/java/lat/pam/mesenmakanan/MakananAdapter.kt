package lat.pam.mesenmakanan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MakananAdapter(private val makananList: List<Makanan>) : RecyclerView.Adapter<MakananAdapter.MakananViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_makanan,
            parent, false)
        return MakananViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        val currentItem = makananList[position]

        holder.imageView.setImageResource(currentItem.image)
        holder.textViewNama.text = currentItem.name
        holder.textViewHarga.text = currentItem.price
    }

    override fun getItemCount() = makananList.size

    class MakananViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view_makanan)
        val textViewNama: TextView = itemView.findViewById(R.id.text_view_nama_makanan)
        val textViewHarga: TextView = itemView.findViewById(R.id.text_view_harga_makanan)
    }
}