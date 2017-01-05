package com.feifanzhixing.buglydemo.appliction;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * 创建者： feifan.pi 在 2016/12/1.
 */

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.feifanzhixing.buglydemo.appliction.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
