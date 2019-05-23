package cam.taxiagency.dao;

import cam.taxiagency.domain.Driver;

public interface DriverDao {
   Driver findByName(String name);
}
