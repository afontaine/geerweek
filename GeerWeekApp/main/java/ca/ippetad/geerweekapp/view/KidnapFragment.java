package ca.ippetad.geerweekapp.view;

import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ca.ippetad.geerweekapp.R;
import ca.ippetad.geerweekapp.model.ClubCapturable;

import java.util.ArrayList;

/**
 * Created by James on 2/8/14.
 */
public class KidnapFragment  extends ListFragment {

    private ArrayList<ClubCapturable> m_clubs = new ArrayList<ClubCapturable>();
    private ClubCapturableAdapter m_adapter;

    public KidnapFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kidnap, container, false);


        m_adapter = new ClubCapturableAdapter(rootView.getContext(), R.layout.capture_list_item, m_clubs);

        setListAdapter(m_adapter);


        return rootView;
    }
}
