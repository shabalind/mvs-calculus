  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
    var p2: [[s0]]
    var p3: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v2: s1 = v0.p0
    let v7: [s0] = v2.p0
    var v11: [s0] = v7
    var v4: [s0] = v11
    let v8: s0 = v11[2]
    v4[2] = v8
    let v9: s0 = v4[1]
    let v18: [[Double]] = v9.p1
    v11[1] = v8
    let v22: [Double] = v18[0]
    let v35: [[Double]] = v9.p0
    v4 = v11
    var v16: s0 = v9
    let v23: Double = v22[0]
    let v19: [Double] = v35[1]
    let v27: Double = v22[0]
    let v34: Double = v19[0]
    v11[0] = v16
    let v29: [s0] = v2.p1
    let v46: s0 = v29[1]
    var v57: [s0] = v4
    v11[2] = v46
    let v117: Double = v23 - v34
    v4 = v57
    v57[1] = v8
    let v188: Double = v117 - v27
    v16.p0 = v35
    return v188
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])], p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], p2: [[s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])], [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])], [s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])]], p3: [[s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])]]), p1: [s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])])
    let v1: Double = 50.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 50.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
