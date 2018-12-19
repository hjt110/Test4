package hjt.com.test;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.tong.library.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {


    @BindView(R.id.banner)
    ConvenientBanner banner;

    private String[] imagesString = new String[]{"https://img2.woyaogexing.com/2018/08/14/9dc2bb4e96604f6993e46b05ed17915c!600x600.jpeg", "https://img2.woyaogexing.com/2018/08/14/f1472844169f4c059c0add35b10ecda9!600x600.jpeg", "https://img2.woyaogexing.com/2018/08/14/c47a1c92bc8449178f966a90285e1f88!600x600.jpeg"};
    private List imgList = new ArrayList();

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        for(String img:imagesString){
            imgList.add(img);
        }
        banner.setPages(new CBViewHolderCreator() {
            @Override
            public LocalImageHolder createHolder(View itemView) {
                return new LocalImageHolder(itemView);
            }

            @Override
            public int getLayoutId() {
                return R.layout.banner;
            }
        }, imgList);

    }

    @Override
    protected void initEvent() {

    }

    public class LocalImageHolder extends Holder<String> {

        private ImageView img;

        public LocalImageHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void initView(View itemView) {
            img = itemView.findViewById(R.id.img);
        }

        @Override
        public void updateUI(String data) {
            Glide.with(getActivity()).load(data).into(img);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

}
