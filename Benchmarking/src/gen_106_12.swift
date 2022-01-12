  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s2], _ v2: Double) -> Double {
    let v7: s0 = v0[0]
    let v6: [[Double]] = v7.p0
    let v8: [Double] = v6[1]
    var v4: [[Double]] = v6
    let v20: Double = v8[0]
    v4[1] = v8
    let v50: [Double] = v4[0]
    let v71: [Double] = v4[1]
    let v75: Double = v50[0]
    v4[0] = v71
    var v150: Double = v75
    let v55: Double = v20 - v150
    return v55
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])]
    let v1: [s2] = [s2(p0: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), p1: [s1(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]))])]
    let v2: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
