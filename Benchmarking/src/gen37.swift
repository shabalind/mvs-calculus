  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  struct s6 {
    var p0: s2
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    let v4: s0 = v0.p1
    var v6: s0 = v4
    let v13: [[Double]] = v4.p0
    let v7: [Double] = v13[1]
    v6.p0 = v13
    let v9: [[Double]] = v6.p0
    var v18: [[Double]] = v9
    let v11: [[Double]] = v6.p0
    var v14: [[Double]] = v9
    v6.p0 = v11
    var v23: [[Double]] = v18
    let v41: Double = v7[0]
    let v31: [Double] = v13[0]
    var v22: [Double] = v7
    v6.p0 = v14
    let v21: [[Double]] = v4.p0
    v23[2] = v31
    v22[0] = v41
    v22 = v7
    let v33: [Double] = v18[2]
    v18[0] = v31
    v23[2] = v22
    v6.p0 = v13
    v6.p0 = v21
    v18[2] = v22
    let v26: [Double] = v23[1]
    v18[2] = v26
    let v61: Double = v33[0]
    v23[0] = v33
    return v61
  }
  func benchmark() {
    let v0: s6 = s6(p0: s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s1(p0: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], p1: [[s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])]])), p1: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]))
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
