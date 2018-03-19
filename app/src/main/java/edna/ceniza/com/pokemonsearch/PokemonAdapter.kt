package edna.ceniza.com.pokemonsearch

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.pokemon_item.view.*

/**
 * Created by Edna Ceniza on 18/03/2018.
 */
class PokemonAdapter (val statsList: ArrayList<Stats>): RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.pokemon_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return statsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val stats: Stats = statsList[position]
        holder?.view?.txt_1?.setText(stats.stats)
        holder?.view?.txt_2?.setText(stats.base_stat)
        holder?.view?.txt_2?.visibility = View.VISIBLE
    }

    class ViewHolder (val view: View): RecyclerView.ViewHolder(view){

    }
}




