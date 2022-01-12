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
  func f0(_ v0: s1, _ v1: s0, _ v2: s1, _ v3: s0, _ v4: Double) -> Double {
    var v18: Double = v4
    v18 = v4
    let v12: [Double] = [v4, v18, v4, v18]
    let v17: Double = v12[2]
    var v34: Double = v18
    let v90: Double = v12[0]
    var v63: [Double] = v12
    v63[0] = v90
    var v155: [Double] = v63
    let v183: Double = v155[3]
    v63[1] = v34
    let v192: Double = v183 / v17
    return v192
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0]]))
    let v1: s0 = s0(p0: [[6.0]], p1: [[7.0]])
    let v2: s1 = s1(p0: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0]]))
    let v3: s0 = s0(p0: [[14.0]], p1: [[15.0]])
    let v4: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
