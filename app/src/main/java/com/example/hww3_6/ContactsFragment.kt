package com.example.hww3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hww3_6.databinding.FragmentContactsBinding

class ContactsFragment : Fragment() {

    private lateinit var binding: FragmentContactsBinding
    private lateinit var adapter: ContactAdapter
    private var contacts = ArrayList<PhoneNumbers>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentContactsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = ContactAdapter(contacts) {
            val bundle = Bundle()
            var contacts = contacts
            bundle.putString("name", contacts.first().name)
            var fragment = ChatFragment()
            fragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view,fragment).addToBackStack(null).commit()
        }
        binding.rvContacts.adapter = adapter
    }

    private fun loadData() {
       contacts.add(PhoneNumbers("Tahmina", "123343", "https://png.pngtree.com/png-vector/20230928/ourmid/pngtree-happy-little-son-baby-png-image_10148745.png"))
        contacts.add(PhoneNumbers("Tahmina", "123343", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCqWMzlEtM8cyRCmwxS9lIPWk-5bbiDBS1hw&s"))
        contacts.add(PhoneNumbers("Tahmina", "123343", "https://assets.teenvogue.com/photos/578fbfac6e85f8db434d48e3/16:9/w_1872,h_1053,c_limit/Screen%20Shot%202016-07-20%20at%202.12.15%20PM.png"))
        contacts.add(PhoneNumbers("Tahmina", "123343", "https://assets.teenvogue.com/photos/578fbfac6e85f8db434d48e3/16:9/w_1872,h_1053,c_limit/Screen%20Shot%202016-07-20%20at%202.12.15%20PM.png"))
        contacts.add(PhoneNumbers("Tahmina", "123343", "https://assets.teenvogue.com/photos/578fbfac6e85f8db434d48e3/16:9/w_1872,h_1053,c_limit/Screen%20Shot%202016-07-20%20at%202.12.15%20PM.png"))
        contacts.add(PhoneNumbers("Tahmina", "123343", "https://assets.teenvogue.com/photos/578fbfac6e85f8db434d48e3/16:9/w_1872,h_1053,c_limit/Screen%20Shot%202016-07-20%20at%202.12.15%20PM.png"))
    }
}
