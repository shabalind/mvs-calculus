  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [s0]
    var p3: s0
  }
  struct s2 {
    var p0: s1
  }
  struct s4 {
    var p0: s0
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v7: s4 = v0[0]
    var v5: Double = v1
    let v22: s0 = v7.p0
    let v57: Double = v1 + v5
    let v46: [[Double]] = v22.p1
    let v23: [Double] = v46[0]
    let v31: Double = v23[0]
    var v112: Double = v31
    let v197: Double = v57 - v112
    let v61: Double = v31 / v197
    let v76: Double = v61 * v197
    return v76
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s2(p0: s1(p0: s0(p0: [[2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0]]), p2: [s0(p0: [[6.0]], p1: [[7.0]]), s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])], p3: s0(p0: [[12.0]], p1: [[13.0]]))))]
    let v1: Double = 14.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 14.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
