package mono.com.facebook.ads;


public class ImpressionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.facebook.ads.ImpressionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoggingImpression:(Lcom/facebook/ads/Ad;)V:GetOnLoggingImpression_Lcom_facebook_ads_Ad_Handler:Xamarin.Facebook.Ads.IImpressionListenerInvoker, Xamarin.Facebook.AudienceNetwork\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Facebook.Ads.IImpressionListenerImplementor, Xamarin.Facebook.AudienceNetwork, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ImpressionListenerImplementor.class, __md_methods);
	}


	public ImpressionListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ImpressionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Xamarin.Facebook.Ads.IImpressionListenerImplementor, Xamarin.Facebook.AudienceNetwork, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onLoggingImpression (com.facebook.ads.Ad p0)
	{
		n_onLoggingImpression (p0);
	}

	private native void n_onLoggingImpression (com.facebook.ads.Ad p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
