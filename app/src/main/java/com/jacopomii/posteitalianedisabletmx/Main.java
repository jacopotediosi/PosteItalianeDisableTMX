package com.jacopomii.posteitalianedisabletmx;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class Main implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {
        if (!lpparam.packageName.equals("com.posteitaliane.spim"))
            return;

        /*
            Code snippet:

            public final void manageTmx(Activity activity, n.e tmxActivityForResult) {
                n.h(activity, "activity");
                n.h(tmxActivityForResult, "tmxActivityForResult");
                TmxConfig tmxConfig = getTmxConfig();
                if (tmxConfig == null || !a1.n.n2(activity) || !new AppConfigHelper().isFeatureEnabled(UtilsConstants.TMX_FEATURE_KEY)) {
                    m665startHomeActivityIoAF18A(activity);
                    return;
                }
            ...
        */

        XposedHelpers.findAndHookMethod(
            "it.posteitaliane.df_sessionmanager.init.LibraryHelper",
            lpparam.classLoader,
            "getTmxConfig",
            XC_MethodReplacement.returnConstant(null)
        );
    }
}