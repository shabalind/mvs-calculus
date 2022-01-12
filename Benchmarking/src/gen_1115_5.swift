  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s5 {
    var p0: [s0]
    var p1: s0
  }
  struct s8 {
    var p0: [s0]
    var p1: [s5]
  }
  func f40(_ v0: Double) -> Double {
    var v4: Double = v0
    var v7: Double = v4
    v7 = v0
    var v6: Double = v0
    var v5: Double = v0
    let v2: Double = v6 + v7
    var v11: Double = v6
    let v12: [Double] = [v11, v5]
    var v14: Double = v2
    var v21: [Double] = v12
    var v25: [Double] = v21
    let v41: Double = v25[1]
    v25[1] = v14
    return v41
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s8, _ v2: Double) -> Double {
    let v9: s0 = v0.p0
    let v60: [[Double]] = v9.p0
    var v31: Double = v2
    let v42: [Double] = v60[0]
    let v45: Double = f40(v31)
    let v82: Double = v42[0]
    var v32: [Double] = v42
    v32[0] = v82
    var v55: [Double] = v32
    let v87: Double = v55[0]
    let v86: Double = f40(v45)
    v32[0] = v86
    v32[0] = v2
    return v87
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])], [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])]])
    let v1: s8 = s8(p0: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], p1: [s5(p0: [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])], p1: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])), s5(p0: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]), s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])], p1: s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]))])
    let v2: Double = 55.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 55.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
