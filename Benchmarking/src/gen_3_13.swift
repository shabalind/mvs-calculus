  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: s2, _ v2: Double) -> Double {
    let v8: s2 = v0[1]
    let v7: [s0] = v8.p1
    let v12: Double = v2 + v2
    let v49: s0 = v7[0]
    let v25: [[Double]] = v49.p1
    let v48: [Double] = v25[0]
    var v106: Double = v12
    var v194: [Double] = v48
    let v64: Double = v194[0]
    let v142: Double = v64 / v106
    var v91: Double = v106
    v194[0] = v142
    let v304: [Double] = [v12, v106, v91, v2, v142]
    let v81: Double = v304[4]
    return v81
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])]], p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]), s2(p0: [[s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])]], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])])]
    let v1: s2 = s2(p0: [[s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])]], p1: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])])
    let v2: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
