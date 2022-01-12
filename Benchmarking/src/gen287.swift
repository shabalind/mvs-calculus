  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v7: s2 = v0[0]
    let v5: [s0] = v7.p0
    let v2: s0 = v5[1]
    let v12: [[Double]] = v2.p1
    let v10: [[Double]] = v2.p1
    let v26: [[Double]] = v2.p1
    let v92: [Double] = v12[1]
    let v90: Double = v92[0]
    let v217: [Double] = v26[0]
    let v127: [Double] = v10[1]
    let v124: Double = v127[0]
    let v145: Double = v217[0]
    let v103: Double = v124 - v145
    let v161: Double = v103 + v90
    let v285: Double = v103 - v161
    return v285
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], p1: [s1(p0: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]))])]
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
