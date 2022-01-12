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
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: s1
    var p1: s2
  }
  struct s5 {
    var p0: [[s0]]
  }
  struct s8 {
    var p0: [s5]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s8, _ v2: Double) -> Double {
    let v8: [s5] = v1.p0
    let v4: s5 = v8[2]
    let v7: [[s0]] = v4.p0
    var v11: Double = v2
    let v19: [s0] = v7[0]
    let v14: s0 = v19[0]
    let v36: [[Double]] = v14.p0
    let v26: Double = v11 * v2
    let v39: [Double] = v36[0]
    let v82: Double = v39[0]
    let v52: Double = v82 / v26
    return v52
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [[s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])]]), p1: s2(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])))
    let v1: s8 = s8(p0: [s5(p0: [[s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])]]), s5(p0: [[s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]]), s5(p0: [[s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]])], p1: [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])])
    let v2: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
