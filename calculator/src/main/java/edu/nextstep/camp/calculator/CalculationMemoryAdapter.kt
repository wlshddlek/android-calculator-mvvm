package edu.nextstep.camp.calculator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import edu.nextstep.camp.calculator.data.CalculationRecord
import edu.nextstep.camp.calculator.databinding.ItemResultBinding

/**
 * 계산기록리스트 adapter
 * Created by jeongjinhong on 2022. 07. 24..
 */
class CalculationMemoryAdapter() :
    ListAdapter<CalculationRecord, RecyclerView.ViewHolder>(ItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemResultBinding =
            ItemResultBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(itemResultBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is Holder) {
            holder.setData(getItem(holder.adapterPosition))
        }
    }
}