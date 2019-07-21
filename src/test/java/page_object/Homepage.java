package page_object;

import driver.DriverHelper;

public class Homepage  extends DriverHelper
{
    public String getHomepageUrl()
    {
       return driver.getCurrentUrl();
    }

}
