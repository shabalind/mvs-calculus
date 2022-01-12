  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v8: [[Double]] = v0.p0
    let v14: [Double] = v8[0]
    let v10: Double = v1 * v1
    var v16: [Double] = v14
    v16[0] = v1
    let v17: Double = v16[0]
    let v38: Double = v14[0]
    v16[0] = v38
    let v122: Double = v10 * v17
    let v91: Double = v1 + v122
    return v91
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0, 4.0], p2: [[5.0], [6.0], [7.0]], p3: [[8.0], [9.0]], p4: [[10.0]])
    let v1: Double = 11.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 11.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
