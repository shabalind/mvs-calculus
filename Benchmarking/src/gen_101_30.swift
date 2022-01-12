  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v6: [Double] = [v1, v1, v1, v1, v1]
    var v5: [Double] = v6
    v5[4] = v1
    var v10: [Double] = v6
    var v13: Double = v1
    v13 = v1
    v10[1] = v13
    let v44: Double = v5[4]
    v5 = v10
    var v45: Double = v1
    v10[2] = v45
    return v44
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])]]), p1: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])])]
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
