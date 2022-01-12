  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s0], _ v2: Double) -> Double {
    let v4: [[Double]] = v0.p0
    let v6: [[Double]] = v0.p2
    let v9: [Double] = v4[0]
    let v24: [[Double]] = v0.p2
    let v10: [Double] = v6[1]
    let v21: Double = v9[0]
    let v23: Double = v10[0]
    let v42: [Double] = v24[1]
    let v59: Double = v42[0]
    let v34: [Double] = [v21, v2, v21, v23, v59]
    let v37: Double = v34[3]
    return v37
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0]], p2: [[3.0], [4.0]])
    let v1: [s0] = [s0(p0: [[5.0]], p1: [[6.0], [7.0]], p2: [[8.0], [9.0]]), s0(p0: [[10.0]], p1: [[11.0], [12.0]], p2: [[13.0], [14.0]])]
    let v2: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
