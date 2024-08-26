package com.example.hww3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hww3_6.databinding.ItemContactsBinding

class ContactAdapter(val contacts: ArrayList<PhoneNumbers>, private val onItemClick: () -> Unit) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return ContactViewHolder(
            ItemContactsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.onBind(contacts[position])
        holder.itemView.setOnClickListener {
            onItemClick.invoke()
        }
    }
    inner class ContactViewHolder(binding: ItemContactsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val binding = binding
        fun onBind(phoneNumbers: PhoneNumbers) {
            binding.apply {
                tvNumber.text = phoneNumbers.number
                tvName.text = phoneNumbers.name
                imgContact.loadImage(phoneNumbers.image)
            }
        }

    }
}