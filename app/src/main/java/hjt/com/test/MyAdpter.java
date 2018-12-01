package hjt.com.test;

import android.content.Context;

import com.tong.library.adapter.recyclerview.CommonAdapter;
import com.tong.library.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by hjt on 2018/11/28.
 */

public class MyAdpter extends CommonAdapter<String> {
    public MyAdpter(Context context, List<String> datas) {
        super(context, datas);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.rlv_my;
    }

    @Override
    protected void convert(ViewHolder holder, String s, int position) {
        holder.setText(R.id.tv_content,s);
    }
}
