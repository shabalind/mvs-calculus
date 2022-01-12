  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s4 {
    var p0: [[s0]]
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    var v2: [s4] = v0
    let v5: s4 = v0[0]
    v2[0] = v5
    let v12: s4 = v2[0]
    let v11: s2 = v12.p1
    v2[0] = v12
    v2[0] = v5
    let v45: [s0] = v11.p1
    let v38: s0 = v45[1]
    let v42: [[Double]] = v38.p1
    let v65: [Double] = v42[0]
    let v81: Double = v65[0]
    return v81
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])]], p1: s2(p0: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])], p1: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])]))]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
