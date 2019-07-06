package com.sgic.automation.leaveSystem.Recuritment;


import com.sgic.automation.leaveSystem.TestData.Recruitment;
import com.sgic.automation.leaveSystem.pages.DashboardPage;
import com.sgic.automation.leaveSystem.pages.RecruitmentTypePage;
import com.sgic.automation.leaveSystem.utils.TestBase;

import org.testng.annotations.Test;
public class AddRecuritment extends TestBase {

    @Test()
    public void addRecruitementType() {
        DashboardPage.clickManageEpmloyeeMenu();
        DashboardPage.clickManageRecuritmentSubMenu();
        RecruitmentTypePage.AddRecruitmentData();

    }
}
