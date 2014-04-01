/*
 * Copyright (c) 2014 Andrew Fontaine, James Finlay, Jesse Tucker, Jacob Viau, and Evan DeGraff
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package ca.ippetad.geerweekapp.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import ca.ippetad.geerweekapp.R;
import ca.ippetad.geerweekapp.model.Capturable;
import ca.ippetad.geerweekapp.model.ClubCapturable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Andrew Fontaine
 * @version 1.0
 * @since 09/02/14
 */
public class ClubCapturableAdapter extends ArrayAdapter<ClubCapturable> {

    private Context _context;
    private int _layoutResourceId;
    private ArrayList<ClubCapturable> _clubs = null;

    public ClubCapturableAdapter(Context context, int layoutResourceId, ArrayList<ClubCapturable> clubs){
        super(context, layoutResourceId, clubs);
        this._context = context;
        this._layoutResourceId = layoutResourceId;
        this._clubs = clubs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.capture_list_item, null);
        }

        ClubCapturable i = _clubs.get(position);
        if(i != null) {
            TextView name = (TextView) row.findViewById(R.id.ClubName);
            ImageView flag = (ImageView) row.findViewById(R.id.Flag);
            ImageView prez = (ImageView) row.findViewById(R.id.President);
            ImageView prrep = (ImageView) row.findViewById(R.id.PrRep);
            HashMap<String, Capturable> capturables = i.getCapturables();
            if(name != null) {
                name.setText(i.getName());
            }
            if(flag != null) {
                Bitmap flg = capturables.get(ClubCapturable.FLAG).getImage();
                if(flg != null)
                    flag.setImageBitmap(flg);
            }

            if(prez != null) {
                Bitmap prz = capturables.get(ClubCapturable.PRESIDENT).getImage();
                if(prz != null)
                    prez.setImageBitmap(prz);
            }

            if(prrep != null) {
                Bitmap prrp = capturables.get(ClubCapturable.FLAG).getImage();
                if(prrp != null)
                    prrep.setImageBitmap(prrp);
            }
        }

        return row;

    }
}
