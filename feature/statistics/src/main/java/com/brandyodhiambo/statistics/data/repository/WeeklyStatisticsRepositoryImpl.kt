/*
 * Copyright (C)2023 Brandy Odhiambo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.brandyodhiambo.statistics.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.brandyodhiambo.common.domain.model.WeeklyStatistics
import com.brandyodhiambo.common.domain.repository.WeeklyStatisticRepository
import com.brandyodhiambo.dao.WeeklyStatisticDao
import com.brandyodhiambo.statistics.data.mapper.toWeeklyStatistics
import com.brandyodhiambo.statistics.data.mapper.toWeeklyStatisticsEntity

class WeeklyStatisticsRepositoryImpl(
    private val weeklyStatisticDao: WeeklyStatisticDao
) : WeeklyStatisticRepository {
    override suspend fun insertWeeklyStatistic(weeklyStatistic: WeeklyStatistics) {
        weeklyStatisticDao.insertWeeklyStatistic(weeklyStatistic.toWeeklyStatisticsEntity())
    }

    override suspend fun updateWeeklyStatistic(weeklyStatistic: WeeklyStatistics) {
        TODO("Not yet implemented")
    }

    override fun getWeeklyStatistic(): LiveData<List<WeeklyStatistics>?> {
        return weeklyStatisticDao.getWeeklyStatistics().map { weeklyStatisticsEntity ->
            weeklyStatisticsEntity?.map { it.toWeeklyStatistics() }
        }
    }

    override suspend fun deleteWeeklyStatistic(weeklyStatistic: WeeklyStatistics) {
        weeklyStatisticDao.deleteWeeklyStatistic(weeklyStatistic.toWeeklyStatisticsEntity())
    }

    override suspend fun deleteAllWeeklyStatistic() {
        weeklyStatisticDao.deleteAllWeeklyStatistics()
    }
}
