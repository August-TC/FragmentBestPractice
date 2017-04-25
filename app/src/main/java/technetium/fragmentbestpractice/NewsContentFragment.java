package technetium.fragmentbestpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by August-Tancheng on 2017/4/24.
 */

public class NewsContentFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_frag,container,false);
        return view;
    }

    public void refresh(String newsTitle, String newsContent)
    {
        View visibility = view.findViewById(R.id.visibility_layout);
        visibility.setVisibility(View.VISIBLE);

        TextView newsTitleText = (TextView)view.findViewById(R.id.news_title);
        TextView newsContentText = (TextView)view.findViewById(R.id.news_content);

        newsTitleText.setText(newsTitle);
        newsContentText.setText(newsContent);
    }
}
