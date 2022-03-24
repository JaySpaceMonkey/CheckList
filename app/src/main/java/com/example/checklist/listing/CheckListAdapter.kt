package com.example.checklist


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.checklist.databinding.TaskcardBinding


class CheckListAdapter(
    var checkList:List<CheckList>
):RecyclerView.Adapter<CheckListAdapter.CheckListViewHolder>() {
    inner class CheckListViewHolder(val binding: TaskcardBinding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheckListViewHolder {
             //val view=LayoutInflater.from(parent.context).inflate(R.layout.taskcard,parent,false)
        return  CheckListViewHolder(
            TaskcardBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(
        holder: CheckListViewHolder,
        position: Int
    ) {
        //TODO("Not yet implemented")
        holder.itemView.apply {
           holder.binding.etTaskTitle.setText(checkList[position].taskTitle)
            holder.binding.etTaskType.setText(checkList[position].taskType)
           // binding.et_task_title.text=checkList[position].taskTitle
            //et_task_type.text=checkList[position].taskType
        }
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return checkList.size
    }
}