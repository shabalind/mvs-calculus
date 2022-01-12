  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [[Double]]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    let v3: [s2] = v0[0]
    let v5: s2 = v3[0]
    let v10: s0 = v5.p1
    let v2: [[Double]] = v10.p0
    var v18: [[Double]] = v2
    let v25: [Double] = v18[0]
    let v35: Double = v25[0]
    v18[1] = v25
    let v43: Double = v25[0]
    let v100: Double = v43 + v35
    let v92: Double = v35 + v100
    return v92
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: s1(p0: [[0.0]], p1: s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0]], p2: [[5.0]])), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0]], p2: [[10.0]]))], [s2(p0: s1(p0: [[11.0]], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]], p2: [[16.0]])), p1: s0(p0: [[17.0], [18.0], [19.0]], p1: [[20.0]], p2: [[21.0]]))]]
    let v1: Double = 22.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 22.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
