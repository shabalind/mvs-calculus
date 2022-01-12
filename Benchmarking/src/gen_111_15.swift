  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  func f87(_ v0: Double) -> Double {
    let v4: Double = v0 + v0
    var v1: Double = v4
    let v3: [Double] = [v4, v4, v0, v4, v1]
    let v2: Double = v3[2]
    let v6: Double = v3[0]
    var v10: Double = v6
    var v11: [Double] = v3
    v11[4] = v10
    v11[0] = v1
    v11[2] = v2
    v1 = v4
    let v28: Double = v11[4]
    return v28
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s1, _ v2: s0, _ v3: [s0], _ v4: Double) -> Double {
    var v22: Double = v4
    var v32: Double = v4
    let v73: Double = f87(v32)
    let v51: Double = v73 - v32
    v32 = v22
    return v51
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])
    let v1: s1 = s1(p0: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), p1: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]])
    let v2: s0 = s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])
    let v3: [s0] = [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])]
    let v4: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
