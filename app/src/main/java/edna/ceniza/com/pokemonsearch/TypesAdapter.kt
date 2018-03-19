package edna.ceniza.com.pokemonsearch

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.pokemon_item.view.*

/**
 * Created by Edna Ceniza on 19/03/2018.
 */
class TypesAdapter (val typesList: ArrayList<Types>): RecyclerView.Adapter<TypesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.pokemon_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return typesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val types: Types = typesList[position]
        holder?.view?.txt_1?.setText(types.types)
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }
}
