package edna.ceniza.com.pokemonsearch

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.pokemon_item.view.*

/**
 * Created by Edna Ceniza on 19/03/2018.
 */
class AbilitiesAdapter (val abilitiesList: ArrayList<Abilities>): RecyclerView.Adapter<AbilitiesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.pokemon_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return abilitiesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val abilities: Abilities = abilitiesList[position]
        holder?.view?.txt_1?.setText(abilities.abilities)
    }
    class ViewHolder (val view: View): RecyclerView.ViewHolder(view){

    }
}