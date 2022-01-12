  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v6: s0 = v0.p1
    let v12: [[Double]] = v6.p0
    let v8: [Double] = v12[2]
    let v2: Double = v8[0]
    var v10: Double = v1
    let v28: [Double] = v12[2]
    let v25: Double = v28[0]
    let v20: Double = v10 / v25
    let v80: Double = v8[0]
    v10 = v2
    let v152: Double = v20 / v80
    return v152
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]))
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
