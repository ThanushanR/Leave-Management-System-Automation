package com.sgic.automation.leaveSystem.TestData;

import com.sgic.automation.leaveSystem.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class Recruitment {

    public class RecruitmentData extends ExcelDataConfig {

        private final Logger LOGGER = Logger.getLogger(RecruitmentData.class);

        public RecruitmentData() {
            super
                    ("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
        }

        @DataProvider(name = "AddRecruitment")
        public Object[][] AddRecruitment() {

            int rows = getRowCount("Sheet1");
            int col = getColumnCount("Sheet1");

            LOGGER.info("row = " + rows + " columns = " + col);

            Object[][] data = new Object[rows][col];
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < col; j++) {
                    data[i - 1][j] = getData("Sheet1", i, j);
                }
            }
            return data;
        }

    }
}