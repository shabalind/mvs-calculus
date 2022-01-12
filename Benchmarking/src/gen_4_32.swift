  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: s0
  }
  struct s6 {
    var p0: [s0]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: Double) -> Double {
    let v9: s6 = v0[0]
    let v3: s1 = v9.p1
    let v4: Double = v1 * v1
    let v5: s6 = v0[0]
    let v6: s0 = v3.p2
    let v10: [[Double]] = v6.p0
    let v11: s1 = v5.p1
    let v16: [Double] = v10[0]
    let v49: s0 = v11.p2
    let v24: [[Double]] = v49.p1
    let v32: Double = v1 + v4
    let v60: Double = v16[0]
    let v45: [Double] = v24[1]
    let v97: Double = v45[0]
    let v81: Double = v60 + v32
    let v100: Double = v97 - v81
    return v100
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])], p1: s1(p0: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), p1: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]], p2: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])))]
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
