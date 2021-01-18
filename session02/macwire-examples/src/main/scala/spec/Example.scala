package macwire.spec

case class PointSwitcher()

case class TrainCarCoupler()

case class TrainShunter(pointSwitcher: PointSwitcher,
  trainCarCoupler: TrainCarCoupler)

case class CraneController()

case class TrainLoader(craneController: CraneController,
  pointSwitcher: PointSwitcher)

case class TrainDispatch()

class TrainStation(trainShunter: TrainShunter,
  trainLoader: TrainLoader,
  trainDispatch: TrainDispatch) {

  def prepareAndDispatchNextTrain() = {
    println(trainShunter) 
    println(trainLoader) 
    println(trainDispatch)
  }
}
