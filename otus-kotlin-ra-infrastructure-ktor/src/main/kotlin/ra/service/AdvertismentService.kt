package ra.service

import multiplatform.dto.*
import multiplatform.dto.enums.Lease
import multiplatform.dto.enums.PropertyType
import multiplatform.mappers.AdvertisementMapper

class AdvertisementService {

    fun get(id: Int?): List<Advertisement> {
        val advertisementList = mutableListOf<Advertisement>()
        val user1 = User("1", "Ivan", "Ivanov")
        val user2 = User("2", "Michail", "Michailov")
        val property1 = Property("1", PropertyType.FLAT, Money("2000.0", "RUB"),
            Address("Moscow", "Moscow Region", city = "Moscow", street = "Rouse", buildNumber = "11"), countOfRooms = 2,
            countOfBaths = 1, square = 39.1, furnished = true, lease = Lease.MONTH)
        val property2 = Property("2",
            PropertyType.HOUSE,
            Money("22050.0", "USD"),
            Address("St.Pet", "Leningrad Region", city = "St.Petersburg", street = "Rouse", buildNumber = "11"),
            countOfRooms = 3,
            countOfBaths = 2,
            square = 69.1,
            furnished = true,
            lease = Lease.ONE_YEAR_AND_MORE)
        advertisementList.add(Advertisement("1", adOwner = user1, property = property1, active = true,
            dateTill = "2021-10-01T10:17:21", dateFrom = "2021-10-01T10:17:21"))
        advertisementList.add(Advertisement("2", adOwner = user2, property = property2, active = true,
            dateTill = "2021-10-01T10:17:21", dateFrom = "2021-10-01T10:17:21"))
        if (id != null) {
            return listOf(advertisementList.get(id))
        }
        return advertisementList
    }

    fun getOne(id: String): Advertisement {
        val user = User("2", "Michail", "Michailov")
        val property2 = Property("2",
            PropertyType.HOUSE,
            Money("22050.0", "USD"),
            Address("St.Pet", "Leningrad Region", city = "St.Petersburg", street = "Rouse", buildNumber = "11"),
            countOfRooms = 3,
            countOfBaths = 2,
            square = 69.1,
            furnished = true,
            lease = Lease.ONE_YEAR_AND_MORE)
        return Advertisement("2", adOwner = user, property = property2, active = true,
            dateTill = "2021-10-01T10:17:21", dateFrom = "2021-10-01T10:17:21")
    }

    fun create(query: Advertisement): model.Advertisement {
        return AdvertisementMapper.INSTANCE.toBack(query)
    }

}



