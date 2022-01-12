  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s4 {
    var p0: s1
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v8: [s1] = v0.p1
    let v13: s1 = v8[1]
    let v11: s0 = v13.p1
    let v16: [[Double]] = v11.p1
    let v10: [Double] = v16[1]
    let v20: [Double] = v16[0]
    let v36: Double = v10[0]
    var v29: [Double] = v20
    v29[0] = v36
    let v50: Double = v29[0]
    return v50
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]])], p1: s0(p0: [[6.0]], p1: [[7.0], [8.0]])), p1: [s1(p0: [s0(p0: [[9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]])], p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]])), s1(p0: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]])], p1: s0(p0: [[24.0]], p1: [[25.0], [26.0]]))])
    let v1: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
