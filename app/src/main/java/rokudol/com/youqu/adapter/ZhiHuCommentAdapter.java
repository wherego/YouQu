package rokudol.com.youqu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by rokudo on 2017/4/14.
 */

public class ZhiHuCommentAdapter extends FragmentPagerAdapter {
	private List<Fragment> fragmentList;
	private List<String> titleList;

	public ZhiHuCommentAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
		super(fm);
		this.fragmentList = fragmentList;
		this.titleList = titleList;
	}

	@Override
	public Fragment getItem(int position) {
		return fragmentList.get(position);
	}

	@Override
	public int getCount() {
		return fragmentList==null?0:fragmentList.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return titleList.get(position);
	}
}
