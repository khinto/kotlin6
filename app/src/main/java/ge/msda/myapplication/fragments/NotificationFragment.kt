package ge.msda.myapplication.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ge.msda.myapplication.R
import kotlinx.android.synthetic.main.fragment_notification.view.*

/*
* Created by ნიკოლოზ კაციტაძე on 5/7/20
*/

class NotificationFragment : Fragment(R.layout.fragment_notification) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.textView2.text = NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()

    }

}