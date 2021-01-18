package macwire.eager

import macwire.spec._

object TrainStation extends App {
  val pointSwitcher = new PointSwitcher()
  val trainCarCoupler = new TrainCarCoupler()
  val trainShunter = new TrainShunter(pointSwitcher, trainCarCoupler)

  val craneController = new CraneController()
  val trainLoader = new TrainLoader(craneController, pointSwitcher)

  val trainDispatch = new TrainDispatch()

  val trainStation = new TrainStation(trainShunter, trainLoader, trainDispatch)

  trainStation.prepareAndDispatchNextTrain()
}