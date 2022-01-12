  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s5 {
    var p0: s0
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    let v2: [Double] = [v1, v1]
    let v4: Double = v2[1]
    let v9: Double = v1 + v4
    var v13: [Double] = v2
    let v21: Double = v13[0]
    let v18: Double = v2[0]
    v13[0] = v18
    v13[1] = v4
    var v31: Double = v21
    v13[0] = v4
    v13[1] = v4
    v13[0] = v18
    var v77: Double = v4
    v13[0] = v77
    let v83: Double = v31 / v9
    return v83
  }
  func benchmark() {
    let v0: s5 = s5(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s1(p0: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], p1: [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])]))
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
