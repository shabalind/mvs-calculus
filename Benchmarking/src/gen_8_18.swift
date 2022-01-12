  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f55(_ v0: s1, _ v1: [s0]) -> [s0] {
    let v10: [s0] = v0.p0
    let v15: s1 = s1(p0: v10, p1: v1)
    let v57: [s0] = v15.p0
    return v57
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [s1], _ v2: [s1], _ v3: Double) -> Double {
    let v5: [s0] = v0.p0
    let v9: [s0] = f55(v0, v5)
    let v4: s0 = v9[0]
    let v22: [[Double]] = v4.p1
    let v30: [Double] = v22[0]
    let v45: Double = v30[0]
    return v45
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], p1: [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])])
    let v1: [s1] = [s1(p0: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])])]
    let v2: [s1] = [s1(p0: [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])]), s1(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])], p1: [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])])]
    let v3: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
