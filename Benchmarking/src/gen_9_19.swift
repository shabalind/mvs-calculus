  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s2]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v2: [s0] = v0.p1
    var v5: Double = v1
    let v13: s0 = v2[0]
    var v37: Double = v5
    let v28: [[Double]] = v13.p1
    let v102: [Double] = v28[2]
    var v39: [Double] = v102
    let v48: Double = v37 + v5
    let v58: Double = v39[0]
    let v89: Double = v5 + v58
    let v82: Double = v89 + v1
    let v83: Double = v58 - v82
    v39[0] = v48
    return v83
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])), s2(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]))], p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])])
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
