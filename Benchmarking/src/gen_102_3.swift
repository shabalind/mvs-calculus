  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: Double
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    var v7: Double = v1
    let v5: [Double] = [v1, v7, v1, v1]
    var v8: Double = v1
    let v11: Double = v5[0]
    let v45: s2 = v0[0]
    let v40: [[Double]] = [v5, v5, v5]
    let v48: Double = v45.p1
    v7 = v11
    let v81: Double = v48 / v8
    v7 = v81
    let v114: [Double] = v40[2]
    let v124: Double = v114[0]
    return v124
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], p1: 15.0)]
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
