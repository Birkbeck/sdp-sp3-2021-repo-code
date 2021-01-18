package macwire.lazzy

import macwire.spec._

object TrainStation extends App {
  lazy val pointSwitcher = new PointSwitcher()
  lazy val trainCarCoupler = new TrainCarCoupler()
  lazy val trainShunter = new TrainShunter( pointSwitcher, trainCarCoupler)

  lazy val craneController = new CraneController()
  lazy val trainLoader = new TrainLoader( craneController, pointSwitcher)

  lazy val trainDispatch = new TrainDispatch()

  lazy val trainStation = new TrainStation( trainShunter, trainLoader, trainDispatch)

  trainStation.prepareAndDispatchNextTrain()
}
