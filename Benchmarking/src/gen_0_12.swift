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
    var p0: s1
    var p1: s0
    var p2: [s0]
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v7: s2 = v0[0]
    let v2: [Double] = [v1, v1, v1]
    let v37: s1 = v7.p0
    let v49: Double = v2[2]
    let v16: s0 = v37.p0
    let v22: [[Double]] = v16.p1
    let v60: [Double] = v22[1]
    var v69: Double = v49
    var v23: [Double] = v60
    let v97: Double = v23[0]
    v23[0] = v69
    return v97
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])), p1: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p2: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])])]
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
